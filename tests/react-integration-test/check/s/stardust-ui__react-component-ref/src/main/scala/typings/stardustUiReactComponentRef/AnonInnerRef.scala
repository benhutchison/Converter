package typings.stardustUiReactComponentRef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInnerRef extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.native
  var innerRef: js.UndefOr[scala.Nothing] = js.native
}

object AnonInnerRef {
  @scala.inline
  def apply(
    children: js.UndefOr[scala.Nothing] = js.undefined,
    innerRef: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonInnerRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInnerRef]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonInnerRef) {
    @scala.inline
    def duplicate: AnonInnerRef = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonInnerRef with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef with T]
    @scala.inline
    def withChildrenUndefined: AnonInnerRef = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "children")
      obj.asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef]
    }
    @scala.inline
    def withChildren(children: scala.Nothing): AnonInnerRef = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(children)) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef]
    }
    @scala.inline
    def withInnerRefUndefined: AnonInnerRef = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "innerRef")
      obj.asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef]
    }
    @scala.inline
    def withInnerRef(innerRef: scala.Nothing): AnonInnerRef = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(innerRef)) obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentRef.AnonInnerRef]
    }
  }
  
}

