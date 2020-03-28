package typingsJapgolly.react

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: js.UndefOr[Node] = js.native
}

object AnonChildren {
  @scala.inline
  def apply(children: VdomNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonChildren) {
    @scala.inline
    def duplicate: AnonChildren = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.react.AnonChildren]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonChildren with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.AnonChildren with T]
    @scala.inline
    def withChildren(children: VdomNode): AnonChildren = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.AnonChildren]
    }
  }
  
}

