package typingsJapgolly.react.mod._Global_.JSX

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementClass
  extends Component[js.Any, js.Object] {
  def render(): Node = js.native
}

object ElementClass {
  @scala.inline
  def apply(render: CallbackTo[Node]): ElementClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[ElementClass]
  }
  @scala.inline
  implicit sealed class Sugar (x: ElementClass) {
    @scala.inline
    def duplicate: ElementClass = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.react.mod._Global_.JSX.ElementClass]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ElementClass with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod._Global_.JSX.ElementClass with T]
    @scala.inline
    def withRender(render: CallbackTo[Node]): ElementClass = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("render")(render.toJsFn)
      obj.asInstanceOf[typingsJapgolly.react.mod._Global_.JSX.ElementClass]
    }
  }
  
}

