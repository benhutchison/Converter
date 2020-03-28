package typingsSlinky.react.mod

import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEvent[T] extends BaseSyntheticEvent[NativeTransitionEvent, EventTarget with T, EventTarget] {
  var elapsedTime: Double = js.native
  var propertyName: String = js.native
  var pseudoElement: String = js.native
}

object TransitionEvent {
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: org.scalajs.dom.raw.EventTarget with T,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeTransitionEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    propertyName: String,
    pseudoElement: String,
    stopPropagation: () => Unit,
    target: org.scalajs.dom.raw.EventTarget,
    timeStamp: Double,
    `type`: String
  ): TransitionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), propertyName = propertyName.asInstanceOf[js.Any], pseudoElement = pseudoElement.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: TransitionEvent[T]) {
    @scala.inline
    def duplicate: TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TransitionEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T] with T]
    @scala.inline
    def withBubbles(bubbles: Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: org.scalajs.dom.raw.EventTarget with T): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withElapsedTime(elapsedTime: Double): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeTransitionEvent): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withPropertyName(propertyName: String): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withPseudoElement(pseudoElement: String): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(pseudoElement = pseudoElement.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withTarget(target: org.scalajs.dom.raw.EventTarget): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): TransitionEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    @scala.inline
    def withType(`type`: String): TransitionEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.TransitionEvent[T]]
    }
  }
  
}

