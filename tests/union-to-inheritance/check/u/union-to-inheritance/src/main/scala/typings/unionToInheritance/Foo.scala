package typings.unionToInheritance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foo[U]
  extends Legal1[U]
     with Legal2[U, js.Any]
     with Legal3[js.Any, js.Any, U] {
  var value: U = js.native
}

object Foo {
  @scala.inline
  def apply[U](value: U): Foo[U] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Foo[U]]
  }
  @scala.inline
  implicit sealed class Sugar[U] (x: Foo[U]) {
    @scala.inline
    def duplicate: Foo[U] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.unionToInheritance.Foo[U]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Foo[U] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.unionToInheritance.Foo[U] with T]
    @scala.inline
    def withValue(value: U): Foo[U] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.unionToInheritance.Foo[U]]
  }
  
}

