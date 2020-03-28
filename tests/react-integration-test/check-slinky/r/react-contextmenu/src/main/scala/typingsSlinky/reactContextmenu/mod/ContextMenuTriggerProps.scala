package typingsSlinky.reactContextmenu.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuTriggerProps extends js.Object {
  var attributes: js.UndefOr[HTMLAttributes[_]] = js.native
  var collect: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var disable: js.UndefOr[Boolean] = js.native
  var holdToDisplay: js.UndefOr[Double] = js.native
  var id: String = js.native
  var renderTag: js.UndefOr[ReactComponentClass[_]] = js.native
}

object ContextMenuTriggerProps {
  @scala.inline
  def apply(
    id: String,
    attributes: HTMLAttributes[_] = null,
    collect: /* data */ js.Any => _ = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    holdToDisplay: Int | Double = null,
    renderTag: ReactComponentClass[_] = null
  ): ContextMenuTriggerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction1(collect))
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (holdToDisplay != null) __obj.updateDynamic("holdToDisplay")(holdToDisplay.asInstanceOf[js.Any])
    if (renderTag != null) __obj.updateDynamic("renderTag")(renderTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuTriggerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ContextMenuTriggerProps) {
    @scala.inline
    def duplicate: ContextMenuTriggerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ContextMenuTriggerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps with T]
    @scala.inline
    def withId(id: String): ContextMenuTriggerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(id = id.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    @scala.inline
    def withAttributes(attributes: HTMLAttributes[_]): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attributes != null) obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withCollect(collect: /* data */ js.Any => _): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (collect != null) obj.updateDynamic("collect")(js.Any.fromFunction1(collect))
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withDisableUndefined: ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disable")
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withDisable(disable: Boolean): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disable)) obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withHoldToDisplayInt(holdToDisplay: Int): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (holdToDisplay != null) obj.updateDynamic("holdToDisplay")(holdToDisplay.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withHoldToDisplayDouble(holdToDisplay: Double): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (holdToDisplay != null) obj.updateDynamic("holdToDisplay")(holdToDisplay.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
    @scala.inline
    def withRenderTag(renderTag: ReactComponentClass[_]): ContextMenuTriggerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (renderTag != null) obj.updateDynamic("renderTag")(renderTag.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactContextmenu.mod.ContextMenuTriggerProps]
    }
  }
  
}

