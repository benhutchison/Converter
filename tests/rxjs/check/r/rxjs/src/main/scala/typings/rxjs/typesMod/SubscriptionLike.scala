package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionLike extends Unsubscribable {
  val closed: Boolean = js.native
}

object SubscriptionLike {
  @scala.inline
  def apply(closed: Boolean, unsubscribe: () => Unit): SubscriptionLike = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[SubscriptionLike]
  }
  @scala.inline
  implicit sealed class Sugar (x: SubscriptionLike) {
    @scala.inline
    def duplicate: SubscriptionLike = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.SubscriptionLike]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SubscriptionLike with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.SubscriptionLike with T]
    @scala.inline
    def withClosed(closed: Boolean): SubscriptionLike = js.Dynamic.global.Object.assign(js.Dynamic.literal(closed = closed.asInstanceOf[js.Any]), x).asInstanceOf[typings.rxjs.typesMod.SubscriptionLike]
    @scala.inline
    def withUnsubscribe(unsubscribe: () => Unit): SubscriptionLike = js.Dynamic.global.Object.assign(js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe)), x).asInstanceOf[typings.rxjs.typesMod.SubscriptionLike]
  }
  
}

