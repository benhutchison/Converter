package typings.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var trackingCode: String = js.native
}

object IOptions {
  @scala.inline
  def apply(trackingCode: String): IOptions = {
    val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: IOptions) {
    @scala.inline
    def duplicate: IOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.insight.mod.insight.IOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.insight.mod.insight.IOptions with T]
    @scala.inline
    def withTrackingCode(trackingCode: String): IOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.insight.IOptions]
  }
  
}

