package org.scalablytyped.converter.internal
package scalajs
package flavours

final case class Prop(
    parameter: ParamTree,
    asString:  Either[ExprTree, Name => ExprTree],
    /* should be unaffected by `CastConversion` rewrites */
    original: Either[TypeRef, MemberTree],
) {
  def isOptional = parameter.default =/= NotImplemented
}

object Prop {
  implicit val PropOrdering: Ordering[Prop] =
    Ordering.by((p: Prop) => (p.isOptional, p.parameter.name))
}
