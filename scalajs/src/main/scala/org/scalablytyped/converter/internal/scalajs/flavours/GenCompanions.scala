package org.scalablytyped.converter.internal
package scalajs
package flavours

import org.scalablytyped.converter.internal.scalajs.flavours.FindProps.Res

/**
  * Add a companion object to `@ScalaJSDefined` traits for creating instances with method syntax
  */
final class GenCompanions(memberToProp: MemberToProp, findProps: FindProps) extends TreeTransformation {
  override def leaveContainerTree(scope: TreeScope)(container: ContainerTree): ContainerTree =
    // Native JS objects cannot contain inner Scala traits, classes or objects (i.e., not extending js.Any)
    if (scope.stack.exists { case mod: ModuleTree => mod.isNative; case _ => false })
      container
    else {
      def nameConflict(name: Name): Boolean =
        container.index.getOrElse(name, Empty) exists {
          case _: ContainerTree => true
          case _ => false
        }

      container.withMembers(container.members.flatMap {
        case cls: ClassTree if !nameConflict(cls.name) =>
          val clsRef = TypeRef(cls.codePath, TypeParamTree.asTypeArgs(cls.tparams), NoComments)

          findProps.forClassTree(
            cls                = cls,
            scope              = scope / cls,
            memberToProp       = memberToProp,
            maxNum             = FindProps.MaxParamsForMethod,
            acceptNativeTraits = false,
            keep               = FindProps.keepAll,
            selfRef            = clsRef,
          ) match {
            case Res.Error(_) =>
              IArray(cls)

            case Res.One(_, props) =>
              val modOpt: Option[ModuleTree] =
                generateCreator(Name.APPLY, props.yes, cls.codePath, cls.tparams)
                  .map { method =>
                    ModuleTree(Empty, cls.name, Empty, IArray(method), NoComments, cls.codePath, isOverride = false)
                  }
                  .filter(ensureNotTooManyStrings(scope))
                  .map(mod => mod.copy(members = mod.members :+ sugarClass(cls, clsRef, props, mod)))

              IArray.fromOptions(Some(cls), modOpt)

            case Res.Many(paramsMap) =>
              val methods: IArray[MethodTree] =
                IArray.fromTraversable(paramsMap.flatMap {
                  case (propsRef, params) => generateCreator(propsRef.name, params.yes, cls.codePath, cls.tparams)
                })

              val modOpt: Option[ModuleTree] =
                Some(ModuleTree(Empty, cls.name, Empty, methods, NoComments, cls.codePath, isOverride = false))
                  .filter(ensureNotTooManyStrings(scope))

              IArray.fromOptions(Some(cls), modOpt)
          }

        case other => IArray(other)
      })
    }

