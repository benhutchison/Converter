package typings.winston.mod

import typings.winston.configMod.AbstractConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  var levels: js.UndefOr[AbstractConfigSetLevels] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(levels: AbstractConfigSetLevels = null): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: LoggerOptions) {
    @scala.inline
    def duplicate: LoggerOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.winston.mod.LoggerOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): LoggerOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.winston.mod.LoggerOptions with T]
    @scala.inline
    def withLevels(levels: AbstractConfigSetLevels): LoggerOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (levels != null) obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.winston.mod.LoggerOptions]
    }
  }
  
}

