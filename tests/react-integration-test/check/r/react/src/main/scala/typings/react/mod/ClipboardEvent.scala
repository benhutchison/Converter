package typings.react.mod

import typings.std.DataTransfer
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardEvent[T] extends BaseSyntheticEvent[NativeClipboardEvent, EventTarget with T, EventTarget] {
  var clipboardData: DataTransfer = js.native
}

object ClipboardEvent {
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    clipboardData: DataTransfer,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeClipboardEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): ClipboardEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ClipboardEvent[T]) {
    @scala.inline
    def duplicate: ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ClipboardEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ClipboardEvent[T] with T]
    @scala.inline
    def withBubbles(bubbles: Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withClipboardData(clipboardData: DataTransfer): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: EventTarget with T): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeClipboardEvent): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withTarget(target: EventTarget): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): ClipboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    @scala.inline
    def withType(`type`: String): ClipboardEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ClipboardEvent[T]]
    }
  }
  
}

