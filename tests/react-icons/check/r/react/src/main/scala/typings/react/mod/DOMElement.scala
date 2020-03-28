package typings.react.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
@js.native
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends ReactElement {
  var ref: Ref[T] = js.native
  @JSName("type")
  var type_DOMElement: String = js.native
}

object DOMElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: js.Any, ref: Ref[T], `type`: String, key: Key = null): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
  @scala.inline
  implicit sealed class Sugar[P <: HTMLAttributes[T] | SVGAttributes[T], T <: Element] (x: DOMElement[P, T]) {
    @scala.inline
    def duplicate: DOMElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.DOMElement[P, T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (DOMElement[P, T]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.DOMElement[P, T] with T]
    @scala.inline
    def withProps(props: js.Any): DOMElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DOMElement[P, T]]
    @scala.inline
    def withRef(ref: Ref[T]): DOMElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ref = ref.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DOMElement[P, T]]
    @scala.inline
    def withType(`type`: String): DOMElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMElement[P, T]]
    }
    @scala.inline
    def withKey(key: Key): DOMElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMElement[P, T]]
    }
  }
  
}

