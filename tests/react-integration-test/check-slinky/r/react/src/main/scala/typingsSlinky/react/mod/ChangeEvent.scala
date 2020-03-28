package typingsSlinky.react.mod

import typingsSlinky.std.Event
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent[T] extends BaseSyntheticEvent[Event, EventTarget with T, EventTarget] {
  @JSName("target")
  var target_ChangeEvent: org.scalajs.dom.raw.EventTarget with T = js.native
}

object ChangeEvent {
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: org.scalajs.dom.raw.EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: org.scalajs.dom.raw.Event,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: org.scalajs.dom.raw.EventTarget with T,
    timeStamp: Double,
    `type`: String
  ): ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ChangeEvent[T]) {
    @scala.inline
    def duplicate: ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ChangeEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T] with T]
    @scala.inline
    def withBubbles(bubbles: Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: org.scalajs.dom.raw.EventTarget with T): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: org.scalajs.dom.raw.Event): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withTarget(target: org.scalajs.dom.raw.EventTarget with T): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): ChangeEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    @scala.inline
    def withType(`type`: String): ChangeEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ChangeEvent[T]]
    }
  }
  
}

