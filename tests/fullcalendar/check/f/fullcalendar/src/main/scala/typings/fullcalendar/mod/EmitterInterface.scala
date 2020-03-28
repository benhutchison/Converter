package typings.fullcalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterInterface extends js.Object {
  def on(types: js.Any, handler: js.Any): js.Any = js.native
}

object EmitterInterface {
  @scala.inline
  def apply(on: (js.Any, js.Any) => js.Any): EmitterInterface = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[EmitterInterface]
  }
  @scala.inline
  implicit sealed class Sugar (x: EmitterInterface) {
    @scala.inline
    def duplicate: EmitterInterface = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.fullcalendar.mod.EmitterInterface]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): EmitterInterface with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.fullcalendar.mod.EmitterInterface with T]
    @scala.inline
    def withOn(on: (js.Any, js.Any) => js.Any): EmitterInterface = js.Dynamic.global.Object.assign(js.Dynamic.literal(on = js.Any.fromFunction2(on)), x).asInstanceOf[typings.fullcalendar.mod.EmitterInterface]
  }
  
}

