package typings.react.mod

import typings.std.DataTransfer
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent[T] extends MouseEvent[T, NativeDragEvent] {
  var dataTransfer: DataTransfer = js.native
}

object DragEvent {
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
    dataTransfer: DataTransfer,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeDragEvent,
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
  ): DragEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], dataTransfer = dataTransfer.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: DragEvent[T]) {
    @scala.inline
    def duplicate: DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DragEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.DragEvent[T] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withBubbles(bubbles: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withButton(button: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(button = button.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withButtons(buttons: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withClientX(clientX: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withClientY(clientY: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: EventTarget with T): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withDataTransfer(dataTransfer: DataTransfer): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(dataTransfer = dataTransfer.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withMovementX(movementX: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementX = movementX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withMovementY(movementY: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementY = movementY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeDragEvent): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withPageX(pageX: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withPageY(pageY: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageY = pageY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withRelatedTarget(relatedTarget: EventTarget): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(relatedTarget = relatedTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withScreenX(screenX: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withScreenY(screenY: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenY = screenY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withTarget(target: EventTarget): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): DragEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.DragEvent[T]]
    @scala.inline
    def withType(`type`: String): DragEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DragEvent[T]]
    }
  }
  
}

