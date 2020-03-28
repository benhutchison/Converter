package typingsSlinky.react.mod

import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchEvent[T] extends BaseSyntheticEvent[NativeTouchEvent, EventTarget with T, EventTarget] {
  var altKey: Boolean = js.native
  var changedTouches: TouchList = js.native
  var ctrlKey: Boolean = js.native
  var metaKey: Boolean = js.native
  var shiftKey: Boolean = js.native
  var targetTouches: TouchList = js.native
  var touches: TouchList = js.native
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
}

object TouchEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    changedTouches: TouchList,
    ctrlKey: Boolean,
    currentTarget: org.scalajs.dom.raw.EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    nativeEvent: NativeTouchEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: org.scalajs.dom.raw.EventTarget,
    targetTouches: TouchList,
    timeStamp: Double,
    touches: TouchList,
    `type`: String
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: TouchEvent[T]) {
    @scala.inline
    def duplicate: TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TouchEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withBubbles(bubbles: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withChangedTouches(changedTouches: TouchList): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: org.scalajs.dom.raw.EventTarget with T): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeTouchEvent): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withTarget(target: org.scalajs.dom.raw.EventTarget): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withTargetTouches(targetTouches: TouchList): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(targetTouches = targetTouches.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withTouches(touches: TouchList): TouchEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(touches = touches.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    @scala.inline
    def withType(`type`: String): TouchEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.TouchEvent[T]]
    }
  }
  
}

