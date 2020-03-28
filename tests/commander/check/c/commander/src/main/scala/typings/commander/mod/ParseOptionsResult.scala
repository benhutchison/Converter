package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptionsResult extends js.Object {
  var args: js.Array[String] = js.native
  var unknown: js.Array[String] = js.native
}

object ParseOptionsResult {
  @scala.inline
  def apply(args: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseOptionsResult]
  }
  @scala.inline
  implicit sealed class Sugar (x: ParseOptionsResult) {
    @scala.inline
    def duplicate: ParseOptionsResult = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.commander.mod.ParseOptionsResult]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ParseOptionsResult with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.ParseOptionsResult with T]
    @scala.inline
    def withArgs(args: js.Array[String]): ParseOptionsResult = js.Dynamic.global.Object.assign(js.Dynamic.literal(args = args.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.ParseOptionsResult]
    @scala.inline
    def withUnknown(unknown: js.Array[String]): ParseOptionsResult = js.Dynamic.global.Object.assign(js.Dynamic.literal(unknown = unknown.asInstanceOf[js.Any]), x).asInstanceOf[typings.commander.mod.ParseOptionsResult]
  }
  
}

