package org.scalablytyped.converter.internal
package scalajs
package flavours

import org.scalablytyped.converter.internal.scalajs.flavours.CastConversion.TypeRewriterCast
import org.scalablytyped.converter.internal.scalajs.transforms.{Adapter, CleanIllegalNames}

object FlavourImpl {

  trait ReactFlavourImpl extends FlavourImpl {
    lazy val reactNames =
      new ReactNames(outputPkg)
    lazy val identifyComponents =
      new IdentifyReactComponents(reactNames)

    def involvesReact(scope: TreeScope): Boolean = {
      val react = Name("react")
      scope.libName === react || scope.root.dependencies.contains(react)
    }
  }

  case class Normal(
      shouldGenerateComponents: Boolean,
      shouldUseScalaJsDomTypes: Boolean,
      outputPkg:                Name,
  ) extends ReactFlavourImpl {
    val genComponentsOpt = if (shouldGenerateComponents) Some(new GenReactFacadeComponents(reactNames)) else None

    val conversions: Option[IArray[CastConversion]] =
      if (shouldUseScalaJsDomTypes)
        Some(scalaJsDomNames.AllExceptDeprecated)
      else None

    override val dependencies: Set[Dep] =
      Set(Versions.runtime) ++ (if (shouldUseScalaJsDomTypes) Set(Versions.scalaJsDom) else Set.empty)

    val genCompanions: GenCompanions =
      new GenCompanions(MemberToProp.Default, findProps)

    final override def rewrittenTree(scope: TreeScope, tree: PackageTree): PackageTree = {
      val withComponents: PackageTree =
        genComponentsOpt match {
          case Some(genComponents) if involvesReact(scope) =>
            val components: IArray[Component] =
              identifyComponents.oneOfEach(scope / tree, tree)

            Adapter(scope)((t, s) => genComponents(s, t, components))(tree)
          case _ => tree
        }

      val withRewrittenTypes = conversions match {
        case Some(conversions) => TypeRewriterCast(conversions).visitPackageTree(scope)(withComponents)
        case _                 => withComponents
      }

      genCompanions.visitPackageTree(scope)(withRewrittenTypes)
    }
  }

  case class SlinkyNative(outputPkg: Name) extends ReactFlavourImpl {

    override val dependencies: Set[Dep] =
      Set(Versions.runtime, Versions.slinkyNative, Versions.scalaJsDom)

    val ToSlinkyTypes = SlinkyTypeConversions(scalaJsDomNames, reactNames, isWeb = false)
    val memberToProp: MemberToProp =
      (scope, tree) =>
        MemberToProp
          .Default(scope, ToSlinkyTypes.visitMemberTree(scope)(tree))
          .map(prop => prop.copy(original = Right(tree)))

    val gen = new GenSlinkyComponents(GenSlinkyComponents.Native(()), ToSlinkyTypes, memberToProp, findProps)

    final override def rewrittenTree(scope: TreeScope, tree: PackageTree): PackageTree = {
      val withComponents: PackageTree =
        if (involvesReact(scope)) {
          val components: IArray[Component] =
            identifyComponents.oneOfEach(scope / tree, tree)
          Adapter(scope)((t, s) => gen(s, t, components))(tree)
        } else tree

      val withRewrittenTypes = ToSlinkyTypes.visitPackageTree(scope)(withComponents)
      new GenCompanions(memberToProp, findProps).visitPackageTree(scope)(withRewrittenTypes)
    }
  }

  case class Japgolly(outputPkg: Name) extends ReactFlavourImpl {
    val gen = new GenJapgollyComponents(reactNames, scalaJsDomNames, findProps)

    override val dependencies: Set[Dep] =
      Set(Versions.runtime, Versions.scalajsReact)

    final override def rewrittenTree(scope: TreeScope, tree: PackageTree): PackageTree = {
      val withComponents: PackageTree =
        if (involvesReact(scope)) {
          val components: IArray[Component] =
            identifyComponents.oneOfEach(scope / tree, tree)
          Adapter(scope)((t, s) => gen(s, t, components))(tree)
        } else tree

      val withRewrittenTypes = TypeRewriterCast(gen.conversions).visitPackageTree(scope)(withComponents)
      new GenCompanions(gen.memberToProp, findProps).visitPackageTree(scope)(withRewrittenTypes)
    }
  }
}

sealed trait FlavourImpl {
  def rewrittenTree(s: TreeScope, tree: PackageTree): PackageTree
  def dependencies: Set[Dep]
  val outputPkg: Name

  lazy val stdNames =
    new QualifiedName.StdNames(outputPkg)
  lazy val scalaJsDomNames =
    new ScalaJsDomNames(stdNames)
  lazy val findProps =
    new FindProps(new CleanIllegalNames(outputPkg))

  override val toString = getClass.getSimpleName
}
