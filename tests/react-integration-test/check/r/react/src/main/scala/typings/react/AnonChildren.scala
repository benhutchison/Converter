package typings.react

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
}

object AnonChildren {
  @scala.inline
  def apply(children: ReactNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonChildren) {
    @scala.inline
    def duplicate: AnonChildren = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonChildren]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonChildren with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonChildren with T]
    @scala.inline
    def withChildren(children: ReactNode): AnonChildren = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.AnonChildren]
    }
  }
  
}

