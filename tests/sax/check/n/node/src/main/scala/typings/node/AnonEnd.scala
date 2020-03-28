package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnd extends js.Object {
  var end: js.UndefOr[Boolean] = js.native
}

object AnonEnd {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonEnd) {
    @scala.inline
    def duplicate: AnonEnd = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.AnonEnd]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonEnd with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.AnonEnd with T]
    @scala.inline
    def withEndUndefined: AnonEnd = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "end")
      obj.asInstanceOf[typings.node.AnonEnd]
    }
    @scala.inline
    def withEnd(end: Boolean): AnonEnd = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(end)) obj.updateDynamic("end")(end.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.AnonEnd]
    }
  }
  
}

