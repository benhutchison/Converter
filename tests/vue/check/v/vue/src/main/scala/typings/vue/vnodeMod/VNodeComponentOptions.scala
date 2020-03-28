package typings.vue.vnodeMod

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeComponentOptions extends js.Object {
  var Ctor: VueConstructor[Vue] = js.native
  var children: js.UndefOr[VNodeChildren] = js.native
  var listeners: js.UndefOr[js.Object] = js.native
  var propsData: js.UndefOr[js.Object] = js.native
  var tag: js.UndefOr[String] = js.native
}

object VNodeComponentOptions {
  @scala.inline
  def apply(
    Ctor: VueConstructor[Vue],
    children: VNodeChildren = null,
    listeners: js.Object = null,
    propsData: js.Object = null,
    tag: String = null
  ): VNodeComponentOptions = {
    val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (propsData != null) __obj.updateDynamic("propsData")(propsData.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeComponentOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: VNodeComponentOptions) {
    @scala.inline
    def duplicate: VNodeComponentOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VNodeComponentOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions with T]
    @scala.inline
    def withCtor(Ctor: VueConstructor[Vue]): VNodeComponentOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    @scala.inline
    def withChildren(children: VNodeChildren): VNodeComponentOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    }
    @scala.inline
    def withListeners(listeners: js.Object): VNodeComponentOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (listeners != null) obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    }
    @scala.inline
    def withPropsData(propsData: js.Object): VNodeComponentOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (propsData != null) obj.updateDynamic("propsData")(propsData.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    }
    @scala.inline
    def withTag(tag: String): VNodeComponentOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tag != null) obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNodeComponentOptions]
    }
  }
  
}

