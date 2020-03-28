package typingsSlinky.react.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.TagMod
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.native
  var onError: js.UndefOr[ReactEventHandler[T]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onReset: js.UndefOr[FormEventHandler[T]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    children: TagMod[Any] = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    onAbort: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[T] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[T] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[T] => Unit = null,
    onAuxClick: SyntheticMouseEvent[T] => Unit = null,
    onBeforeInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[T] => Unit = null,
    onCanPlay: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onCanPlayThrough: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onChange: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onClick: SyntheticMouseEvent[T] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[T] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[T] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[T] => Unit = null,
    onContextMenu: SyntheticMouseEvent[T] => Unit = null,
    onCopy: SyntheticClipboardEvent[T] => Unit = null,
    onCut: SyntheticClipboardEvent[T] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[T] => Unit = null,
    onDrag: DragEvent[T] => Unit = null,
    onDragEnd: DragEvent[T] => Unit = null,
    onDragEnter: DragEvent[T] => Unit = null,
    onDragExit: DragEvent[T] => Unit = null,
    onDragLeave: DragEvent[T] => Unit = null,
    onDragOver: DragEvent[T] => Unit = null,
    onDragStart: DragEvent[T] => Unit = null,
    onDrop: DragEvent[T] => Unit = null,
    onDurationChange: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onEmptied: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onEncrypted: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onEnded: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onError: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onFocus: SyntheticFocusEvent[T] => Unit = null,
    onInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onInvalid: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[T] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[T] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[T] => Unit = null,
    onLoad: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onLoadStart: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onLoadedData: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onLoadedMetadata: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onMouseDown: SyntheticMouseEvent[T] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[T] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[T] => Unit = null,
    onMouseMove: SyntheticMouseEvent[T] => Unit = null,
    onMouseOut: SyntheticMouseEvent[T] => Unit = null,
    onMouseOver: SyntheticMouseEvent[T] => Unit = null,
    onMouseUp: SyntheticMouseEvent[T] => Unit = null,
    onPaste: SyntheticClipboardEvent[T] => Unit = null,
    onPause: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onPlay: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onPlaying: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[T] => Unit = null,
    onPointerDown: SyntheticPointerEvent[T] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[T] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[T] => Unit = null,
    onPointerMove: SyntheticPointerEvent[T] => Unit = null,
    onPointerOut: SyntheticPointerEvent[T] => Unit = null,
    onPointerOver: SyntheticPointerEvent[T] => Unit = null,
    onPointerUp: SyntheticPointerEvent[T] => Unit = null,
    onProgress: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onRateChange: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onReset: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onScroll: SyntheticUIEvent[T] => Unit = null,
    onSeeked: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onSeeking: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onSelect: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onStalled: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onSubmit: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit = null,
    onSuspend: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onTimeUpdate: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[T] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[T] => Unit = null,
    onTouchMove: SyntheticTouchEvent[T] => Unit = null,
    onTouchStart: SyntheticTouchEvent[T] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[T] => Unit = null,
    onVolumeChange: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onWaiting: slinky.core.SyntheticEvent[Event, T] => Unit = null,
    onWheel: SyntheticWheelEvent[T] => Unit = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: DOMAttributes[T]) {
    @scala.inline
    def duplicate: DOMAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DOMAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T] with T]
    @scala.inline
    def withChildren(children: TagMod[Any]): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAbort(onAbort: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: SyntheticAnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: SyntheticAnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: SyntheticAnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnBlur(onBlur: SyntheticFocusEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnChange(onChange: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnClick(onClick: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: SyntheticCompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: SyntheticCompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: SyntheticCompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCopy(onCopy: SyntheticClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCut(onCut: SyntheticClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEmptied(onEmptied: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEnded(onEnded: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnError(onError: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnFocus(onFocus: SyntheticFocusEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnInput(onInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnInvalid(onInvalid: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: SyntheticKeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: SyntheticKeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: SyntheticKeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoad(onLoad: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: SyntheticMouseEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPaste(onPaste: SyntheticClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPause(onPause: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPlay(onPlay: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPlaying(onPlaying: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: SyntheticPointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnProgress(onProgress: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnRateChange(onRateChange: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnReset(onReset: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnScroll(onScroll: SyntheticUIEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSeeked(onSeeked: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSeeking(onSeeking: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSelect(onSelect: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnStalled(onStalled: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSubmit(onSubmit: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSuspend(onSuspend: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: SyntheticTouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: SyntheticTouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: SyntheticTouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: SyntheticTouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: SyntheticTransitionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnWaiting(onWaiting: slinky.core.SyntheticEvent[Event, T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnWheel(onWheel: SyntheticWheelEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typingsSlinky.react.mod.DOMAttributes[T]]
    }
  }
  
}

