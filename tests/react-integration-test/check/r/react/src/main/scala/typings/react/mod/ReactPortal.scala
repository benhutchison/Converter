package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPortal extends ReactElement {
  var children: ReactNode = js.native
}

object ReactPortal {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any, children: ReactNode = null, key: Key = null): ReactPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactPortal) {
    @scala.inline
    def duplicate: ReactPortal = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ReactPortal]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactPortal with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ReactPortal with T]
    @scala.inline
    def withProps(props: js.Any): ReactPortal = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPortal]
    @scala.inline
    def withType(`type`: js.Any): ReactPortal = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactPortal]
    }
    @scala.inline
    def withChildren(children: ReactNode): ReactPortal = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactPortal]
    }
    @scala.inline
    def withKey(key: Key): ReactPortal = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactPortal]
    }
  }
  
}

