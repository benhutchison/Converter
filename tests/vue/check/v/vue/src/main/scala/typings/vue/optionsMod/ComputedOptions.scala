package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedOptions[T] extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var get: js.UndefOr[js.Function0[T]] = js.native
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object ComputedOptions {
  @scala.inline
  def apply[T](cache: js.UndefOr[Boolean] = js.undefined, get: () => T = null, set: /* value */ T => Unit = null): ComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    __obj.asInstanceOf[ComputedOptions[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ComputedOptions[T]) {
    @scala.inline
    def duplicate: ComputedOptions[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.ComputedOptions[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ComputedOptions[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.ComputedOptions[T] with T]
    @scala.inline
    def withCacheUndefined: ComputedOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "cache")
      obj.asInstanceOf[typings.vue.optionsMod.ComputedOptions[T]]
    }
    @scala.inline
    def withCache(cache: Boolean): ComputedOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(cache)) obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComputedOptions[T]]
    }
    @scala.inline
    def withGet(get: () => T): ComputedOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (get != null) obj.updateDynamic("get")(js.Any.fromFunction0(get))
      obj.asInstanceOf[typings.vue.optionsMod.ComputedOptions[T]]
    }
    @scala.inline
    def withSet(set: /* value */ T => Unit): ComputedOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (set != null) obj.updateDynamic("set")(js.Any.fromFunction1(set))
      obj.asInstanceOf[typings.vue.optionsMod.ComputedOptions[T]]
    }
  }
  
}

