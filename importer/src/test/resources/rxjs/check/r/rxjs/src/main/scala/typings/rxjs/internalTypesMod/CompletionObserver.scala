package typings.rxjs.internalTypesMod

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
}

