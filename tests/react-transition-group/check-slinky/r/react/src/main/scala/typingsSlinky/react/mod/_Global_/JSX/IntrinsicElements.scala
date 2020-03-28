package typingsSlinky.react.mod._Global_.JSX

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicElements extends js.Object {
  // HTML
  var abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
  var animate: SVGProps[SVGElement] = js.native
}

object IntrinsicElements {
  @scala.inline
  def apply(abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], animate: SVGProps[SVGElement]): IntrinsicElements = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntrinsicElements]
  }
  @scala.inline
  implicit sealed class Sugar (x: IntrinsicElements) {
    @scala.inline
    def duplicate: IntrinsicElements = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod._Global_.JSX.IntrinsicElements]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IntrinsicElements with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod._Global_.JSX.IntrinsicElements with T]
    @scala.inline
    def withAbbr(abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): IntrinsicElements = js.Dynamic.global.Object.assign(js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod._Global_.JSX.IntrinsicElements]
    @scala.inline
    def withAnimate(animate: SVGProps[SVGElement]): IntrinsicElements = js.Dynamic.global.Object.assign(js.Dynamic.literal(animate = animate.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod._Global_.JSX.IntrinsicElements]
  }
  
}

