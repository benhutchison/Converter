package typingsSlinky.react.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMElement[P, T]

object DetailedReactHTMLElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](props: js.Any, `type`: js.Any, key: Key = null, ref: LegacyRef[T] = null): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
  @scala.inline
  implicit sealed class Sugar[P <: HTMLAttributes[T], T <: HTMLElement] (x: DetailedReactHTMLElement[P, T]) {
    @scala.inline
    def duplicate: DetailedReactHTMLElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (DetailedReactHTMLElement[P, T]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T] with T]
    @scala.inline
    def withProps(props: js.Any): DetailedReactHTMLElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T]]
    @scala.inline
    def withType(`type`: js.Any): DetailedReactHTMLElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T]]
    }
    @scala.inline
    def withKey(key: Key): DetailedReactHTMLElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T]]
    }
    @scala.inline
    def withRef(ref: LegacyRef[T]): DetailedReactHTMLElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.DetailedReactHTMLElement[P, T]]
    }
  }
  
}

