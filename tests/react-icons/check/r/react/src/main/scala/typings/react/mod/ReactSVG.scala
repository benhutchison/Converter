package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG extends js.Object {
  var animate: SVGFactory = js.native
  var circle: SVGFactory = js.native
  var clipPath: SVGFactory = js.native
}

object ReactSVG {
  @scala.inline
  def apply(animate: SVGFactory, circle: SVGFactory, clipPath: SVGFactory): ReactSVG = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactSVG]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactSVG) {
    @scala.inline
    def duplicate: ReactSVG = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ReactSVG]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactSVG with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ReactSVG with T]
    @scala.inline
    def withAnimate(animate: SVGFactory): ReactSVG = js.Dynamic.global.Object.assign(js.Dynamic.literal(animate = animate.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactSVG]
    @scala.inline
    def withCircle(circle: SVGFactory): ReactSVG = js.Dynamic.global.Object.assign(js.Dynamic.literal(circle = circle.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactSVG]
    @scala.inline
    def withClipPath(clipPath: SVGFactory): ReactSVG = js.Dynamic.global.Object.assign(js.Dynamic.literal(clipPath = clipPath.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactSVG]
  }
  
}

