package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHtml extends js.Object {
  var __html: String = js.native
}

object AnonHtml {
  @scala.inline
  def apply(__html: String): AnonHtml = {
    val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHtml]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonHtml) {
    @scala.inline
    def duplicate: AnonHtml = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonHtml]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonHtml with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonHtml with T]
    @scala.inline
    def with__html(__html: String): AnonHtml = js.Dynamic.global.Object.assign(js.Dynamic.literal(__html = __html.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.AnonHtml]
  }
  
}

