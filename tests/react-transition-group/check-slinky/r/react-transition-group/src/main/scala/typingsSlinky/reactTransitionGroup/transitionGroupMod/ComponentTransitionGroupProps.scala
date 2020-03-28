package typingsSlinky.reactTransitionGroup.transitionGroupMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentTransitionGroupProps[T /* <: ReactComponentClass[_] */] extends js.Object {
  var component: T = js.native
}

object ComponentTransitionGroupProps {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](component: T): ComponentTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T <: ReactComponentClass[_]] (x: ComponentTransitionGroupProps[T]) {
    @scala.inline
    def duplicate: ComponentTransitionGroupProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactTransitionGroup.transitionGroupMod.ComponentTransitionGroupProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ComponentTransitionGroupProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactTransitionGroup.transitionGroupMod.ComponentTransitionGroupProps[T] with T]
    @scala.inline
    def withComponent(component: T): ComponentTransitionGroupProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(component = component.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactTransitionGroup.transitionGroupMod.ComponentTransitionGroupProps[T]]
  }
  
}

