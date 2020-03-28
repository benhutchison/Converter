package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElementTagNameMap extends js.Object {
  var circle: org.scalajs.dom.raw.SVGCircleElement = js.native
}

object SVGElementTagNameMap {
  @scala.inline
  def apply(circle: org.scalajs.dom.raw.SVGCircleElement): SVGElementTagNameMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SVGElementTagNameMap]
  }
  @scala.inline
  implicit sealed class Sugar (x: SVGElementTagNameMap) {
    @scala.inline
    def duplicate: SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.std.SVGElementTagNameMap]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGElementTagNameMap with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.SVGElementTagNameMap with T]
    @scala.inline
    def withCircle(circle: org.scalajs.dom.raw.SVGCircleElement): SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(circle = circle.asInstanceOf[js.Any]), x).asInstanceOf[typingsJapgolly.std.SVGElementTagNameMap]
  }
  
}

