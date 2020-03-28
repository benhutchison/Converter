package typings.commander.mod.local

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var bool: Boolean = js.native
  var description: String = js.native
  var flags: String = js.native
  var long: String = js.native
  var optional: Boolean = js.native
  var required: Boolean = js.native
  var short: js.UndefOr[String] = js.native
}

object Option {
  @scala.inline
  def apply(
    bool: Boolean,
    description: String,
    flags: String,
    long: String,
    optional: Boolean,
    required: Boolean,
    short: String = null
  ): Option = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit sealed class Sugar (x: Option) {
    @scala.inline
    def duplicate: Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Option with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.local.Option with T]
    @scala.inline
    def withBool(bool: Boolean): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(bool = bool.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withDescription(description: String): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(description = description.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withFlags(flags: String): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(flags = flags.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withLong(long: String): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(long = long.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withOptional(optional: Boolean): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(optional = optional.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withRequired(required: Boolean): Option = js.Dynamic.global.Object.assign(js.Dynamic.literal(required = required.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.local.Option]
    @scala.inline
    def withShort(short: String): Option = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (short != null) obj.updateDynamic("short")(short.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.commander.mod.local.Option]
    }
  }
  
}

