package typings.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListener extends js.Object {
  var capture: js.UndefOr[scala.Nothing] = js.native
  var listener: js.UndefOr[scala.Nothing] = js.native
  var targetRef: js.UndefOr[scala.Nothing] = js.native
  var `type`: js.UndefOr[scala.Nothing] = js.native
}

object AnonListener {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Nothing] = js.undefined,
    listener: js.UndefOr[scala.Nothing] = js.undefined,
    targetRef: js.UndefOr[scala.Nothing] = js.undefined,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonListener = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(listener)) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRef)) __obj.updateDynamic("targetRef")(targetRef.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListener]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonListener) {
    @scala.inline
    def duplicate: AnonListener = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonListener with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener with T]
    @scala.inline
    def withCaptureUndefined: AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "capture")
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withCapture(capture: scala.Nothing): AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(capture)) obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withListenerUndefined: AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "listener")
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withListener(listener: scala.Nothing): AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(listener)) obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withTargetRefUndefined: AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "targetRef")
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withTargetRef(targetRef: scala.Nothing): AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(targetRef)) obj.updateDynamic("targetRef")(targetRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withTypeUndefined: AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "type")
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
    @scala.inline
    def withType(`type`: scala.Nothing): AnonListener = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`type`)) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonListener]
    }
  }
  
}

