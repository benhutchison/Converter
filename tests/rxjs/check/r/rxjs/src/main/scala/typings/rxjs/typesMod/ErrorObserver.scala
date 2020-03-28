package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  def error(err: js.Any): Unit = js.native
}

object ErrorObserver {
  @scala.inline
  def apply[T](
    error: js.Any => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    next: /* value */ T => Unit = null
  ): ErrorObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[ErrorObserver[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ErrorObserver[T]) {
    @scala.inline
    def duplicate: ErrorObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ErrorObserver[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T] with T]
    @scala.inline
    def withError(error: js.Any => Unit): ErrorObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(error = js.Any.fromFunction1(error)), x).asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    @scala.inline
    def withClosedUndefined: ErrorObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "closed")
      obj.asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    }
    @scala.inline
    def withClosed(closed: Boolean): ErrorObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(closed)) obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    }
    @scala.inline
    def withComplete(complete: () => Unit): ErrorObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (complete != null) obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
      obj.asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    }
    @scala.inline
    def withNext(next: /* value */ T => Unit): ErrorObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (next != null) obj.updateDynamic("next")(js.Any.fromFunction1(next))
      obj.asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    }
  }
  
}

