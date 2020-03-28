package typingsSlinky.react.mod

import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent[T] extends BaseSyntheticEvent[NativeKeyboardEvent, EventTarget with T, EventTarget] {
  var altKey: Boolean = js.native
  var charCode: Double = js.native
  var ctrlKey: Boolean = js.native
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String = js.native
  var keyCode: Double = js.native
  var locale: String = js.native
  var location: Double = js.native
  var metaKey: Boolean = js.native
  var repeat: Boolean = js.native
  var shiftKey: Boolean = js.native
  var which: Double = js.native
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: org.scalajs.dom.raw.EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    nativeEvent: NativeKeyboardEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    repeat: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: org.scalajs.dom.raw.EventTarget,
    timeStamp: Double,
    `type`: String,
    which: Double
  ): KeyboardEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: KeyboardEvent[T]) {
    @scala.inline
    def duplicate: KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): KeyboardEvent[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T] with T]
    @scala.inline
    def withAltKey(altKey: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withBubbles(bubbles: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withCancelable(cancelable: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withCharCode(charCode: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(charCode = charCode.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withCtrlKey(ctrlKey: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withCurrentTarget(currentTarget: org.scalajs.dom.raw.EventTarget with T): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withDefaultPrevented(defaultPrevented: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withEventPhase(eventPhase: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withGetModifierState(getModifierState: String => Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(getModifierState = js.Any.fromFunction1(getModifierState)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withIsDefaultPrevented(isDefaultPrevented: () => Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withIsPropagationStopped(isPropagationStopped: () => Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isPropagationStopped = js.Any.fromFunction0(isPropagationStopped)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withIsTrusted(isTrusted: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withKey(key: String): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(key = key.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withKeyCode(keyCode: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withLocale(locale: String): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(locale = locale.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withLocation(location: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(location = location.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withMetaKey(metaKey: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(metaKey = metaKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withNativeEvent(nativeEvent: NativeKeyboardEvent): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withPersist(persist: () => Unit): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(persist = js.Any.fromFunction0(persist)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withPreventDefault(preventDefault: () => Unit): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withRepeat(repeat: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withShiftKey(shiftKey: Boolean): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(shiftKey = shiftKey.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withStopPropagation(stopPropagation: () => Unit): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation)), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withTarget(target: org.scalajs.dom.raw.EventTarget): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withTimeStamp(timeStamp: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    @scala.inline
    def withType(`type`: String): KeyboardEvent[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
    }
    @scala.inline
    def withWhich(which: Double): KeyboardEvent[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(which = which.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.KeyboardEvent[T]]
  }
  
}

