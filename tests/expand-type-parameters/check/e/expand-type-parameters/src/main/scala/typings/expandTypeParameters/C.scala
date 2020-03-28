package typings.expandTypeParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait C extends js.Object {
  var c: js.UndefOr[Double] = js.native
}

object C {
  @scala.inline
  def apply(c: Int | Double = null): C = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[C]
  }
  @scala.inline
  implicit sealed class Sugar (x: C) {
    @scala.inline
    def duplicate: C = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.expandTypeParameters.C]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): C with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.expandTypeParameters.C with T]
    @scala.inline
    def withCInt(c: Int): C = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (c != null) obj.updateDynamic("c")(c.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.expandTypeParameters.C]
    }
    @scala.inline
    def withCDouble(c: Double): C = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (c != null) obj.updateDynamic("c")(c.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.expandTypeParameters.C]
    }
  }
  
}

