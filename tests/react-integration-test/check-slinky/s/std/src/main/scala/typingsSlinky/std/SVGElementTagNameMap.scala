package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElementTagNameMap extends js.Object {
  var circle: org.scalajs.dom.raw.SVGCircleElement = js.native
  var clipPath: org.scalajs.dom.raw.SVGClipPathElement = js.native
  var defs: org.scalajs.dom.raw.SVGDefsElement = js.native
}

object SVGElementTagNameMap {
  @scala.inline
  def apply(
    circle: org.scalajs.dom.raw.SVGCircleElement,
    clipPath: org.scalajs.dom.raw.SVGClipPathElement,
    defs: org.scalajs.dom.raw.SVGDefsElement
  ): SVGElementTagNameMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SVGElementTagNameMap]
  }
  @scala.inline
  implicit sealed class Sugar (x: SVGElementTagNameMap) {
    @scala.inline
    def duplicate: SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.std.SVGElementTagNameMap]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGElementTagNameMap with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.std.SVGElementTagNameMap with T]
    @scala.inline
    def withCircle(circle: org.scalajs.dom.raw.SVGCircleElement): SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(circle = circle.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.SVGElementTagNameMap]
    @scala.inline
    def withClipPath(clipPath: org.scalajs.dom.raw.SVGClipPathElement): SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(clipPath = clipPath.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.SVGElementTagNameMap]
    @scala.inline
    def withDefs(defs: org.scalajs.dom.raw.SVGDefsElement): SVGElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(defs = defs.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.SVGElementTagNameMap]
  }
  
}

