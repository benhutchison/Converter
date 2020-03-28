package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandOptions extends js.Object {
  var isDefault: js.UndefOr[Boolean] = js.native
  var noHelp: js.UndefOr[Boolean] = js.native
}

object CommandOptions {
  @scala.inline
  def apply(isDefault: js.UndefOr[Boolean] = js.undefined, noHelp: js.UndefOr[Boolean] = js.undefined): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(noHelp)) __obj.updateDynamic("noHelp")(noHelp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: CommandOptions) {
    @scala.inline
    def duplicate: CommandOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.commander.mod.CommandOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): CommandOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.CommandOptions with T]
    @scala.inline
    def withIsDefaultUndefined: CommandOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "isDefault")
      obj.asInstanceOf[typings.commander.mod.CommandOptions]
    }
    @scala.inline
    def withIsDefault(isDefault: Boolean): CommandOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(isDefault)) obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.commander.mod.CommandOptions]
    }
    @scala.inline
    def withNoHelpUndefined: CommandOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noHelp")
      obj.asInstanceOf[typings.commander.mod.CommandOptions]
    }
    @scala.inline
    def withNoHelp(noHelp: Boolean): CommandOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noHelp)) obj.updateDynamic("noHelp")(noHelp.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.commander.mod.CommandOptions]
    }
  }
  
}

