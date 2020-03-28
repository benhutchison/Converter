package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElementTagNameMap extends js.Object {
  var circle: SVGCircleElement = js.native
}

object SVGElementTagNameMap {
  @scala.inline
  def apply(circle: SVGCircleElement): SVGElementTagNameMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SVGElementTagNameMap]
  }
  @scala.inline
  implicit sealed class Sugar (x: SVGElementTagNameMap) {
    @scala.inline
    def duplicate: SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.std.SVGElementTagNameMap]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGElementTagNameMap with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.std.SVGElementTagNameMap with T]
    @scala.inline
    def withCircle(circle: SVGCircleElement): SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(circle = circle.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.SVGElementTagNameMap]
  }
  
}

