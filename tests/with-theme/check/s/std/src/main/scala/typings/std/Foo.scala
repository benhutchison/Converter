package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foo extends js.Object {
  var f: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
}

object Foo {
  @scala.inline
  def apply(f: /* n */ Double => String = null): Foo = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(js.Any.fromFunction1(f))
    __obj.asInstanceOf[Foo]
  }
  @scala.inline
  implicit sealed class Sugar (x: Foo) {
    @scala.inline
    def duplicate: Foo = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.std.Foo]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Foo with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.std.Foo with T]
    @scala.inline
    def withF(f: /* n */ Double => String): Foo = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (f != null) obj.updateDynamic("f")(js.Any.fromFunction1(f))
      obj.asInstanceOf[typings.std.Foo]
    }
  }
  
}