  private def sugarClass(cls: ClassTree, clsRef: TypeRef, props: FindProps.Filtered[Unit], mod: ModuleTree) = {
    val target           = Name("x")
    val sugarClsName     = Name("Sugar")
    val sugarClsCodePath = mod.codePath + sugarClsName
    val formattedClsRef  = Printer.formatTypeRef(0)(clsRef)

    val combineMember = {
      val otherTypeName = Name("T")
      val otherType     = TypeRef(otherTypeName)
      val otherName     = Name("other")
      val combineName   = Name("combine")
      val impl = MemberImpl.Custom(
        s"""js.Dynamic.global.Object.assign(js.Dynamic.literal(), ${target.unescaped}, ${otherName.unescaped}.asInstanceOf[js.Any]).asInstanceOf[$formattedClsRef with ${otherTypeName.unescaped}]""",
      )

      MethodTree(
        annotations = IArray(Annotation.Inline),
        level       = ProtectionLevel.Default,
        name        = combineName,
        tparams     = IArray(TypeParamTree(otherTypeName, Some(TypeRef.Any), NoComments)),
        params      = IArray(IArray(ParamTree(otherName, false, otherType, None, NoComments))),
        impl        = impl,
        resultType  = TypeRef.Intersection(IArray(clsRef, otherType)),
        isOverride  = false,
        comments    = NoComments,
        codePath    = sugarClsCodePath + combineName,
      )
    }

    val duplicateMember = {
      val name = Name("duplicate")
      val impl = MemberImpl.Custom(
        s"""js.Dynamic.global.Object.assign(js.Dynamic.literal(), ${target.unescaped}).asInstanceOf[$formattedClsRef]""",
      )

      MethodTree(
        annotations = IArray(Annotation.Inline),
        level       = ProtectionLevel.Default,
        name        = name,
        tparams     = Empty,
        params      = Empty,
        impl        = impl,
        resultType  = clsRef,
        isOverride  = false,
        comments    = NoComments,
        codePath    = sugarClsCodePath + name,
      )
    }

    val sugarMembers: IArray[MethodTree] =
      props.yes.flatMap {
        case Prop(ParamTree(propName, _, tpe, _, _), asString, _) =>
          val variants: Map[String, TypeRef] = {
            def nameFor(tpe: TypeRef): String =
              tpe match {
                case tr if Name.Internal(tr.name) => tr.targs.map(nameFor).mkString("")
                case other                        => other.name.unescaped
              }

            val allTypes = tpe match {
              case TypeRef.Union(types) => types
              case other                => IArray(other)
            }

            allTypes.groupBy(nameFor).map {
              case (name, IArray.exactlyOne(one)) => name -> one
              case (name, more)                   => name -> TypeRef.Union(more, sort = true)
            }
          }

          val iterable = variants map {
            case (_, TypeRef.undefined) =>
              val name = Name(s"with${propName.unescaped.capitalize}Undefined")
              val impl = MemberImpl.Custom(
                s"""{
                   |  val obj = duplicate.asInstanceOf[js.Dynamic]
                   |  js.special.delete(obj, "${propName.unescaped}")
                   |  obj.asInstanceOf[$formattedClsRef]
                   |}""".stripMargin,
              )
              MethodTree(
                annotations = IArray(Annotation.Inline),
                level       = ProtectionLevel.Default,
                name        = name,
                tparams     = Empty,
                params      = Empty,
                impl        = impl,
                resultType  = clsRef,
                isOverride  = false,
                comments    = NoComments,
                codePath    = sugarClsCodePath + name,
              )

            case (variantName, tpe) =>
              val name =
                if (variants.size === 1 || (variants.size === 2 && variants.exists(_._2 === TypeRef.undefined)))
                  Name(s"with${propName.unescaped.capitalize}")
                else
                  Name(s"with${propName.unescaped.capitalize}${variantName.capitalize}")

              val param = ParamTree(propName, isImplicit = false, tpe, None, NoComments)
              val impl = asString match {
                case Left(value) =>
                  MemberImpl.Custom(
                    s"""js.Dynamic.global.Object.assign(js.Dynamic.literal($value), x).asInstanceOf[$formattedClsRef]""",
                  )
                case Right(mutateObject) =>
                  MemberImpl.Custom(
                    s"""{
                       |  val obj = duplicate.asInstanceOf[js.Dynamic]
                       |  ${mutateObject("obj")}
                       |  obj.asInstanceOf[$formattedClsRef]
                       |}""".stripMargin,
                  )
              }
              MethodTree(
                annotations = IArray(Annotation.Inline),
                level       = ProtectionLevel.Default,
                name        = name,
                tparams     = Empty,
                params      = IArray(IArray(param)),
                impl        = impl,
                resultType  = clsRef,
                isOverride  = false,
                comments    = NoComments,
                codePath    = sugarClsCodePath + name,
              )
          }
          IArray.fromTraversable(iterable)
      }

    val sugarCtor = CtorTree(
      ProtectionLevel.Default,
      IArray(ParamTree(target, isImplicit = false, clsRef, None, NoComments)),
      NoComments,
    )

    ClassTree(
      isImplicit  = true,
      annotations = IArray(Annotation.Inline),
      name        = Name("Sugar"),
      tparams     = cls.tparams,
      parents     = Empty,
      ctors       = IArray(sugarCtor),
      members     = IArray(duplicateMember, combineMember) ++ sugarMembers,
      classType   = ClassType.Class,
      isSealed    = true,
      comments    = NoComments,
      codePath    = sugarClsCodePath,
    )
  }

  /**
    * Avoid errors like this
    * [E] [E-1] Error while emitting typingsJapgolly/csstype/csstypeMod/StandardLonghandPropertiesHyphenFallback$
    * [E]       UTF8 string too large
    */
  def ensureNotTooManyStrings(scope: TreeScope)(mod: ModuleTree): Boolean = {
    val MaxWeight = 32768 // an estimate. If you see the error again, decrease this

    object Dealias extends TreeTransformation {
      override def leaveTypeRef(scope: TreeScope)(s: TypeRef): TypeRef = FollowAliases(scope)(s)
    }

    var stringLength = 0

    TreeTraverse.foreach(Dealias.visitModuleTree(scope)(mod)) {
      case name: QualifiedName =>
        name.parts.foreach(p => stringLength += p.unescaped.length)
      case _ => ()
    }

    stringLength < MaxWeight
  }

  def generateCreator(
      name:        Name,
      props:       IArray[Prop],
      typeCp:      QualifiedName,
      typeTparams: IArray[TypeParamTree],
  ): Option[MethodTree] =
    props match {
      case Empty => None
      case props =>
        val (optionals, inLiterals, Empty) = props.partitionCollect2(
          { case Prop(_, Right(f), _)  => f },
          { case Prop(_, Left(str), _) => str },
        )
        val typeName = typeCp.parts.last

        val ret = TypeRef(QualifiedName(IArray(typeName)), TypeParamTree.asTypeArgs(typeTparams), NoComments)

        Some(
          MethodTree(
            IArray(Annotation.Inline),
            ProtectionLevel.Default,
            name,
            typeTparams,
            IArray(props.map(_.parameter)),
            MemberImpl.Custom(s"""{
                  |  val __obj = js.Dynamic.literal(${inLiterals.mkString(", ")})
                  |${optionals.map(f => "  " + f("__obj")).mkString("\n")}
                  |  __obj.asInstanceOf[${Printer.formatTypeRef(0)(ret)}]
                  |}""".stripMargin),
            ret,
            isOverride = false,
            NoComments,
            typeCp + name,
          ),
        )
    }
}
