package typings.react.mod

import typings.react.AnonHtml
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
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
    children: ReactNode = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    onAbort: SyntheticEvent[T, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[T] => Unit = null,
    onAnimationIteration: AnimationEvent[T] => Unit = null,
    onAnimationStart: AnimationEvent[T] => Unit = null,
    onAuxClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[T] => Unit = null,
    onBlur: FocusEvent[T] => Unit = null,
    onCanPlay: SyntheticEvent[T, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[T, Event] => Unit = null,
    onChange: FormEvent[T] => Unit = null,
    onClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[T] => Unit = null,
    onCompositionStart: CompositionEvent[T] => Unit = null,
    onCompositionUpdate: CompositionEvent[T] => Unit = null,
    onContextMenu: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[T] => Unit = null,
    onCut: ClipboardEvent[T] => Unit = null,
    onDoubleClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[T] => Unit = null,
    onDragEnd: DragEvent[T] => Unit = null,
    onDragEnter: DragEvent[T] => Unit = null,
    onDragExit: DragEvent[T] => Unit = null,
    onDragLeave: DragEvent[T] => Unit = null,
    onDragOver: DragEvent[T] => Unit = null,
    onDragStart: DragEvent[T] => Unit = null,
    onDrop: DragEvent[T] => Unit = null,
    onDurationChange: SyntheticEvent[T, Event] => Unit = null,
    onEmptied: SyntheticEvent[T, Event] => Unit = null,
    onEncrypted: SyntheticEvent[T, Event] => Unit = null,
    onEnded: SyntheticEvent[T, Event] => Unit = null,
    onError: SyntheticEvent[T, Event] => Unit = null,
    onFocus: FocusEvent[T] => Unit = null,
    onInput: FormEvent[T] => Unit = null,
    onInvalid: FormEvent[T] => Unit = null,
    onKeyDown: KeyboardEvent[T] => Unit = null,
    onKeyPress: KeyboardEvent[T] => Unit = null,
    onKeyUp: KeyboardEvent[T] => Unit = null,
    onLoad: SyntheticEvent[T, Event] => Unit = null,
    onLoadStart: SyntheticEvent[T, Event] => Unit = null,
    onLoadedData: SyntheticEvent[T, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[T, Event] => Unit = null,
    onMouseDown: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[T] => Unit = null,
    onPause: SyntheticEvent[T, Event] => Unit = null,
    onPlay: SyntheticEvent[T, Event] => Unit = null,
    onPlaying: SyntheticEvent[T, Event] => Unit = null,
    onPointerCancel: PointerEvent[T] => Unit = null,
    onPointerDown: PointerEvent[T] => Unit = null,
    onPointerEnter: PointerEvent[T] => Unit = null,
    onPointerLeave: PointerEvent[T] => Unit = null,
    onPointerMove: PointerEvent[T] => Unit = null,
    onPointerOut: PointerEvent[T] => Unit = null,
    onPointerOver: PointerEvent[T] => Unit = null,
    onPointerUp: PointerEvent[T] => Unit = null,
    onProgress: SyntheticEvent[T, Event] => Unit = null,
    onRateChange: SyntheticEvent[T, Event] => Unit = null,
    onReset: FormEvent[T] => Unit = null,
    onScroll: UIEvent[T] => Unit = null,
    onSeeked: SyntheticEvent[T, Event] => Unit = null,
    onSeeking: SyntheticEvent[T, Event] => Unit = null,
    onSelect: SyntheticEvent[T, Event] => Unit = null,
    onStalled: SyntheticEvent[T, Event] => Unit = null,
    onSubmit: FormEvent[T] => Unit = null,
    onSuspend: SyntheticEvent[T, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[T, Event] => Unit = null,
    onTouchCancel: TouchEvent[T] => Unit = null,
    onTouchEnd: TouchEvent[T] => Unit = null,
    onTouchMove: TouchEvent[T] => Unit = null,
    onTouchStart: TouchEvent[T] => Unit = null,
    onTransitionEnd: TransitionEvent[T] => Unit = null,
    onVolumeChange: SyntheticEvent[T, Event] => Unit = null,
    onWaiting: SyntheticEvent[T, Event] => Unit = null,
    onWheel: WheelEvent[T] => Unit = null
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
    def duplicate: DOMAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.DOMAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DOMAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.DOMAttributes[T] with T]
    @scala.inline
    def withChildren(children: ReactNode): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAbort(onAbort: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: AnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: AnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: AnimationEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnBlur(onBlur: FocusEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnChange(onChange: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnClick(onClick: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: CompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: CompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: CompositionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCopy(onCopy: ClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnCut(onCut: ClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEmptied(onEmptied: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnEnded(onEnded: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnError(onError: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnFocus(onFocus: FocusEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnInput(onInput: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnInvalid(onInvalid: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: KeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: KeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: KeyboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoad(onLoad: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: MouseEvent[T, NativeMouseEvent] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPaste(onPaste: ClipboardEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPause(onPause: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPlay(onPlay: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPlaying(onPlaying: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: PointerEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnProgress(onProgress: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnRateChange(onRateChange: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnReset(onReset: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnScroll(onScroll: UIEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSeeked(onSeeked: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSeeking(onSeeking: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSelect(onSelect: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnStalled(onStalled: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSubmit(onSubmit: FormEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnSuspend(onSuspend: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: TouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: TouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: TouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: TouchEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: TransitionEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnWaiting(onWaiting: SyntheticEvent[T, Event] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withOnWheel(onWheel: WheelEvent[T] => Unit): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
  }
  
}

