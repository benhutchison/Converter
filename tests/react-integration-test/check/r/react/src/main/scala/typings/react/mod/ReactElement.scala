package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactElement extends js.Object {
  var key: Key | Null = js.native
  var props: js.Any = js.native
  var `type`: js.Any = js.native
}

object ReactElement {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any, key: Key = null): ReactElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactElement) {
    @scala.inline
    def duplicate: ReactElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ReactElement]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactElement with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ReactElement with T]
    @scala.inline
    def withProps(props: js.Any): ReactElement = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactElement]
    @scala.inline
    def withType(`type`: js.Any): ReactElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactElement]
    }
    @scala.inline
    def withKey(key: Key): ReactElement = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactElement]
    }
  }
  
}

