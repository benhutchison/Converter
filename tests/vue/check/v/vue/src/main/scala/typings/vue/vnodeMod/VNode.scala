package typings.vue.vnodeMod

import typings.std.Node
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends js.Object {
  var children: js.UndefOr[js.Array[VNode]] = js.native
  var componentInstance: js.UndefOr[Vue] = js.native
  var componentOptions: js.UndefOr[VNodeComponentOptions] = js.native
  var context: js.UndefOr[Vue] = js.native
  var data: js.UndefOr[VNodeData] = js.native
  var elm: js.UndefOr[Node] = js.native
  var isComment: Boolean = js.native
  var isRootInsert: Boolean = js.native
  var isStatic: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String | Double] = js.native
  var ns: js.UndefOr[String] = js.native
  var parent: js.UndefOr[VNode] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object VNode {
  @scala.inline
  def apply(
    isComment: Boolean,
    isRootInsert: Boolean,
    children: js.Array[VNode] = null,
    componentInstance: Vue = null,
    componentOptions: VNodeComponentOptions = null,
    context: Vue = null,
    data: VNodeData = null,
    elm: Node = null,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    key: String | Double = null,
    ns: String = null,
    parent: VNode = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    text: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentInstance != null) __obj.updateDynamic("componentInstance")(componentInstance.asInstanceOf[js.Any])
    if (componentOptions != null) __obj.updateDynamic("componentOptions")(componentOptions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (elm != null) __obj.updateDynamic("elm")(elm.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit sealed class Sugar (x: VNode) {
    @scala.inline
    def duplicate: VNode = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.vnodeMod.VNode]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VNode with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.vnodeMod.VNode with T]
    @scala.inline
    def withIsComment(isComment: Boolean): VNode = js.Dynamic.global.Object.assign(js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNode]
    @scala.inline
    def withIsRootInsert(isRootInsert: Boolean): VNode = js.Dynamic.global.Object.assign(js.Dynamic.literal(isRootInsert = isRootInsert.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNode]
    @scala.inline
    def withChildren(children: js.Array[VNode]): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withComponentInstance(componentInstance: Vue): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentInstance != null) obj.updateDynamic("componentInstance")(componentInstance.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withComponentOptions(componentOptions: VNodeComponentOptions): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentOptions != null) obj.updateDynamic("componentOptions")(componentOptions.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withContext(context: Vue): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (context != null) obj.updateDynamic("context")(context.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withData(data: VNodeData): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (data != null) obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withElm(elm: Node): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (elm != null) obj.updateDynamic("elm")(elm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withIsStaticUndefined: VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "isStatic")
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withIsStatic(isStatic: Boolean): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(isStatic)) obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withKeyString(key: String): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withKeyDouble(key: Double): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withNs(ns: String): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ns != null) obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withParent(parent: VNode): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (parent != null) obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withRawUndefined: VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "raw")
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withRaw(raw: Boolean): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(raw)) obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withTag(tag: String): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tag != null) obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
    @scala.inline
    def withText(text: String): VNode = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (text != null) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.vnodeMod.VNode]
    }
  }
  
}

