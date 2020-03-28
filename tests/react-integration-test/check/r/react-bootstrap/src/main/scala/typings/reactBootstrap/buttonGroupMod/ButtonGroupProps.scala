package typings.reactBootstrap.buttonGroupMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupProps
  extends AllHTMLAttributes[ButtonGroup]
     with ClassAttributes[ButtonGroup] {
  var block: js.UndefOr[Boolean] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ButtonGroup] = null,
    ClassAttributes: ClassAttributes[ButtonGroup] = null,
    block: js.UndefOr[Boolean] = js.undefined,
    bsSize: Sizes = null,
    bsStyle: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ButtonGroupProps) {
    @scala.inline
    def duplicate: ButtonGroupProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ButtonGroupProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps with T]
    @scala.inline
    def withAllHTMLAttributes(AllHTMLAttributes: AllHTMLAttributes[ButtonGroup]): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(obj, AllHTMLAttributes)
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withClassAttributes(ClassAttributes: ClassAttributes[ButtonGroup]): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(obj, ClassAttributes)
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBlockUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "block")
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBlock(block: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(block)) obj.updateDynamic("block")(block.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBsSize(bsSize: Sizes): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bsSize != null) obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBsStyle(bsStyle: String): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bsStyle != null) obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withJustifiedUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "justified")
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withJustified(justified: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(justified)) obj.updateDynamic("justified")(justified.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withVerticalUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "vertical")
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withVertical(vertical: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(vertical)) obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactBootstrap.buttonGroupMod.ButtonGroupProps]
    }
  }
  
}

