package typingsSlinky.reactTransitionGroup

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildFactory extends js.Object {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
}

object AnonChildFactory {
  @scala.inline
  def apply(childFactory: /* child */ ReactElement => ReactElement = null): AnonChildFactory = {
    val __obj = js.Dynamic.literal()
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    __obj.asInstanceOf[AnonChildFactory]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonChildFactory) {
    @scala.inline
    def duplicate: AnonChildFactory = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactTransitionGroup.AnonChildFactory]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonChildFactory with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactTransitionGroup.AnonChildFactory with T]
    @scala.inline
    def withChildFactory(childFactory: /* child */ ReactElement => ReactElement): AnonChildFactory = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (childFactory != null) obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
      obj.asInstanceOf[typingsSlinky.reactTransitionGroup.AnonChildFactory]
    }
  }
  
}

