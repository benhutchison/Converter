package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unsubscribable extends js.Object {
  def unsubscribe(): Unit = js.native
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: () => Unit): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Unsubscribable]
  }
  @scala.inline
  implicit sealed class Sugar (x: Unsubscribable) {
    @scala.inline
    def duplicate: Unsubscribable = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.Unsubscribable]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Unsubscribable with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.Unsubscribable with T]
    @scala.inline
    def withUnsubscribe(unsubscribe: () => Unit): Unsubscribable = js.Dynamic.global.Object.assign(js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe)), x).asInstanceOf[typings.rxjs.typesMod.Unsubscribable]
  }
  
}

