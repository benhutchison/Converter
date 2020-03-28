package typings.react.mod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvent[T, E] extends BaseSyntheticEvent[E, EventTarget with T, EventTarget] {
  var altKey: Boolean = js.native
  var button: Double = js.native
  var buttons: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var ctrlKey: Boolean = js.native
  var metaKey: Boolean = js.native
  var movementX: Double = js.native
  var movementY: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: EventTarget = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
}

object MouseEvent {
  @scala.inline
  def apply[T, E](
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
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: E,
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
  ): MouseEvent[T, E] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent[T, E]]
  }
  @scala.inline
  implicit sealed class Sugar[T, E] (x: MouseEvent[T, E]) {
    @scala.inline
    def duplicate: MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (MouseEvent[T, E]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.MouseEvent[T, E] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withBubbles(bubbles: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withButton(button: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(button = button.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withButtons(buttons: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withCancelable(cancelable: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withClientX(clientX: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withClientY(clientY: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withCurrentTarget(currentTarget: EventTarget with T): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withEventPhase(eventPhase: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withMovementX(movementX: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementX = movementX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withMovementY(movementY: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(movementY = movementY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withNativeEvent(nativeEvent: E): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withPageX(pageX: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withPageY(pageY: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageY = pageY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withPersist(persist: () => Unit): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withRelatedTarget(relatedTarget: EventTarget): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(relatedTarget = relatedTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withScreenX(screenX: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withScreenY(screenY: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenY = screenY.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withTarget(target: EventTarget): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): MouseEvent[T, E] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    @scala.inline
    def withType(`type`: String): MouseEvent[T, E] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.MouseEvent[T, E]]
    }
  }
  
}

