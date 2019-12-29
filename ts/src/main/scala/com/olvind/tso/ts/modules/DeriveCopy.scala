package com.olvind.tso
package ts
package modules

import com.olvind.tso.ts.CodePath.{HasPath, NoPath}
import com.olvind.tso.ts.transforms.SetCodePath

object DeriveCopy {
  def apply(x: TsNamedDecl, ownerCp: CodePath, _rename: Option[TsIdentSimple]): Seq[TsNamedDecl] = {
    val rename = _rename.filter(r => x.name =/= r) // I think this only happens with `default`, but as might as well make sure

    //keep as def, we need to let `TsDeclNamespace` through without a codePath as it might be synthetic
    def origin = x.codePath.forceHasPath.codePath

    def codePathFor(name: TsIdent) = ownerCp match {
      case NoPath => x.codePath
      case hasPath: HasPath => hasPath / name
    }

    (x, x.name, x.codePath, ownerCp) match {
      case (x: TsDeclFunction, _, _, ownerCodePath: CodePath.HasPath) =>
        List(SetCodePath.visitTsDeclFunction(ownerCodePath)(rename.foldLeft(x)(_ withName _)))

      case (x: TsDeclVar, _, _, ownerCodePath: CodePath.HasPath) =>
        List(SetCodePath.visitTsDeclVar(ownerCodePath)(rename.foldLeft(x)(_ withName _)))

      case (x, _, xCp: HasPath, ownerCp: HasPath)
          if xCp.codePath.parts.length === ownerCp.codePath.parts.length + 1 &&
            xCp.codePath.parts.startsWith(ownerCp.codePath.parts) &&
            rename.isEmpty =>
        List(x)

      case (x: TsDeclModule, _, _, ownerCp) if rename.isDefined =>
        List(updatedContainer(ownerCp, x.withName(rename.get)))
      case (x: TsDeclModule, _, _, ownerCp) =>
        List(updatedContainer(ownerCp, x))

      case (x: TsAugmentedModule, name, _, ownerCp) if rename.isEmpty =>
        List(updatedContainer(ownerCp, x.copy(codePath = codePathFor(name))))
      case (_: TsAugmentedModule, _, _, _) if rename.isEmpty =>
        Nil

      case (x, origName: TsIdentSimple, _, ownerCp) =>
        val name = rename getOrElse origName

        val derived = x match {
          case x: TsDeclClass =>
            List(
              x.copy(
                name = name,
                members = x.members.collect {
                  case c: TsMemberCtor => c
                  case c @ TsMemberFunction(_, _, TsIdent.constructor, _, _, _, _) => c
                  case x: TsMemberProperty if x.isStatic => x
                  case x: TsMemberFunction if x.isStatic => x
                },
                declared   = true,
                implements = Nil,
                parent     = Some(TsTypeRef(NoComments, origin, TsTypeParam.asTypeArgs(x.tparams))),
                codePath   = codePathFor(name),
              ),
            )

          case x: TsDeclInterface =>
            List(
              TsDeclTypeAlias(
                comments = Comments(CommentData(Markers.IsTrivial)),
                declared = true,
                name     = name,
                tparams  = x.tparams,
                alias    = TsTypeRef(NoComments, origin, TsTypeParam.asTypeArgs(x.tparams)),
                codePath = codePathFor(name),
              ),
            )

          case x: TsDeclEnum =>
            List(
              x.copy(
                name         = name,
                isValue      = true,
                exportedFrom = x.exportedFrom orElse Some(TsTypeRef(NoComments, origin, Nil)),
                codePath     = codePathFor(name),
              ),
            )

          case x: TsDeclVar =>
            List(x.copy(name = name, codePath = codePathFor(name)))

          case x: TsDeclFunction =>
            List(x.copy(name = name, codePath = codePathFor(name)))

          case x: TsDeclNamespace =>
            List(updatedContainer(ownerCp, x.copy(name = name, codePath = codePathFor(name))))

          case x: TsDeclTypeAlias =>
            List(
              TsDeclTypeAlias(
                Comments(CommentData(Markers.IsTrivial)),
                declared = false,
                name,
                x.tparams,
                TsTypeRef(NoComments, origin, TsTypeParam.asTypeArgs(x.tparams)),
                codePathFor(name),
              ),
            )
        }

        derived
      case other =>
        sys.error(s"Unexpected: ${other.toString().take(200)}")
    }
  }

  def updatedContainer(ownerCp: CodePath, x: TsContainer with TsNamedDecl): TsNamedDecl = {
    /* For this to be correct we convert nested members with old codePath, then recursively update it afterwards */
    val newMembers: Seq[TsContainerOrDecl] =
      x.members.flatMap {
        case m: TsNamedDecl =>
          apply(m, x.codePath, None)
        case other => List(other)
      }

    (ownerCp, x.withMembers(newMembers)) match {
      case (p:                   HasPath, xx: TsNamedDecl) => SetCodePath.enterTsNamedDecl(p)(xx)
      case (CodePath.NoPath, xx: TsNamedDecl) => xx
      case wrong => sys.error(s"Unexpected $wrong")
    }
  }
}
