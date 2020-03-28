package typings.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCapture extends js.Object {
  var capture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<boolean> */ js.Any = js.native
  var listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<(args : ...any): any> */ js.Any = js.native
  var targetRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<imported_react.RefObject<Node | Window>> */ js.Any = js.native
  var `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<'waiting' | 'error' | 'abort' | 'cancel' | 'progress' | 'ended' | 'change' | 'input' | 'select' | 'fullscreenchange' | 'fullscreenerror' | 'readystatechange' | 'visibilitychange' | 'animationcancel' | 'animationend' | 'animationiteration' | 'animationstart' | 'auxclick' | 'blur' | 'canplay' | 'canplaythrough' | 'click' | 'close' | 'contextmenu' | 'cuechange' | 'dblclick' | 'drag' | 'dragend' | 'dragenter' | 'dragexit' | 'dragleave' | 'dragover' | 'dragstart' | 'drop' | 'durationchange' | 'emptied' | 'focus' | 'gotpointercapture' | 'invalid' | 'keydown' | 'keypress' | 'keyup' | 'load' | 'loadeddata' | 'loadedmetadata' | 'loadend' | 'loadstart' | 'lostpointercapture' | 'mousedown' | 'mouseenter' | 'mouseleave' | 'mousemove' | 'mouseout' | 'mouseover' | 'mouseup' | 'pause' | 'play' | 'playing' | 'pointercancel' | 'pointerdown' | 'pointerenter' | 'pointerleave' | 'pointermove' | 'pointerout' | 'pointerover' | 'pointerup' | 'ratechange' | 'reset' | 'resize' | 'scroll' | 'securitypolicyviolation' | 'seeked' | 'seeking' | 'stalled' | 'submit' | 'suspend' | 'timeupdate' | 'toggle' | 'touchcancel' | 'touchend' | 'touchmove' | 'touchstart' | 'transitioncancel' | 'transitionend' | 'transitionrun' | 'transitionstart' | 'volumechange' | 'wheel' | 'copy' | 'cut' | 'paste'> */ js.Any = js.native
}

object AnonCapture {
  @scala.inline
  def apply(
    capture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<boolean> */ js.Any,
    listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<(args : ...any): any> */ js.Any,
    targetRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<imported_react.RefObject<Node | Window>> */ js.Any,
    `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<'waiting' | 'error' | 'abort' | 'cancel' | 'progress' | 'ended' | 'change' | 'input' | 'select' | 'fullscreenchange' | 'fullscreenerror' | 'readystatechange' | 'visibilitychange' | 'animationcancel' | 'animationend' | 'animationiteration' | 'animationstart' | 'auxclick' | 'blur' | 'canplay' | 'canplaythrough' | 'click' | 'close' | 'contextmenu' | 'cuechange' | 'dblclick' | 'drag' | 'dragend' | 'dragenter' | 'dragexit' | 'dragleave' | 'dragover' | 'dragstart' | 'drop' | 'durationchange' | 'emptied' | 'focus' | 'gotpointercapture' | 'invalid' | 'keydown' | 'keypress' | 'keyup' | 'load' | 'loadeddata' | 'loadedmetadata' | 'loadend' | 'loadstart' | 'lostpointercapture' | 'mousedown' | 'mouseenter' | 'mouseleave' | 'mousemove' | 'mouseout' | 'mouseover' | 'mouseup' | 'pause' | 'play' | 'playing' | 'pointercancel' | 'pointerdown' | 'pointerenter' | 'pointerleave' | 'pointermove' | 'pointerout' | 'pointerover' | 'pointerup' | 'ratechange' | 'reset' | 'resize' | 'scroll' | 'securitypolicyviolation' | 'seeked' | 'seeking' | 'stalled' | 'submit' | 'suspend' | 'timeupdate' | 'toggle' | 'touchcancel' | 'touchend' | 'touchmove' | 'touchstart' | 'transitioncancel' | 'transitionend' | 'transitionrun' | 'transitionstart' | 'volumechange' | 'wheel' | 'copy' | 'cut' | 'paste'> */ js.Any
  ): AnonCapture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapture]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonCapture) {
    @scala.inline
    def duplicate: AnonCapture = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonCapture with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture with T]
    @scala.inline
    def withCapture(
      capture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<boolean> */ js.Any
    ): AnonCapture = js.Dynamic.global.Object.assign(js.Dynamic.literal(capture = capture.asInstanceOf[js.Any]), x).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture]
    @scala.inline
    def withListener(
      listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<(args : ...any): any> */ js.Any
    ): AnonCapture = js.Dynamic.global.Object.assign(js.Dynamic.literal(listener = listener.asInstanceOf[js.Any]), x).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture]
    @scala.inline
    def withTargetRef(
      targetRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<imported_react.RefObject<Node | Window>> */ js.Any
    ): AnonCapture = js.Dynamic.global.Object.assign(js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any]), x).asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture]
    @scala.inline
    def withType(
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<'waiting' | 'error' | 'abort' | 'cancel' | 'progress' | 'ended' | 'change' | 'input' | 'select' | 'fullscreenchange' | 'fullscreenerror' | 'readystatechange' | 'visibilitychange' | 'animationcancel' | 'animationend' | 'animationiteration' | 'animationstart' | 'auxclick' | 'blur' | 'canplay' | 'canplaythrough' | 'click' | 'close' | 'contextmenu' | 'cuechange' | 'dblclick' | 'drag' | 'dragend' | 'dragenter' | 'dragexit' | 'dragleave' | 'dragover' | 'dragstart' | 'drop' | 'durationchange' | 'emptied' | 'focus' | 'gotpointercapture' | 'invalid' | 'keydown' | 'keypress' | 'keyup' | 'load' | 'loadeddata' | 'loadedmetadata' | 'loadend' | 'loadstart' | 'lostpointercapture' | 'mousedown' | 'mouseenter' | 'mouseleave' | 'mousemove' | 'mouseout' | 'mouseover' | 'mouseup' | 'pause' | 'play' | 'playing' | 'pointercancel' | 'pointerdown' | 'pointerenter' | 'pointerleave' | 'pointermove' | 'pointerout' | 'pointerover' | 'pointerup' | 'ratechange' | 'reset' | 'resize' | 'scroll' | 'securitypolicyviolation' | 'seeked' | 'seeking' | 'stalled' | 'submit' | 'suspend' | 'timeupdate' | 'toggle' | 'touchcancel' | 'touchend' | 'touchmove' | 'touchstart' | 'transitioncancel' | 'transitionend' | 'transitionrun' | 'transitionstart' | 'volumechange' | 'wheel' | 'copy' | 'cut' | 'paste'> */ js.Any
    ): AnonCapture = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.AnonCapture]
    }
  }
  
}

