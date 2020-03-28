package typingsSlinky.reactContextmenu.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    (js.Function3[
      /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function
  ] = js.native
  var preventCloseOnClick: js.UndefOr[Boolean] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var title: ReactElement | ReactText = js.native
}

object SubMenuProps {
  @scala.inline
  def apply(
    title: ReactElement | ReactText,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hoverDelay: Int | Double = null,
    onClick: (js.Function3[
      /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function = null,
    preventCloseOnClick: js.UndefOr[Boolean] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): SubMenuProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(preventCloseOnClick)) __obj.updateDynamic("preventCloseOnClick")(preventCloseOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMenuProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: SubMenuProps) {
    @scala.inline
    def duplicate: SubMenuProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SubMenuProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps with T]
    @scala.inline
    def withTitleReactElement(title: ReactElement): SubMenuProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(title = title.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    @scala.inline
    def withTitleReactText(title: ReactText): SubMenuProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(title = title.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    @scala.inline
    def withClassName(className: String): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withDisabledUndefined: SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withHoverDelayInt(hoverDelay: Int): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (hoverDelay != null) obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withHoverDelayDouble(hoverDelay: Double): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (hoverDelay != null) obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withOnClickFunction3(
      onClick: js.Function3[
          /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]
    ): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withOnClickFunction(onClick: js.Function): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withPreventCloseOnClickUndefined: SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "preventCloseOnClick")
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withPreventCloseOnClick(preventCloseOnClick: Boolean): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(preventCloseOnClick)) obj.updateDynamic("preventCloseOnClick")(preventCloseOnClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withRtlUndefined: SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "rtl")
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
    @scala.inline
    def withRtl(rtl: Boolean): SubMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(rtl)) obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.SubMenuProps]
    }
  }
  
}

