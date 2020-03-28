package typingsSlinky.react.mod

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelEvent[T] extends MouseEvent[T, NativeWheelEvent] {
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
}

object WheelEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeWheelEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): WheelEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: WheelEvent[T]) {
    @scala.inline
    def duplicate: WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): WheelEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withBubbles(bubbles: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withButton(button: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(button = button.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withButtons(buttons: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withClientX(clientX: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withClientY(clientY: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: EventTarget with T): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withDeltaMode(deltaMode: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(deltaMode = deltaMode.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withDeltaX(deltaX: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withDeltaY(deltaY: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(deltaY = deltaY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withDeltaZ(deltaZ: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(deltaZ = deltaZ.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withMovementX(movementX: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementX = movementX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withMovementY(movementY: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementY = movementY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeWheelEvent): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withPageX(pageX: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withPageY(pageY: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageY = pageY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withRelatedTarget(relatedTarget: EventTarget): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(relatedTarget = relatedTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withScreenX(screenX: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withScreenY(screenY: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenY = screenY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withTarget(target: EventTarget): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): WheelEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    @scala.inline
    def withType(`type`: String): WheelEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.WheelEvent[T]]
    }
  }
  
}

