package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRender extends js.Object {
  var render: js.Function = js.native
  var staticRenderFns: js.Array[js.Function] = js.native
}

object AnonRender {
  @scala.inline
  def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): AnonRender = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRender]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonRender) {
    @scala.inline
    def duplicate: AnonRender = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.AnonRender]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonRender with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.AnonRender with T]
    @scala.inline
    def withRender(render: js.Function): AnonRender = js.Dynamic.global.Object.assign(js.Dynamic.literal(render = render.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.AnonRender]
    @scala.inline
    def withStaticRenderFns(staticRenderFns: js.Array[js.Function]): AnonRender = js.Dynamic.global.Object.assign(js.Dynamic.literal(staticRenderFns = staticRenderFns.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.AnonRender]
  }
  
}

