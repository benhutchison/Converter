package typings.reactContextmenu.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var hideOnLeave: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var onHide: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onMouseLeave: js.UndefOr[
    (js.Function3[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function
  ] = js.native
  var onShow: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
}

object ContextMenuProps {
  @scala.inline
  def apply(
    id: String,
    className: String = null,
    data: js.Any = null,
    hideOnLeave: js.UndefOr[Boolean] = js.undefined,
    onHide: /* event */ js.Any => Unit = null,
    onMouseLeave: (js.Function3[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function = null,
    onShow: /* event */ js.Any => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): ContextMenuProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnLeave)) __obj.updateDynamic("hideOnLeave")(hideOnLeave.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ContextMenuProps) {
    @scala.inline
    def duplicate: ContextMenuProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ContextMenuProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps with T]
    @scala.inline
    def withId(id: String): ContextMenuProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(id = id.asInstanceOf[js.Any]), x).asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    @scala.inline
    def withClassName(className: String): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withData(data: js.Any): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (data != null) obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withHideOnLeaveUndefined: ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hideOnLeave")
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withHideOnLeave(hideOnLeave: Boolean): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hideOnLeave)) obj.updateDynamic("hideOnLeave")(hideOnLeave.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withOnHide(onHide: /* event */ js.Any => Unit): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onHide != null) obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withOnMouseLeaveFunction3(
      onMouseLeave: js.Function3[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]
    ): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withOnMouseLeaveFunction(onMouseLeave: js.Function): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withOnShow(onShow: /* event */ js.Any => Unit): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onShow != null) obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withRtlUndefined: ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "rtl")
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
    @scala.inline
    def withRtl(rtl: Boolean): ContextMenuProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(rtl)) obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactContextmenu.mod.ContextMenuProps]
    }
  }
  
}

