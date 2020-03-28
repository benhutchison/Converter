package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptions[T] extends js.Object {
  var default: js.UndefOr[T | Null | js.Function0[js.Object]] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[Prop[T] | js.Array[Prop[T]]] = js.native
  var validator: js.UndefOr[js.Function1[/* value */ T, Boolean]] = js.native
}

object PropOptions {
  @scala.inline
  def apply[T](
    default: T | js.Function0[js.Object] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: Prop[T] | js.Array[Prop[T]] = null,
    validator: /* value */ T => Boolean = null
  ): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[PropOptions[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: PropOptions[T]) {
    @scala.inline
    def duplicate: PropOptions[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): PropOptions[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.PropOptions[T] with T]
    @scala.inline
    def withDefaultFunction0(default: js.Function0[js.Object]): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (default != null) obj.updateDynamic("default")(default.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withDefaultT(default: T): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (default != null) obj.updateDynamic("default")(default.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withRequiredUndefined: PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "required")
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withRequired(required: Boolean): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(required)) obj.updateDynamic("required")(required.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withTypeProp(`type`: Prop[T]): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withTypeArray(`type`: js.Array[Prop[T]]): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
    @scala.inline
    def withValidator(validator: /* value */ T => Boolean): PropOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (validator != null) obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
      obj.asInstanceOf[typings.vue.optionsMod.PropOptions[T]]
    }
  }
  
}

