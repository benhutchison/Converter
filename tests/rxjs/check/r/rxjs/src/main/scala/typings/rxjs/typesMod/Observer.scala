package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  var closed: js.UndefOr[Boolean] = js.native
  def complete(): Unit = js.native
  def error(err: js.Any): Unit = js.native
  def next(value: T): Unit = js.native
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => Unit,
    error: js.Any => Unit,
    next: T => Unit,
    closed: js.UndefOr[Boolean] = js.undefined
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: Observer[T]) {
    @scala.inline
    def duplicate: Observer[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Observer[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.Observer[T] with T]
    @scala.inline
    def withComplete(complete: () => Unit): Observer[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(complete = js.Any.fromFunction0(complete)), x).asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    @scala.inline
    def withError(error: js.Any => Unit): Observer[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(error = js.Any.fromFunction1(error)), x).asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    @scala.inline
    def withNext(next: T => Unit): Observer[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(next = js.Any.fromFunction1(next)), x).asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    @scala.inline
    def withClosedUndefined: Observer[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "closed")
      obj.asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    }
    @scala.inline
    def withClosed(closed: Boolean): Observer[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(closed)) obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.rxjs.typesMod.Observer[T]]
    }
  }
  
}

