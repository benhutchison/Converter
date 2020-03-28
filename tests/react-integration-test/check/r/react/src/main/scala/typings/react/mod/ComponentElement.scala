package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentElement[P, T /* <: Component[P, ComponentState, _] */] extends ReactElement {
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}

object ComponentElement {
  @scala.inline
  def apply[P, T /* <: Component[P, ComponentState, _] */](props: js.Any, `type`: js.Any, key: Key = null, ref: LegacyRef[T] = null): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  @scala.inline
  implicit sealed class Sugar[P, T <: Component[P, ComponentState, _]] (x: ComponentElement[P, T]) {
    @scala.inline
    def duplicate: ComponentElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ComponentElement[P, T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (ComponentElement[P, T]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentElement[P, T] with T]
    @scala.inline
    def withProps(props: js.Any): ComponentElement[P, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ComponentElement[P, T]]
    @scala.inline
    def withType(`type`: js.Any): ComponentElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentElement[P, T]]
    }
    @scala.inline
    def withKey(key: Key): ComponentElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentElement[P, T]]
    }
    @scala.inline
    def withRef(ref: LegacyRef[T]): ComponentElement[P, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentElement[P, T]]
    }
  }
  
}

