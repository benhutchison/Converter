package typings.vue.vnodeMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeChildrenArrayContents extends /* x */ NumberDictionary[VNode | String | VNodeChildren]

object VNodeChildrenArrayContents {
  @scala.inline
  def apply(NumberDictionary: /* x */ NumberDictionary[VNode | String | VNodeChildren] = null): VNodeChildrenArrayContents = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[VNodeChildrenArrayContents]
  }
  @scala.inline
  implicit sealed class Sugar (x: VNodeChildrenArrayContents) {
    @scala.inline
    def duplicate: VNodeChildrenArrayContents = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.vnodeMod.VNodeChildrenArrayContents]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VNodeChildrenArrayContents with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.vnodeMod.VNodeChildrenArrayContents with T]
    @scala.inline
    def withNumberDictionary(NumberDictionary: /* x */ NumberDictionary[VNode | String | VNodeChildren]): VNodeChildrenArrayContents = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (NumberDictionary != null) js.Dynamic.global.Object.assign(obj, NumberDictionary)
      obj.asInstanceOf[typings.vue.vnodeMod.VNodeChildrenArrayContents]
    }
  }
  
}

