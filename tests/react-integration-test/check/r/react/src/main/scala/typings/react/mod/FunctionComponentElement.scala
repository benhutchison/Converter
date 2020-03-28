package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponentElement[P] extends ReactElement {
  var ref: js.UndefOr[js.Any] = js.native
}

object FunctionComponentElement {
  @scala.inline
  def apply[P](props: js.Any, `type`: js.Any, key: Key = null, ref: js.Any = null): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  @scala.inline
  implicit sealed class Sugar[P] (x: FunctionComponentElement[P]) {
    @scala.inline
    def duplicate: FunctionComponentElement[P] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): FunctionComponentElement[P] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.FunctionComponentElement[P] with T]
    @scala.inline
    def withProps(props: js.Any): FunctionComponentElement[P] = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
    @scala.inline
    def withType(`type`: js.Any): FunctionComponentElement[P] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
    }
    @scala.inline
    def withKey(key: Key): FunctionComponentElement[P] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
    }
    @scala.inline
    def withRef(ref: js.Any): FunctionComponentElement[P] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
    }
  }
  
}

