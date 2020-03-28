package typingsSlinky.reactBootstrap.toggleButtonGroupMod

import typingsSlinky.reactBootstrap.reactBootstrapStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioProps extends js.Object {
  /** Required if `type` is set to "radio" */
  var name: String = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var `type`: radio = js.native
}

object RadioProps {
  @scala.inline
  def apply(name: String, `type`: radio, onChange: /* value */ js.Any => Unit = null): RadioProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RadioProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: RadioProps) {
    @scala.inline
    def duplicate: RadioProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.RadioProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RadioProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.RadioProps with T]
    @scala.inline
    def withName(name: String): RadioProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.RadioProps]
    @scala.inline
    def withType(`type`: radio): RadioProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.RadioProps]
    }
    @scala.inline
    def withOnChange(onChange: /* value */ js.Any => Unit): RadioProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typingsSlinky.reactBootstrap.toggleButtonGroupMod.RadioProps]
    }
  }
  
}

