package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* let's pretend */
@js.native
trait TwoFoo[Foo1, Foo2] extends js.Object {
  var value: Foo1 = js.native
}

object TwoFoo {
  @scala.inline
  def apply[Foo1, Foo2](value: Foo1): TwoFoo[Foo1, Foo2] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwoFoo[Foo1, Foo2]]
  }
  @scala.inline
  implicit sealed class Sugar[Foo1, Foo2] (x: TwoFoo[Foo1, Foo2]) {
    @scala.inline
    def duplicate: TwoFoo[Foo1, Foo2] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.std.TwoFoo[Foo1, Foo2]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (TwoFoo[Foo1, Foo2]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.std.TwoFoo[Foo1, Foo2] with T]
    @scala.inline
    def withValue(value: Foo1): TwoFoo[Foo1, Foo2] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.TwoFoo[Foo1, Foo2]]
  }
  
}

