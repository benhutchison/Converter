package typings.vue.optionsMod

import typings.std.HTMLElement
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveOptions extends js.Object {
  var bind: js.UndefOr[DirectiveFunction] = js.native
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.native
  var inserted: js.UndefOr[DirectiveFunction] = js.native
  var unbind: js.UndefOr[DirectiveFunction] = js.native
  var update: js.UndefOr[DirectiveFunction] = js.native
}

object DirectiveOptions {
  @scala.inline
  def apply(
    bind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    componentUpdated: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    inserted: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    unbind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    update: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null
  ): DirectiveOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction4(bind))
    if (componentUpdated != null) __obj.updateDynamic("componentUpdated")(js.Any.fromFunction4(componentUpdated))
    if (inserted != null) __obj.updateDynamic("inserted")(js.Any.fromFunction4(inserted))
    if (unbind != null) __obj.updateDynamic("unbind")(js.Any.fromFunction4(unbind))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[DirectiveOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: DirectiveOptions) {
    @scala.inline
    def duplicate: DirectiveOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DirectiveOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.DirectiveOptions with T]
    @scala.inline
    def withBind(
      bind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): DirectiveOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bind != null) obj.updateDynamic("bind")(js.Any.fromFunction4(bind))
      obj.asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    }
    @scala.inline
    def withComponentUpdated(
      componentUpdated: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): DirectiveOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentUpdated != null) obj.updateDynamic("componentUpdated")(js.Any.fromFunction4(componentUpdated))
      obj.asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    }
    @scala.inline
    def withInserted(
      inserted: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): DirectiveOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inserted != null) obj.updateDynamic("inserted")(js.Any.fromFunction4(inserted))
      obj.asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    }
    @scala.inline
    def withUnbind(
      unbind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): DirectiveOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unbind != null) obj.updateDynamic("unbind")(js.Any.fromFunction4(unbind))
      obj.asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    }
    @scala.inline
    def withUpdate(
      update: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): DirectiveOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (update != null) obj.updateDynamic("update")(js.Any.fromFunction4(update))
      obj.asInstanceOf[typings.vue.optionsMod.DirectiveOptions]
    }
  }
  
}

