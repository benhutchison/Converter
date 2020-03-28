package typings.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeDataStatic extends js.Object {
  def allowed(): String = js.native
  def preferred(): String = js.native
}

object TimeDataStatic {
  @scala.inline
  def apply(allowed: () => String, preferred: () => String): TimeDataStatic = {
    val __obj = js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed), preferred = js.Any.fromFunction0(preferred))
  
    __obj.asInstanceOf[TimeDataStatic]
  }
  @scala.inline
  implicit sealed class Sugar (x: TimeDataStatic) {
    @scala.inline
    def duplicate: TimeDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.cldrjs.mod.TimeDataStatic]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TimeDataStatic with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.cldrjs.mod.TimeDataStatic with T]
    @scala.inline
    def withAllowed(allowed: () => String): TimeDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed)), x).asInstanceOf[typings.cldrjs.mod.TimeDataStatic]
    @scala.inline
    def withPreferred(preferred: () => String): TimeDataStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(preferred = js.Any.fromFunction0(preferred)), x).asInstanceOf[typings.cldrjs.mod.TimeDataStatic]
  }
  
}

