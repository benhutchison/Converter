package typings.reactDropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.none
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneRootProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var refKey: js.UndefOr[String] = js.native
}

object DropzoneRootProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLElement] => Unit = null,
    onBlur: FocusEvent[HTMLElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onChange: FormEvent[HTMLElement] => Unit = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLElement] => Unit = null,
    onCut: ClipboardEvent[HTMLElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLElement] => Unit = null,
    onDragEnd: DragEvent[HTMLElement] => Unit = null,
    onDragEnter: DragEvent[HTMLElement] => Unit = null,
    onDragExit: DragEvent[HTMLElement] => Unit = null,
    onDragLeave: DragEvent[HTMLElement] => Unit = null,
    onDragOver: DragEvent[HTMLElement] => Unit = null,
    onDragStart: DragEvent[HTMLElement] => Unit = null,
    onDrop: DragEvent[HTMLElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLElement] => Unit = null,
    onInput: FormEvent[HTMLElement] => Unit = null,
    onInvalid: FormEvent[HTMLElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLElement] => Unit = null,
    onPause: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onReset: FormEvent[HTMLElement] => Unit = null,
    onScroll: UIEvent[HTMLElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    refKey: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): DropzoneRootProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (refKey != null) __obj.updateDynamic("refKey")(refKey.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneRootProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: DropzoneRootProps) {
    @scala.inline
    def duplicate: DropzoneRootProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DropzoneRootProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withAbout(about: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (about != null) obj.updateDynamic("about")(about.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withAccessKey(accessKey: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accessKey != null) obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-activedescendant`(`aria-activedescendant`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-activedescendant` != null) obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-atomicUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-atomic")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-atomic`(`aria-atomic`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-atomic`)) obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-autocompleteBoth`(`aria-autocomplete`: both): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-autocompleteNone`(`aria-autocomplete`: none): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-autocompleteList`(`aria-autocomplete`: list): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-autocompleteInline`(`aria-autocomplete`: `inline`): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-busyUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-busy")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-busy`(`aria-busy`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-busy`)) obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-checkedMixed`(`aria-checked`: mixed): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-checkedBoolean`(`aria-checked`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colcountInt`(`aria-colcount`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colcountDouble`(`aria-colcount`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colindexInt`(`aria-colindex`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colindexDouble`(`aria-colindex`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colspanInt`(`aria-colspan`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-colspanDouble`(`aria-colspan`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-controls`(`aria-controls`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-controls` != null) obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentStep`(`aria-current`: step): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentLocation`(`aria-current`: location): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentPage`(`aria-current`: page): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentBoolean`(`aria-current`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentDate`(`aria-current`: date): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-currentTime`(`aria-current`: time): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-describedby`(`aria-describedby`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-describedby` != null) obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-details`(`aria-details`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-details` != null) obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-disabledUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-disabled")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-disabled`(`aria-disabled`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-disabled`)) obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectMove`(`aria-dropeffect`: move): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectExecute`(`aria-dropeffect`: execute): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectPopup`(`aria-dropeffect`: popup): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectLink`(`aria-dropeffect`: link): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectCopy`(`aria-dropeffect`: copy): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-dropeffectNone`(`aria-dropeffect`: none): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-errormessage`(`aria-errormessage`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-errormessage` != null) obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-expandedUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-expanded")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-expanded`(`aria-expanded`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-expanded`)) obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-flowto`(`aria-flowto`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-flowto` != null) obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-grabbedUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-grabbed")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-grabbed`(`aria-grabbed`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-grabbed`)) obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupMenu`(`aria-haspopup`: menu): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupBoolean`(`aria-haspopup`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupListbox`(`aria-haspopup`: listbox): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupGrid`(`aria-haspopup`: grid): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupTree`(`aria-haspopup`: tree): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-haspopupDialog`(`aria-haspopup`: dialog): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-hiddenUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-hidden")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-hidden`(`aria-hidden`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-hidden`)) obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-invalidSpelling`(`aria-invalid`: spelling): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-invalidBoolean`(`aria-invalid`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-invalidGrammar`(`aria-invalid`: grammar): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-keyshortcuts`(`aria-keyshortcuts`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-keyshortcuts` != null) obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-label`(`aria-label`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-label` != null) obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-labelledby`(`aria-labelledby`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-labelledby` != null) obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-levelInt`(`aria-level`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-levelDouble`(`aria-level`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-livePolite`(`aria-live`: polite): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-liveAssertive`(`aria-live`: assertive): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-liveOff`(`aria-live`: off): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-modalUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-modal")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-modal`(`aria-modal`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-modal`)) obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-multilineUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiline")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-multiline`(`aria-multiline`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiline`)) obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-multiselectableUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiselectable")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-multiselectable`(`aria-multiselectable`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiselectable`)) obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-orientationHorizontal`(`aria-orientation`: horizontal): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-orientationVertical`(`aria-orientation`: vertical): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-owns`(`aria-owns`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-owns` != null) obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-placeholder`(`aria-placeholder`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-placeholder` != null) obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-posinsetInt`(`aria-posinset`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-posinsetDouble`(`aria-posinset`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-pressedMixed`(`aria-pressed`: mixed): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-pressedBoolean`(`aria-pressed`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-readonlyUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-readonly")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-readonly`(`aria-readonly`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-readonly`)) obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-relevantAdditions`(`aria-relevant`: additions): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-relevantAll`(`aria-relevant`: all): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-relevantText`(`aria-relevant`: text): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-relevantAdditions text`(`aria-relevant`: `additions text`): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-relevantRemovals`(`aria-relevant`: removals): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-requiredUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-required")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-required`(`aria-required`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-required`)) obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-roledescription`(`aria-roledescription`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-roledescription` != null) obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowcountInt`(`aria-rowcount`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowcountDouble`(`aria-rowcount`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowindexInt`(`aria-rowindex`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowindexDouble`(`aria-rowindex`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowspanInt`(`aria-rowspan`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-rowspanDouble`(`aria-rowspan`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-selectedUndefined`: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-selected")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-selected`(`aria-selected`: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-selected`)) obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-setsizeInt`(`aria-setsize`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-setsizeDouble`(`aria-setsize`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-sortNone`(`aria-sort`: none): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-sortDescending`(`aria-sort`: descending): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-sortAscending`(`aria-sort`: ascending): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-sortOther`(`aria-sort`: other): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valuemaxInt`(`aria-valuemax`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valuemaxDouble`(`aria-valuemax`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valueminInt`(`aria-valuemin`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valueminDouble`(`aria-valuemin`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valuenowInt`(`aria-valuenow`: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valuenowDouble`(`aria-valuenow`: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def `withAria-valuetext`(`aria-valuetext`: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuetext` != null) obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withAutoCapitalize(autoCapitalize: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCapitalize != null) obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withAutoCorrect(autoCorrect: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCorrect != null) obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withAutoSave(autoSave: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoSave != null) obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withClassName(className: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withColor(color: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withContentEditableUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "contentEditable")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withContentEditable(contentEditable: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(contentEditable)) obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withContextMenu(contextMenu: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contextMenu != null) obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDatatype(datatype: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (datatype != null) obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDefaultCheckedUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDefaultValueArray(defaultValue: js.Array[String]): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDefaultValueString(defaultValue: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDir(dir: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dir != null) obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDraggableUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "draggable")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withDraggable(draggable: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(draggable)) obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withHiddenUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withHidden(hidden: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withId(id: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (id != null) obj.updateDynamic("id")(id.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withInlist(inlist: js.Any): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inlist != null) obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withInputMode(inputMode: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inputMode != null) obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withIs(is: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (is != null) obj.updateDynamic("is")(is.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemID(itemID: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemID != null) obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemProp(itemProp: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemProp != null) obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemRef(itemRef: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemRef != null) obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemScopeUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "itemScope")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemScope(itemScope: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(itemScope)) obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withItemType(itemType: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemType != null) obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withLang(lang: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lang != null) obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnAbort(onAbort: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: AnimationEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: AnimationEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: AnimationEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnBlur(onBlur: FocusEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnChange(onChange: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnClick(onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: CompositionEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: CompositionEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: CompositionEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCopy(onCopy: ClipboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnCut(onCut: ClipboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnEmptied(onEmptied: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnEnded(onEnded: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnError(onError: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnFocus(onFocus: FocusEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnInput(onInput: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnInvalid(onInvalid: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: KeyboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: KeyboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: KeyboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnLoad(onLoad: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPaste(onPaste: ClipboardEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPause(onPause: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPlay(onPlay: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPlaying(onPlaying: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: PointerEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnProgress(onProgress: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnRateChange(onRateChange: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnReset(onReset: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnScroll(onScroll: UIEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnSeeked(onSeeked: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnSeeking(onSeeking: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnSelect(onSelect: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnStalled(onStalled: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnSubmit(onSubmit: FormEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnSuspend(onSuspend: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: TouchEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: TouchEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: TouchEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: TouchEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: TransitionEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnWaiting(onWaiting: SyntheticEvent[HTMLElement, Event] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withOnWheel(onWheel: WheelEvent[HTMLElement] => Unit): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withPlaceholder(placeholder: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (placeholder != null) obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withPrefix(prefix: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withProperty(property: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (property != null) obj.updateDynamic("property")(property.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withRadioGroup(radioGroup: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radioGroup != null) obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withRefKey(refKey: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (refKey != null) obj.updateDynamic("refKey")(refKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withResource(resource: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (resource != null) obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withResultsInt(results: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withResultsDouble(results: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withRole(role: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (role != null) obj.updateDynamic("role")(role.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSecurity(security: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (security != null) obj.updateDynamic("security")(security.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSlot(slot: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slot != null) obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSpellCheckUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "spellCheck")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSpellCheck(spellCheck: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(spellCheck)) obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withStyle(style: CSSProperties): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (style != null) obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSuppressContentEditableWarningUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressContentEditableWarning")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSuppressContentEditableWarning(suppressContentEditableWarning: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressContentEditableWarning)) obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSuppressHydrationWarningUndefined: DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressHydrationWarning")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withSuppressHydrationWarning(suppressHydrationWarning: Boolean): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressHydrationWarning)) obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withTabIndexInt(tabIndex: Int): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withTitle(title: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withTypeof(typeof: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (typeof != null) obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withUnselectableOn(unselectable: on): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withUnselectableOff(unselectable: off): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
    @scala.inline
    def withVocab(vocab: String): DropzoneRootProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vocab != null) obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneRootProps]
    }
  }
  
}

