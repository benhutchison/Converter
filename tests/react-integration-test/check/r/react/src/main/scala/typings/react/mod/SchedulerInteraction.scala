package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defined in scheduler/tracing
  */
@js.native
trait SchedulerInteraction extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var timestamp: Double = js.native
}

object SchedulerInteraction {
  @scala.inline
  def apply(id: Double, name: String, timestamp: Double): SchedulerInteraction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchedulerInteraction]
  }
  @scala.inline
  implicit sealed class Sugar (x: SchedulerInteraction) {
    @scala.inline
    def duplicate: SchedulerInteraction = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.SchedulerInteraction]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SchedulerInteraction with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.SchedulerInteraction with T]
    @scala.inline
    def withId(id: Double): SchedulerInteraction = js.Dynamic.global.Object.assign(js.Dynamic.literal(id = id.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.SchedulerInteraction]
    @scala.inline
    def withName(name: String): SchedulerInteraction = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.SchedulerInteraction]
    @scala.inline
    def withTimestamp(timestamp: Double): SchedulerInteraction = js.Dynamic.global.Object.assign(js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.SchedulerInteraction]
  }
  
}

