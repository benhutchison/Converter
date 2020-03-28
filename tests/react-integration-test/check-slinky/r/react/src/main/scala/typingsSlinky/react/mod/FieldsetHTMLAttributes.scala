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
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsetHTMLAttributes[T] extends HTMLAttributes[T] {
  var disabled: js.UndefOr[Boolean] = js.native
  var form: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object FieldsetHTMLAttributes {
  @scala.inline
  def apply[T](
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
    children: TagMod[Any] = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
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
    name: String = null,
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
    onWheel: SyntheticWheelEvent[T] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
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
  ): FieldsetHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[FieldsetHTMLAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: FieldsetHTMLAttributes[T]) {
    @scala.inline
    def duplicate: FieldsetHTMLAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): FieldsetHTMLAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T] with T]
    @scala.inline
    def withAbout(about: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (about != null) obj.updateDynamic("about")(about.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withAccessKey(accessKey: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accessKey != null) obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-activedescendant`(`aria-activedescendant`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-activedescendant` != null) obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-atomicUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-atomic")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-atomic`(`aria-atomic`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-atomic`)) obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-autocompleteBoth`(`aria-autocomplete`: both): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-autocompleteNone`(`aria-autocomplete`: none): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-autocompleteList`(`aria-autocomplete`: list): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-autocompleteInline`(`aria-autocomplete`: `inline`): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-busyUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-busy")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-busy`(`aria-busy`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-busy`)) obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-checkedMixed`(`aria-checked`: mixed): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-checkedBoolean`(`aria-checked`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colcountInt`(`aria-colcount`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colcountDouble`(`aria-colcount`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colindexInt`(`aria-colindex`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colindexDouble`(`aria-colindex`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colspanInt`(`aria-colspan`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-colspanDouble`(`aria-colspan`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-controls`(`aria-controls`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-controls` != null) obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentStep`(`aria-current`: step): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentLocation`(`aria-current`: location): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentPage`(`aria-current`: page): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentBoolean`(`aria-current`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentDate`(`aria-current`: date): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-currentTime`(`aria-current`: time): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-describedby`(`aria-describedby`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-describedby` != null) obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-details`(`aria-details`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-details` != null) obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-disabledUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-disabled")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-disabled`(`aria-disabled`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-disabled`)) obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectMove`(`aria-dropeffect`: move): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectExecute`(`aria-dropeffect`: execute): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectPopup`(`aria-dropeffect`: popup): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectLink`(`aria-dropeffect`: link): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectCopy`(`aria-dropeffect`: copy): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-dropeffectNone`(`aria-dropeffect`: none): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-errormessage`(`aria-errormessage`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-errormessage` != null) obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-expandedUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-expanded")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-expanded`(`aria-expanded`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-expanded`)) obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-flowto`(`aria-flowto`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-flowto` != null) obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-grabbedUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-grabbed")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-grabbed`(`aria-grabbed`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-grabbed`)) obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupMenu`(`aria-haspopup`: menu): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupBoolean`(`aria-haspopup`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupListbox`(`aria-haspopup`: listbox): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupGrid`(`aria-haspopup`: grid): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupTree`(`aria-haspopup`: tree): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-haspopupDialog`(`aria-haspopup`: dialog): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-hiddenUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-hidden")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-hidden`(`aria-hidden`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-hidden`)) obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-invalidSpelling`(`aria-invalid`: spelling): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-invalidBoolean`(`aria-invalid`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-invalidGrammar`(`aria-invalid`: grammar): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-keyshortcuts`(`aria-keyshortcuts`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-keyshortcuts` != null) obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-label`(`aria-label`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-label` != null) obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-labelledby`(`aria-labelledby`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-labelledby` != null) obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-levelInt`(`aria-level`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-levelDouble`(`aria-level`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-livePolite`(`aria-live`: polite): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-liveAssertive`(`aria-live`: assertive): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-liveOff`(`aria-live`: off): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-modalUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-modal")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-modal`(`aria-modal`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-modal`)) obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-multilineUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiline")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-multiline`(`aria-multiline`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiline`)) obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-multiselectableUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiselectable")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-multiselectable`(`aria-multiselectable`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiselectable`)) obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-orientationHorizontal`(`aria-orientation`: horizontal): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-orientationVertical`(`aria-orientation`: vertical): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-owns`(`aria-owns`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-owns` != null) obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-placeholder`(`aria-placeholder`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-placeholder` != null) obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-posinsetInt`(`aria-posinset`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-posinsetDouble`(`aria-posinset`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-pressedMixed`(`aria-pressed`: mixed): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-pressedBoolean`(`aria-pressed`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-readonlyUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-readonly")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-readonly`(`aria-readonly`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-readonly`)) obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-relevantAdditions`(`aria-relevant`: additions): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-relevantAll`(`aria-relevant`: all): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-relevantText`(`aria-relevant`: text): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-relevantAdditions text`(`aria-relevant`: `additions text`): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-relevantRemovals`(`aria-relevant`: removals): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-requiredUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-required")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-required`(`aria-required`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-required`)) obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-roledescription`(`aria-roledescription`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-roledescription` != null) obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowcountInt`(`aria-rowcount`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowcountDouble`(`aria-rowcount`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowindexInt`(`aria-rowindex`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowindexDouble`(`aria-rowindex`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowspanInt`(`aria-rowspan`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-rowspanDouble`(`aria-rowspan`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-selectedUndefined`: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-selected")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-selected`(`aria-selected`: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-selected`)) obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-setsizeInt`(`aria-setsize`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-setsizeDouble`(`aria-setsize`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-sortNone`(`aria-sort`: none): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-sortDescending`(`aria-sort`: descending): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-sortAscending`(`aria-sort`: ascending): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-sortOther`(`aria-sort`: other): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valuemaxInt`(`aria-valuemax`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valuemaxDouble`(`aria-valuemax`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valueminInt`(`aria-valuemin`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valueminDouble`(`aria-valuemin`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valuenowInt`(`aria-valuenow`: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valuenowDouble`(`aria-valuenow`: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def `withAria-valuetext`(`aria-valuetext`: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuetext` != null) obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withAutoCapitalize(autoCapitalize: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCapitalize != null) obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withAutoCorrect(autoCorrect: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCorrect != null) obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withAutoSave(autoSave: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoSave != null) obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withClassName(className: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withColor(color: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withContentEditableUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "contentEditable")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withContentEditable(contentEditable: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(contentEditable)) obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withContextMenu(contextMenu: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contextMenu != null) obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDatatype(datatype: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (datatype != null) obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultCheckedUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultValueArray(defaultValue: js.Array[String]): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultValueString(defaultValue: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDir(dir: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dir != null) obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDisabledUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDraggableUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "draggable")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withDraggable(draggable: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(draggable)) obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withForm(form: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (form != null) obj.updateDynamic("form")(form.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withHiddenUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withHidden(hidden: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withId(id: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (id != null) obj.updateDynamic("id")(id.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withInlist(inlist: js.Any): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inlist != null) obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withInputMode(inputMode: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inputMode != null) obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withIs(is: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (is != null) obj.updateDynamic("is")(is.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemID(itemID: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemID != null) obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemProp(itemProp: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemProp != null) obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemRef(itemRef: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemRef != null) obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemScopeUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "itemScope")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemScope(itemScope: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(itemScope)) obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withItemType(itemType: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemType != null) obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withLang(lang: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lang != null) obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withName(name: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnAbort(onAbort: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: SyntheticAnimationEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: SyntheticAnimationEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: SyntheticAnimationEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnBlur(onBlur: SyntheticFocusEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnChange(onChange: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnClick(onClick: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: SyntheticCompositionEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: SyntheticCompositionEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: SyntheticCompositionEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCopy(onCopy: SyntheticClipboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnCut(onCut: SyntheticClipboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnEmptied(onEmptied: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnEnded(onEnded: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnError(onError: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnFocus(onFocus: SyntheticFocusEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnInput(onInput: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnInvalid(onInvalid: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: SyntheticKeyboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: SyntheticKeyboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: SyntheticKeyboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnLoad(onLoad: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: SyntheticMouseEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPaste(onPaste: SyntheticClipboardEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPause(onPause: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPlay(onPlay: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPlaying(onPlaying: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: SyntheticPointerEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnProgress(onProgress: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnRateChange(onRateChange: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnReset(onReset: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnScroll(onScroll: SyntheticUIEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnSeeked(onSeeked: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnSeeking(onSeeking: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnSelect(onSelect: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnStalled(onStalled: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnSubmit(onSubmit: slinky.core.SyntheticEvent[EventTarget with T, Event] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnSuspend(onSuspend: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: SyntheticTouchEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: SyntheticTouchEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: SyntheticTouchEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: SyntheticTouchEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: SyntheticTransitionEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnWaiting(onWaiting: slinky.core.SyntheticEvent[Event, T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withOnWheel(onWheel: SyntheticWheelEvent[T] => Unit): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withPlaceholder(placeholder: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (placeholder != null) obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withPrefix(prefix: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withProperty(property: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (property != null) obj.updateDynamic("property")(property.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withRadioGroup(radioGroup: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radioGroup != null) obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withResource(resource: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (resource != null) obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withResultsInt(results: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withResultsDouble(results: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withRole(role: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (role != null) obj.updateDynamic("role")(role.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSecurity(security: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (security != null) obj.updateDynamic("security")(security.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSlot(slot: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slot != null) obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSpellCheckUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "spellCheck")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSpellCheck(spellCheck: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(spellCheck)) obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withStyle(style: CSSProperties): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (style != null) obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSuppressContentEditableWarningUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressContentEditableWarning")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSuppressContentEditableWarning(suppressContentEditableWarning: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressContentEditableWarning)) obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSuppressHydrationWarningUndefined: FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressHydrationWarning")
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withSuppressHydrationWarning(suppressHydrationWarning: Boolean): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressHydrationWarning)) obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withTabIndexInt(tabIndex: Int): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withTitle(title: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withTypeof(typeof: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (typeof != null) obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withUnselectableOn(unselectable: on): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withUnselectableOff(unselectable: off): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
    @scala.inline
    def withVocab(vocab: String): FieldsetHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vocab != null) obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.FieldsetHTMLAttributes[T]]
    }
  }
  
}

