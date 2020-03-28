package typings.react.mod

import typings.react.reactStrings.animate
import typings.react.reactStrings.circle
import typings.react.reactStrings.clipPath
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactSVG for ReactSVGElement
@js.native
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement] {
  @JSName("type")
  var type_ReactSVGElement: animate | circle | clipPath = js.native
}

object ReactSVGElement {
  @scala.inline
  def apply(props: js.Any, ref: Ref[SVGElement], `type`: animate | circle | clipPath, key: Key = null): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactSVGElement) {
    @scala.inline
    def duplicate: ReactSVGElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ReactSVGElement]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactSVGElement with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ReactSVGElement with T]
    @scala.inline
    def withProps(props: js.Any): ReactSVGElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactSVGElement]
    @scala.inline
    def withRef(ref: Ref[SVGElement]): ReactSVGElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(ref = ref.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactSVGElement]
    @scala.inline
    def withTypeCircle(`type`: circle): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactSVGElement]
    }
    @scala.inline
    def withTypeClipPath(`type`: clipPath): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactSVGElement]
    }
    @scala.inline
    def withTypeAnimate(`type`: animate): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactSVGElement]
    }
    @scala.inline
    def withKey(key: Key): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactSVGElement]
    }
  }
  
}

