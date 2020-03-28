package typings.reactTransitionGroup.transitionGroupMod

import typings.reactTransitionGroup.reactTransitionGroupStrings.abbr
import typings.reactTransitionGroup.reactTransitionGroupStrings.animate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicTransitionGroupProps[T /* <: abbr | animate */] extends js.Object {
  var component: js.UndefOr[T] = js.native
}

object IntrinsicTransitionGroupProps {
  @scala.inline
  def apply[T /* <: abbr | animate */](component: T = null): IntrinsicTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicTransitionGroupProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T <: abbr | animate] (x: IntrinsicTransitionGroupProps[T]) {
    @scala.inline
    def duplicate: IntrinsicTransitionGroupProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactTransitionGroup.transitionGroupMod.IntrinsicTransitionGroupProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IntrinsicTransitionGroupProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactTransitionGroup.transitionGroupMod.IntrinsicTransitionGroupProps[T] with T]
    @scala.inline
    def withComponent(component: T): IntrinsicTransitionGroupProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (component != null) obj.updateDynamic("component")(component.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactTransitionGroup.transitionGroupMod.IntrinsicTransitionGroupProps[T]]
    }
  }
  
}

