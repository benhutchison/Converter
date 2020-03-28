package typings.react.mod

import typings.react.reactStrings.mouse
import typings.react.reactStrings.pen
import typings.react.reactStrings.touch
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEvent[T] extends MouseEvent[T, NativePointerEvent] {
  var height: Double = js.native
  var isPrimary: Boolean = js.native
  var pointerId: Double = js.native
  var pointerType: mouse | pen | touch = js.native
  var pressure: Double = js.native
  var tiltX: Double = js.native
  var tiltY: Double = js.native
  var width: Double = js.native
}

object PointerEvent {
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
    eventPhase: Double,
    getModifierState: String => Boolean,
    height: Double,
    isDefaultPrevented: () => Boolean,
    isPrimary: Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativePointerEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    pointerId: Double,
    pointerType: mouse | pen | touch,
    pressure: Double,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    `type`: String,
    width: Double
  ): PointerEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: PointerEvent[T]) {
    @scala.inline
    def duplicate: PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): PointerEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.PointerEvent[T] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withBubbles(bubbles: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withButton(button: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(button = button.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withButtons(buttons: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withClientX(clientX: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withClientY(clientY: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: EventTarget with T): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withHeight(height: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(height = height.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withIsPrimary(isPrimary: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withMovementX(movementX: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementX = movementX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withMovementY(movementY: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementY = movementY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativePointerEvent): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPageX(pageX: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPageY(pageY: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageY = pageY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPointerId(pointerId: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPointerTypePen(pointerType: pen): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pointerType = pointerType.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPointerTypeTouch(pointerType: touch): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pointerType = pointerType.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPointerTypeMouse(pointerType: mouse): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pointerType = pointerType.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPressure(pressure: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pressure = pressure.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withRelatedTarget(relatedTarget: EventTarget): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(relatedTarget = relatedTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withScreenX(screenX: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withScreenY(screenY: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenY = screenY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withTarget(target: EventTarget): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withTiltX(tiltX: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(tiltX = tiltX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withTiltY(tiltY: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(tiltY = tiltY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
    @scala.inline
    def withType(`type`: String): PointerEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.PointerEvent[T]]
    }
    @scala.inline
    def withWidth(width: Double): PointerEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(width = width.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.PointerEvent[T]]
  }
  
}

