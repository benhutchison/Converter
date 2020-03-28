package typings.reactContextmenu.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends js.Object {
  var attributes: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any
  ] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var divider: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    (js.Function3[
      /* event */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function
  ] = js.native
  var preventClose: js.UndefOr[Boolean] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(
    attributes: HTMLAttributes[HTMLDivElement] = null,
    className: String = null,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    onClick: (js.Function3[
      /* event */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function = null,
    preventClose: js.UndefOr[Boolean] = js.undefined
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: MenuItemProps) {
    @scala.inline
    def duplicate: MenuItemProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): MenuItemProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactContextmenu.mod.MenuItemProps with T]
    @scala.inline
    def withAttributes(attributes: HTMLAttributes[HTMLDivElement]): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attributes != null) obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withClassName(className: String): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withData(
      data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any
    ): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (data != null) obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withDisabledUndefined: MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withDividerUndefined: MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "divider")
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withDivider(divider: Boolean): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(divider)) obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withOnClickFunction3(
      onClick: js.Function3[
          /* event */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]
    ): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withOnClickFunction(onClick: js.Function): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withPreventCloseUndefined: MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "preventClose")
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
    @scala.inline
    def withPreventClose(preventClose: Boolean): MenuItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(preventClose)) obj.updateDynamic("preventClose")(preventClose.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.MenuItemProps]
    }
  }
  
}

