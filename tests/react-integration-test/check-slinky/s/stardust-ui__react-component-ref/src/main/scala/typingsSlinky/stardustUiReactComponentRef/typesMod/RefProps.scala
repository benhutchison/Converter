package typingsSlinky.stardustUiReactComponentRef.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefProps extends js.Object {
  var children: ReactElement = js.native
  /**
    * Called when a child component will be mounted or updated.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: Ref[_] = js.native
}

object RefProps {
  @scala.inline
  def apply(children: ReactElement, innerRef: Ref[_] = null): RefProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: RefProps) {
    @scala.inline
    def duplicate: RefProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RefProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps with T]
    @scala.inline
    def withChildren(children: ReactElement): RefProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(children = children.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps]
    @scala.inline
    def withInnerRef(innerRef: Ref[_]): RefProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (innerRef != null) obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps]
    }
  }
  
}

