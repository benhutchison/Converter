package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined, immediate: js.UndefOr[Boolean] = js.undefined): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: WatchOptions) {
    @scala.inline
    def duplicate: WatchOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.WatchOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): WatchOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.WatchOptions with T]
    @scala.inline
    def withDeepUndefined: WatchOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "deep")
      obj.asInstanceOf[typings.vue.optionsMod.WatchOptions]
    }
    @scala.inline
    def withDeep(deep: Boolean): WatchOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(deep)) obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.WatchOptions]
    }
    @scala.inline
    def withImmediateUndefined: WatchOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "immediate")
      obj.asInstanceOf[typings.vue.optionsMod.WatchOptions]
    }
    @scala.inline
    def withImmediate(immediate: Boolean): WatchOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(immediate)) obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.WatchOptions]
    }
  }
  
}

