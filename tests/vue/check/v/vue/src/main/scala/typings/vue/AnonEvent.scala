package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEvent extends js.Object {
  var event: js.UndefOr[String] = js.native
  var prop: js.UndefOr[String] = js.native
}

object AnonEvent {
  @scala.inline
  def apply(event: String = null, prop: String = null): AnonEvent = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonEvent) {
    @scala.inline
    def duplicate: AnonEvent = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.AnonEvent]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonEvent with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.AnonEvent with T]
    @scala.inline
    def withEvent(event: String): AnonEvent = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (event != null) obj.updateDynamic("event")(event.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.AnonEvent]
    }
    @scala.inline
    def withProp(prop: String): AnonEvent = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prop != null) obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.AnonEvent]
    }
  }
  
}

