package typingsSlinky.reactBootstrap.toggleButtonGroupMod

import typingsSlinky.reactBootstrap.reactBootstrapStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxProps extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[_], Unit]] = js.native
  var `type`: checkbox = js.native
}

object CheckboxProps {
  @scala.inline
  def apply(`type`: checkbox, name: String = null, onChange: /* values */ js.Array[_] => Unit = null): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: CheckboxProps) {
    @scala.inline
    def duplicate: CheckboxProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.CheckboxProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): CheckboxProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.CheckboxProps with T]
    @scala.inline
    def withType(`type`: checkbox): CheckboxProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.CheckboxProps]
    }
    @scala.inline
    def withName(name: String): CheckboxProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.CheckboxProps]
    }
    @scala.inline
    def withOnChange(onChange: /* values */ js.Array[_] => Unit): CheckboxProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.CheckboxProps]
    }
  }
  
}

