package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  def complete(): Unit = js.native
}

object CompletionObserver {
  @scala.inline
  def apply[T](
    complete: () => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ js.Any => Unit = null,
    next: /* value */ T => Unit = null
  ): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[CompletionObserver[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: CompletionObserver[T]) {
    @scala.inline
    def duplicate: CompletionObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): CompletionObserver[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T] with T]
    @scala.inline
    def withComplete(complete: () => Unit): CompletionObserver[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(complete = js.Any.fromFunction0(complete)), x).asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    @scala.inline
    def withClosedUndefined: CompletionObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "closed")
      obj.asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    }
    @scala.inline
    def withClosed(closed: Boolean): CompletionObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(closed)) obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    }
    @scala.inline
    def withError(error: /* err */ js.Any => Unit): CompletionObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (error != null) obj.updateDynamic("error")(js.Any.fromFunction1(error))
      obj.asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    }
    @scala.inline
    def withNext(next: /* value */ T => Unit): CompletionObserver[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (next != null) obj.updateDynamic("next")(js.Any.fromFunction1(next))
      obj.asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    }
  }
  
}

