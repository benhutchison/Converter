package typings.vue.optionsMod

import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsModuleComponent extends js.Object {
  var default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps] = js.native
}

object EsModuleComponent {
  @scala.inline
  def apply(default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): EsModuleComponent = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EsModuleComponent]
  }
  @scala.inline
  implicit sealed class Sugar (x: EsModuleComponent) {
    @scala.inline
    def duplicate: EsModuleComponent = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.EsModuleComponent]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): EsModuleComponent with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.EsModuleComponent with T]
    @scala.inline
    def withDefault(default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): EsModuleComponent = js.Dynamic.global.Object.assign(js.Dynamic.literal(default = default.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.optionsMod.EsModuleComponent]
  }
  
}

