package typings.unionToInheritance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foo2[U, V]
  extends Legal2[V, U]
     with Legal3[U, js.Any, V]
     with _Test[U, js.Any, V] {
  var u: U = js.native
  var v: V = js.native
}

object Foo2 {
  @scala.inline
  def apply[U, V](u: U, v: V): Foo2[U, V] = {
    val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Foo2[U, V]]
  }
  @scala.inline
  implicit sealed class Sugar[U, V] (x: Foo2[U, V]) {
    @scala.inline
    def duplicate: Foo2[U, V] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.unionToInheritance.Foo2[U, V]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (Foo2[U, V]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.unionToInheritance.Foo2[U, V] with T]
    @scala.inline
    def withU(u: U): Foo2[U, V] = js.Dynamic.global.Object.assign(js.Dynamic.literal(u = u.asInstanceOf[js.Any]), x).asInstanceOf[typings.unionToInheritance.Foo2[U, V]]
    @scala.inline
    def withV(v: V): Foo2[U, V] = js.Dynamic.global.Object.assign(js.Dynamic.literal(v = v.asInstanceOf[js.Any]), x).asInstanceOf[typings.unionToInheritance.Foo2[U, V]]
  }
  
}

