package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Event System
// ----------------------------------------------------------------------
// TODO: change any to unknown when moving to TS v3
@js.native
trait BaseSyntheticEvent[E, C, T] extends js.Object {
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: C = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  var isTrusted: Boolean = js.native
  var nativeEvent: E = js.native
  var target: T = js.native
  var timeStamp: Double = js.native
  var `type`: String = js.native
  def isDefaultPrevented(): Boolean = js.native
  def isPropagationStopped(): Boolean = js.native
  def persist(): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object BaseSyntheticEvent {
  @scala.inline
  def apply[E, C, T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: C,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: E,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: T,
    timeStamp: Double,
    `type`: String
  ): BaseSyntheticEvent[E, C, T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSyntheticEvent[E, C, T]]
  }
  @scala.inline
  implicit sealed class Sugar[E, C, T] (x: BaseSyntheticEvent[E, C, T]) {
    @scala.inline
    def duplicate: BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (BaseSyntheticEvent[E, C, T]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T] with T]
    @scala.inline
    def withBubbles(bubbles: Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withCurrentTarget(currentTarget: C): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withNativeEvent(nativeEvent: E): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withPersist(persist: () => Unit): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withTarget(target: T): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): BaseSyntheticEvent[E, C, T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    @scala.inline
    def withType(`type`: String): BaseSyntheticEvent[E, C, T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.BaseSyntheticEvent[E, C, T]]
    }
  }
  
}

