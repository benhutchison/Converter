package typings.vue.optionsMod

import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: Boolean = js.native
  var inject: js.UndefOr[InjectOptions] = js.native
  var name: js.UndefOr[String] = js.native
  var props: js.UndefOr[PropDefs] = js.native
  def render(createElement: CreateElement, context: RenderContext[Props]): VNode = js.native
}

object FunctionalComponentOptions {
  @scala.inline
  def apply[Props, PropDefs](
    functional: Boolean,
    render: (CreateElement, RenderContext[Props]) => VNode,
    inject: InjectOptions = null,
    name: String = null,
    props: PropDefs = null
  ): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
  @scala.inline
  implicit sealed class Sugar[Props, PropDefs] (x: FunctionalComponentOptions[Props, PropDefs]) {
    @scala.inline
    def duplicate: FunctionalComponentOptions[Props, PropDefs] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (FunctionalComponentOptions[Props, PropDefs]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs] with T]
    @scala.inline
    def withFunctional(functional: Boolean): FunctionalComponentOptions[Props, PropDefs] = js.Dynamic.global.Object.assign(js.Dynamic.literal(functional = functional.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    @scala.inline
    def withRender(render: (CreateElement, RenderContext[Props]) => VNode): FunctionalComponentOptions[Props, PropDefs] = js.Dynamic.global.Object.assign(js.Dynamic.literal(render = js.Any.fromFunction2(render)), x).asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    @scala.inline
    def withInject(inject: InjectOptions): FunctionalComponentOptions[Props, PropDefs] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inject != null) obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    }
    @scala.inline
    def withName(name: String): FunctionalComponentOptions[Props, PropDefs] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    }
    @scala.inline
    def withProps(props: PropDefs): FunctionalComponentOptions[Props, PropDefs] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (props != null) obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.FunctionalComponentOptions[Props, PropDefs]]
    }
  }
  
}

