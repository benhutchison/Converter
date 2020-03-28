package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildFactory extends js.Object {
  var childFactory: js.UndefOr[js.Function1[/* child */ Element, Element]] = js.native
}

object AnonChildFactory {
  @scala.inline
  def apply(childFactory: /* child */ Element => CallbackTo[Element] = null): AnonChildFactory = {
    val __obj = js.Dynamic.literal()
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1((t0: /* child */ japgolly.scalajs.react.raw.React.Element) => childFactory(t0).runNow()))
    __obj.asInstanceOf[AnonChildFactory]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonChildFactory) {
    @scala.inline
    def duplicate: AnonChildFactory = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.reactTransitionGroup.AnonChildFactory]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonChildFactory with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactTransitionGroup.AnonChildFactory with T]
    @scala.inline
    def withChildFactory(childFactory: /* child */ Element => CallbackTo[Element]): AnonChildFactory = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (childFactory != null) obj.updateDynamic("childFactory")(js.Any.fromFunction1((t0: /* child */ japgolly.scalajs.react.raw.React.Element) => childFactory(t0).runNow()))
      obj.asInstanceOf[typingsJapgolly.reactTransitionGroup.AnonChildFactory]
    }
  }
  
}

