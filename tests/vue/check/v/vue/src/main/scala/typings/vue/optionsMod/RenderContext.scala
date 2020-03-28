package typings.vue.optionsMod

import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContext[Props] extends js.Object {
  var children: js.Array[VNode] = js.native
  var data: VNodeData = js.native
  var injections: js.Any = js.native
  var parent: Vue = js.native
  var props: Props = js.native
  def slots(): js.Any = js.native
}

object RenderContext {
  @scala.inline
  def apply[Props](
    children: js.Array[VNode],
    data: VNodeData,
    injections: js.Any,
    parent: Vue,
    props: Props,
    slots: () => js.Any
  ): RenderContext[Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
  
    __obj.asInstanceOf[RenderContext[Props]]
  }
  @scala.inline
  implicit sealed class Sugar[Props] (x: RenderContext[Props]) {
    @scala.inline
    def duplicate: RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RenderContext[Props] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.RenderContext[Props] with T]
    @scala.inline
    def withChildren(children: js.Array[VNode]): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(children = children.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def withData(data: VNodeData): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(data = data.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def withInjections(injections: js.Any): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(injections = injections.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def withParent(parent: Vue): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(parent = parent.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def withProps(props: Props): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(props = props.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
    @scala.inline
    def withSlots(slots: () => js.Any): RenderContext[Props] = js.Dynamic.global.Object.assign(js.Dynamic.literal(slots = js.Any.fromFunction0(slots)), x).asInstanceOf[typings.vue.optionsMod.RenderContext[Props]]
  }
  
}

