package typings.vue

import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStaticRenderFns extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]] = js.native
  def render(createElement: CreateElement): VNode = js.native
}

object AnonStaticRenderFns {
  @scala.inline
  def apply(render: CreateElement => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): AnonStaticRenderFns = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStaticRenderFns]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonStaticRenderFns) {
    @scala.inline
    def duplicate: AnonStaticRenderFns = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.AnonStaticRenderFns]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonStaticRenderFns with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.AnonStaticRenderFns with T]
    @scala.inline
    def withRender(render: CreateElement => VNode): AnonStaticRenderFns = js.Dynamic.global.Object.assign(js.Dynamic.literal(render = js.Any.fromFunction1(render)), x).asInstanceOf[typings.vue.AnonStaticRenderFns]
    @scala.inline
    def withStaticRenderFns(staticRenderFns: js.Array[js.Function0[VNode]]): AnonStaticRenderFns = js.Dynamic.global.Object.assign(js.Dynamic.literal(staticRenderFns = staticRenderFns.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.AnonStaticRenderFns]
  }
  
}

