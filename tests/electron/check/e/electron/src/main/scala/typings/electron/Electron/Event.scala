package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends typings.std.Event {
  var altKey: js.UndefOr[Boolean] = js.native
  var ctrlKey: js.UndefOr[Boolean] = js.native
  var metaKey: js.UndefOr[Boolean] = js.native
  var returnValue: js.Any = js.native
  var shiftKey: js.UndefOr[Boolean] = js.native
  def preventDefault(): Unit = js.native
}

object Event {
  @scala.inline
  def apply(
    preventDefault: () => Unit,
    returnValue: js.Any,
    altKey: js.UndefOr[Boolean] = js.undefined,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    shiftKey: js.UndefOr[Boolean] = js.undefined
  ): Event = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any])
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit sealed class Sugar (x: Event) {
    @scala.inline
    def duplicate: Event = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.electron.Electron.Event]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Event with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.Event with T]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): Event = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typings.electron.Electron.Event]
    @scala.inline
    def withReturnValue(returnValue: js.Any): Event = js.Dynamic.global.Object.assign(js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any]), x).asInstanceOf[typings.electron.Electron.Event]
    @scala.inline
    def withAltKeyUndefined: Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "altKey")
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withAltKey(altKey: Boolean): Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(altKey)) obj.updateDynamic("altKey")(altKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withCtrlKeyUndefined: Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "ctrlKey")
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(ctrlKey)) obj.updateDynamic("ctrlKey")(ctrlKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withMetaKeyUndefined: Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "metaKey")
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withMetaKey(metaKey: Boolean): Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(metaKey)) obj.updateDynamic("metaKey")(metaKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withShiftKeyUndefined: Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "shiftKey")
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
    @scala.inline
    def withShiftKey(shiftKey: Boolean): Event = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(shiftKey)) obj.updateDynamic("shiftKey")(shiftKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.electron.Electron.Event]
    }
  }
  
}

