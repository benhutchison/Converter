package typingsSlinky.react.mod

import typingsSlinky.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactSVG for ReactSVGElement
@js.native
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object ReactSVGElement {
  @scala.inline
  def apply(
    props: js.Any,
    `type`: js.Any,
    key: Key = null,
    ref: LegacyRef[org.scalajs.dom.raw.SVGElement] = null
  ): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactSVGElement) {
    @scala.inline
    def duplicate: ReactSVGElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.ReactSVGElement]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactSVGElement with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.ReactSVGElement with T]
    @scala.inline
    def withProps(props: js.Any): ReactSVGElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ReactSVGElement]
    @scala.inline
    def withType(`type`: js.Any): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ReactSVGElement]
    }
    @scala.inline
    def withKey(key: Key): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ReactSVGElement]
    }
    @scala.inline
    def withRef(ref: LegacyRef[org.scalajs.dom.raw.SVGElement]): ReactSVGElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ReactSVGElement]
    }
  }
  
}

