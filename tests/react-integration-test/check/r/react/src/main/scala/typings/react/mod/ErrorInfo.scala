package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Error Interfaces
// ----------------------------------------------------------------------
@js.native
trait ErrorInfo extends js.Object {
  /**
    * Captures which component contained the exception, and its ancestors.
    */
  var componentStack: String = js.native
}

object ErrorInfo {
  @scala.inline
  def apply(componentStack: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorInfo]
  }
  @scala.inline
  implicit sealed class Sugar (x: ErrorInfo) {
    @scala.inline
    def duplicate: ErrorInfo = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ErrorInfo]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ErrorInfo with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ErrorInfo with T]
    @scala.inline
    def withComponentStack(componentStack: String): ErrorInfo = js.Dynamic.global.Object.assign(js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ErrorInfo]
  }
  
}

