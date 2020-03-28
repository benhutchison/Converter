package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildContextProvider[CC] extends js.Object {
  def getChildContext(): CC = js.native
}

object ChildContextProvider {
  @scala.inline
  def apply[CC](getChildContext: () => CC): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = js.Any.fromFunction0(getChildContext))
  
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  @scala.inline
  implicit sealed class Sugar[CC] (x: ChildContextProvider[CC]) {
    @scala.inline
    def duplicate: ChildContextProvider[CC] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ChildContextProvider[CC]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ChildContextProvider[CC] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ChildContextProvider[CC] with T]
    @scala.inline
    def withGetChildContext(getChildContext: () => CC): ChildContextProvider[CC] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getChildContext = js.Any.fromFunction0(getChildContext)), x).asInstanceOf[typings.react.mod.ChildContextProvider[CC]]
  }
  
}

