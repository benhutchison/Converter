package typings.vueScrollto.mod

import typings.std.Element
import typings.vueScrollto.vueScrolltoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  // Indicates if user can cancel the scroll or not. Default: true
  var cancelable: js.UndefOr[Boolean] = js.native
  // The container that has to be scrolled. Default: body
  var container: js.UndefOr[String | Element] = js.native
  // The duration (in milliseconds) of the scrolling animation. Default: 500
  var duration: js.UndefOr[Double] = js.native
  // The easing to be used when animating. Default: ease
  var easing: js.UndefOr[String] = js.native
  // The element you want to scroll to.
  var el: js.UndefOr[String | Element] = js.native
  var element: js.UndefOr[String | Element] = js.native
  // The offset that should be applied when scrolling. Default: 0
  var offset: js.UndefOr[Double] = js.native
  // A callback function that should be called when scrolling has been aborted by the user (user scrolled, clicked
  // etc.). Default: noop
  var onCancel: js.UndefOr[js.Function0[Unit] | `false`] = js.native
  // A callback function that should be called when scrolling has ended. Default: noop
  var onDone: js.UndefOr[js.Function0[Unit] | `false`] = js.native
  // Whether or not we want scrolling on the x axis. Default: true
  var x: js.UndefOr[Boolean] = js.native
  // Whether or not we want scrolling on the y axis. Default: true
  var y: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[Boolean] = js.undefined,
    container: String | Element = null,
    duration: Int | Double = null,
    easing: String = null,
    el: String | Element = null,
    element: String | Element = null,
    offset: Int | Double = null,
    onCancel: js.Function0[Unit] | `false` = null,
    onDone: js.Function0[Unit] | `false` = null,
    x: js.UndefOr[Boolean] = js.undefined,
    y: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit sealed class Sugar (x: Options) {
    @scala.inline
    def duplicate: Options = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueScrollto.mod.Options]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Options with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueScrollto.mod.Options with T]
    @scala.inline
    def withCancelableUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "cancelable")
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withCancelable(cancelable: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(cancelable)) obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withContainerElement(container: Element): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (container != null) obj.updateDynamic("container")(container.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withContainerString(container: String): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (container != null) obj.updateDynamic("container")(container.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withDurationInt(duration: Int): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (duration != null) obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withDurationDouble(duration: Double): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (duration != null) obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withEasing(easing: String): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (easing != null) obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withElElement(el: Element): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (el != null) obj.updateDynamic("el")(el.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withElString(el: String): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (el != null) obj.updateDynamic("el")(el.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withElementElement(element: Element): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (element != null) obj.updateDynamic("element")(element.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withElementString(element: String): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (element != null) obj.updateDynamic("element")(element.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOffsetInt(offset: Int): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (offset != null) obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOffsetDouble(offset: Double): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (offset != null) obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOnCancelFalse(onCancel: `false`): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCancel != null) obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOnCancelFunction0(onCancel: js.Function0[Unit]): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCancel != null) obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOnDoneFalse(onDone: `false`): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDone != null) obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withOnDoneFunction0(onDone: js.Function0[Unit]): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDone != null) obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withXUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "x")
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withX(x: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(x)) obj.updateDynamic("x")(x.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withYUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "y")
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
    @scala.inline
    def withY(y: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(y)) obj.updateDynamic("y")(y.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueScrollto.mod.Options]
    }
  }
  
}

