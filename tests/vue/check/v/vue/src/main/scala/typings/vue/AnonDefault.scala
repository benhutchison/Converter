package typings.vue

import typings.vue.optionsMod.InjectKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  var default: js.UndefOr[js.Any] = js.native
  var from: js.UndefOr[InjectKey] = js.native
}

object AnonDefault {
  @scala.inline
  def apply(default: js.Any = null, from: InjectKey = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonDefault) {
    @scala.inline
    def duplicate: AnonDefault = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.AnonDefault]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonDefault with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.AnonDefault with T]
    @scala.inline
    def withDefault(default: js.Any): AnonDefault = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (default != null) obj.updateDynamic("default")(default.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.AnonDefault]
    }
    @scala.inline
    def withFrom(from: InjectKey): AnonDefault = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (from != null) obj.updateDynamic("from")(from.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.AnonDefault]
    }
  }
  
}

