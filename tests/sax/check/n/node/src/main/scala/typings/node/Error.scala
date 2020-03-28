package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var stack: js.UndefOr[String] = js.native
}

object Error {
  @scala.inline
  def apply(stack: String = null): Error = {
    val __obj = js.Dynamic.literal()
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit sealed class Sugar (x: Error) {
    @scala.inline
    def duplicate: Error = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.Error]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Error with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.Error with T]
    @scala.inline
    def withStack(stack: String): Error = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stack != null) obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.Error]
    }
  }
  
}

