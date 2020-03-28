package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  def next(value: T): Unit = js.native
}

object NextObserver {
  @scala.inline
  def apply[T](
    next: T => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    error: /* err */ js.Any => Unit = null
  ): NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[NextObserver[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: NextObserver[T]) {
    @scala.inline
    def duplicate: NextObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): NextObserver[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.NextObserver[T] with T]
    @scala.inline
    def withNext(next: T => Unit): NextObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(next = js.Any.fromFunction1(next)), x).asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    @scala.inline
    def withClosedUndefined: NextObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "closed")
      obj.asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    }
    @scala.inline
    def withClosed(closed: Boolean): NextObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(closed)) obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    }
    @scala.inline
    def withComplete(complete: () => Unit): NextObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (complete != null) obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
      obj.asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    }
    @scala.inline
    def withError(error: /* err */ js.Any => Unit): NextObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (error != null) obj.updateDynamic("error")(js.Any.fromFunction1(error))
      obj.asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    }
  }
  
}

