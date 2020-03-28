package typings.componentstest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B extends Props {
  var bCallback: js.UndefOr[js.Function0[String]] = js.native
  var bMember: String = js.native
}

object B {
  @scala.inline
  def apply(bMember: String, bCallback: () => String = null): B = {
    val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
    if (bCallback != null) __obj.updateDynamic("bCallback")(js.Any.fromFunction0(bCallback))
    __obj.asInstanceOf[B]
  }
  @scala.inline
  implicit sealed class Sugar (x: B) {
    @scala.inline
    def duplicate: B = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.componentstest.mod.B]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): B with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.componentstest.mod.B with T]
    @scala.inline
    def withBMember(bMember: String): B = js.Dynamic.global.Object.assign(js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any]), x).asInstanceOf[typings.componentstest.mod.B]
    @scala.inline
    def withBCallback(bCallback: () => String): B = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bCallback != null) obj.updateDynamic("bCallback")(js.Any.fromFunction0(bCallback))
      obj.asInstanceOf[typings.componentstest.mod.B]
    }
  }
  
}

