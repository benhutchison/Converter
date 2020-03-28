package typings.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekDataStatic extends js.Object {
  def firstDay(): String = js.native
  def minDays(): Double = js.native
}

object WeekDataStatic {
  @scala.inline
  def apply(firstDay: () => String, minDays: () => Double): WeekDataStatic = {
    val __obj = js.Dynamic.literal(firstDay = js.Any.fromFunction0(firstDay), minDays = js.Any.fromFunction0(minDays))
  
    __obj.asInstanceOf[WeekDataStatic]
  }
  @scala.inline
  implicit sealed class Sugar (x: WeekDataStatic) {
    @scala.inline
    def duplicate: WeekDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.cldrjs.mod.WeekDataStatic]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): WeekDataStatic with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.cldrjs.mod.WeekDataStatic with T]
    @scala.inline
    def withFirstDay(firstDay: () => String): WeekDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(firstDay = js.Any.fromFunction0(firstDay)), x).asInstanceOf[typings.cldrjs.mod.WeekDataStatic]
    @scala.inline
    def withMinDays(minDays: () => Double): WeekDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(minDays = js.Any.fromFunction0(minDays)), x).asInstanceOf[typings.cldrjs.mod.WeekDataStatic]
  }
  
}

