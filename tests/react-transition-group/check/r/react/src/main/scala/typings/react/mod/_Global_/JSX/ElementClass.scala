package typings.react.mod._Global_.JSX

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementClass
  extends Component[js.Any, js.Object] {
  def render(): ReactNode = js.native
}

object ElementClass {
  @scala.inline
  def apply(render: () => ReactNode): ElementClass = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[ElementClass]
  }
  @scala.inline
  implicit sealed class Sugar (x: ElementClass) {
    @scala.inline
    def duplicate: ElementClass = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod._Global_.JSX.ElementClass]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ElementClass with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod._Global_.JSX.ElementClass with T]
    @scala.inline
    def withRender(render: () => ReactNode): ElementClass = js.Dynamic.global.Object.assign(js.Dynamic.literal(render = js.Any.fromFunction0(render)), x).asInstanceOf[typings.react.mod._Global_.JSX.ElementClass]
  }
  
}

