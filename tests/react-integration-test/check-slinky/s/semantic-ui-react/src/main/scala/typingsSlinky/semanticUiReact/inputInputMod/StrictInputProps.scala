package typingsSlinky.semanticUiReact.inputInputMod

import slinky.core.TagMod
import typingsSlinky.react.AnonHtml
import typingsSlinky.react.mod.AnimationEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ClipboardEvent
import typingsSlinky.react.mod.CompositionEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.FocusEvent
import typingsSlinky.react.mod.FormEvent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.KeyboardEvent
import typingsSlinky.react.mod.MouseEvent
import typingsSlinky.react.mod.NativeMouseEvent
import typingsSlinky.react.mod.PointerEvent
import typingsSlinky.react.mod.SyntheticEvent
import typingsSlinky.react.mod.TouchEvent
import typingsSlinky.react.mod.TransitionEvent
import typingsSlinky.react.mod.UIEvent
import typingsSlinky.react.mod.WheelEvent
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
import typingsSlinky.semanticUiReact.genericMod.HtmlInputrops
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`left corner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`right corner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.std.Event
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictInputProps extends InputHTMLAttributes[HTMLInputElement] {
  /** An Input can be formatted to alert the user to an action they may perform. */
  var action: js.UndefOr[js.Any | Boolean] = js.native
  /** An action can appear along side an Input on the left or right. */
  var actionPosition: js.UndefOr[left] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** An Input field can show the data contains errors. */
  var error: js.UndefOr[Boolean] = js.native
  /** Take on the size of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** An Input field can show a user is currently interacting with it. */
  var focus: js.UndefOr[Boolean] = js.native
  /** Optional Icon to display inside the Input. */
  var icon: js.UndefOr[js.Any | SemanticShorthandItem[InputProps]] = js.native
  /** An Icon can appear inside an Input on the left. */
  var iconPosition: js.UndefOr[left] = js.native
  /** Shorthand for creating the HTML Input. */
  var input: js.UndefOr[SemanticShorthandItem[HtmlInputrops]] = js.native
  /** Format to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Optional Label to display along side the Input. */
  var label: js.UndefOr[
    SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ _
    ]
  ] = js.native
  /** A Label can appear outside an Input on the left or right. */
  var labelPosition: js.UndefOr[left | right | (`left corner`) | (`right corner`)] = js.native
  /** An Icon Input field can show that it is currently loading data. */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * Called on change.
    *
    * @param {ChangeEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and a proposed value.
    */
  @JSName("onChange")
  var onChange_StrictInputProps: js.UndefOr[
    js.Function2[
      /* event */ ChangeEvent[org.scalajs.dom.raw.HTMLInputElement], 
      /* data */ InputOnChangeData, 
      Unit
    ]
  ] = js.native
  /** An Input can vary in size. */
  @JSName("size")
  var size_StrictInputProps: js.UndefOr[mini | small | large | big | huge | massive] = js.native
  /** An Input can receive focus. */
  @JSName("tabIndex")
  var tabIndex_StrictInputProps: js.UndefOr[Double | String] = js.native
  /** Transparent Input has no background. */
  var transparent: js.UndefOr[Boolean] = js.native
}

object StrictInputProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    action: js.Any | Boolean = null,
    actionPosition: left = null,
    alt: String = null,
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
    as: js.Any = null,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any | SemanticShorthandItem[InputProps] = null,
    iconPosition: left = null,
    id: String = null,
    inlist: js.Any = null,
    input: SemanticShorthandItem[HtmlInputrops] = null,
    inputMode: String = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    label: SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ _
    ] = null,
    labelPosition: left | right | (`left corner`) | (`right corner`) = null,
    lang: String = null,
    list: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    max: Double | String = null,
    maxLength: Int | Double = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onAnimationIteration: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onAnimationStart: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onAuxClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onBlur: FocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onCanPlay: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onChange: (/* event */ ChangeEvent[org.scalajs.dom.raw.HTMLInputElement], /* data */ InputOnChangeData) => Unit = null,
    onClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onCompositionStart: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onContextMenu: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onCut: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDoubleClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragEnd: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragEnter: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragExit: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragLeave: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragOver: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDragStart: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDrop: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onDurationChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onEnded: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onError: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onFocus: FocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onInput: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onInvalid: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyDown: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyPress: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyUp: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onLoad: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onMouseDown: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPause: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onPlay: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerDown: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerEnter: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerLeave: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerMove: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerOut: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerOver: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onPointerUp: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onProgress: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onReset: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onScroll: UIEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onSeeked: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onSelect: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onStalled: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onSubmit: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onSuspend: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onTouchEnd: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onTouchMove: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onTouchStart: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onTransitionEnd: TransitionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onVolumeChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit = null,
    onWheel: WheelEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    size: mini | small | large | big | huge | massive = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    step: Double | String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    title: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null,
    width: Double | String = null
  ): StrictInputProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
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
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictInputProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictInputProps) {
    @scala.inline
    def duplicate: StrictInputProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictInputProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps with T]
    @scala.inline
    def withAbout(about: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (about != null) obj.updateDynamic("about")(about.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAccept(accept: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAccessKey(accessKey: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accessKey != null) obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withActionAny(action: js.Any): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (action != null) obj.updateDynamic("action")(action.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withActionBoolean(action: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (action != null) obj.updateDynamic("action")(action.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withActionPosition(actionPosition: left): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (actionPosition != null) obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAlt(alt: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alt != null) obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-activedescendant`(`aria-activedescendant`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-activedescendant` != null) obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-atomicUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-atomic")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-atomic`(`aria-atomic`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-atomic`)) obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-autocompleteBoth`(`aria-autocomplete`: both): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-autocompleteNone`(`aria-autocomplete`: none): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-autocompleteList`(`aria-autocomplete`: list): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-autocompleteInline`(`aria-autocomplete`: `inline`): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-busyUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-busy")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-busy`(`aria-busy`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-busy`)) obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-checkedMixed`(`aria-checked`: mixed): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-checkedBoolean`(`aria-checked`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colcountInt`(`aria-colcount`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colcountDouble`(`aria-colcount`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colindexInt`(`aria-colindex`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colindexDouble`(`aria-colindex`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colspanInt`(`aria-colspan`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-colspanDouble`(`aria-colspan`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-controls`(`aria-controls`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-controls` != null) obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentStep`(`aria-current`: step): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentLocation`(`aria-current`: location): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentPage`(`aria-current`: page): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentBoolean`(`aria-current`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentDate`(`aria-current`: date): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-currentTime`(`aria-current`: time): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-describedby`(`aria-describedby`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-describedby` != null) obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-details`(`aria-details`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-details` != null) obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-disabledUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-disabled")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-disabled`(`aria-disabled`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-disabled`)) obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectMove`(`aria-dropeffect`: move): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectExecute`(`aria-dropeffect`: execute): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectPopup`(`aria-dropeffect`: popup): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectLink`(`aria-dropeffect`: link): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectCopy`(`aria-dropeffect`: copy): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-dropeffectNone`(`aria-dropeffect`: none): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-errormessage`(`aria-errormessage`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-errormessage` != null) obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-expandedUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-expanded")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-expanded`(`aria-expanded`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-expanded`)) obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-flowto`(`aria-flowto`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-flowto` != null) obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-grabbedUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-grabbed")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-grabbed`(`aria-grabbed`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-grabbed`)) obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupMenu`(`aria-haspopup`: menu): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupBoolean`(`aria-haspopup`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupListbox`(`aria-haspopup`: listbox): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupGrid`(`aria-haspopup`: grid): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupTree`(`aria-haspopup`: tree): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-haspopupDialog`(`aria-haspopup`: dialog): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-hiddenUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-hidden")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-hidden`(`aria-hidden`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-hidden`)) obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-invalidSpelling`(`aria-invalid`: spelling): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-invalidBoolean`(`aria-invalid`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-invalidGrammar`(`aria-invalid`: grammar): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-keyshortcuts`(`aria-keyshortcuts`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-keyshortcuts` != null) obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-label`(`aria-label`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-label` != null) obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-labelledby`(`aria-labelledby`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-labelledby` != null) obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-levelInt`(`aria-level`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-levelDouble`(`aria-level`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-livePolite`(`aria-live`: polite): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-liveAssertive`(`aria-live`: assertive): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-liveOff`(`aria-live`: off): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-modalUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-modal")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-modal`(`aria-modal`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-modal`)) obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-multilineUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiline")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-multiline`(`aria-multiline`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiline`)) obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-multiselectableUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiselectable")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-multiselectable`(`aria-multiselectable`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiselectable`)) obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-orientationHorizontal`(`aria-orientation`: horizontal): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-orientationVertical`(`aria-orientation`: vertical): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-owns`(`aria-owns`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-owns` != null) obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-placeholder`(`aria-placeholder`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-placeholder` != null) obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-posinsetInt`(`aria-posinset`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-posinsetDouble`(`aria-posinset`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-pressedMixed`(`aria-pressed`: mixed): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-pressedBoolean`(`aria-pressed`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-readonlyUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-readonly")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-readonly`(`aria-readonly`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-readonly`)) obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-relevantAdditions`(`aria-relevant`: additions): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-relevantAll`(`aria-relevant`: all): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-relevantText`(`aria-relevant`: text): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-relevantAdditions text`(`aria-relevant`: `additions text`): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-relevantRemovals`(`aria-relevant`: removals): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-requiredUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-required")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-required`(`aria-required`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-required`)) obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-roledescription`(`aria-roledescription`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-roledescription` != null) obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowcountInt`(`aria-rowcount`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowcountDouble`(`aria-rowcount`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowindexInt`(`aria-rowindex`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowindexDouble`(`aria-rowindex`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowspanInt`(`aria-rowspan`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-rowspanDouble`(`aria-rowspan`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-selectedUndefined`: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-selected")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-selected`(`aria-selected`: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-selected`)) obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-setsizeInt`(`aria-setsize`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-setsizeDouble`(`aria-setsize`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-sortNone`(`aria-sort`: none): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-sortDescending`(`aria-sort`: descending): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-sortAscending`(`aria-sort`: ascending): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-sortOther`(`aria-sort`: other): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valuemaxInt`(`aria-valuemax`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valuemaxDouble`(`aria-valuemax`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valueminInt`(`aria-valuemin`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valueminDouble`(`aria-valuemin`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valuenowInt`(`aria-valuenow`: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valuenowDouble`(`aria-valuenow`: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withAria-valuetext`(`aria-valuetext`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuetext` != null) obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAs(as: js.Any): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoCapitalize(autoCapitalize: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCapitalize != null) obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoComplete(autoComplete: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoComplete != null) obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoCorrect(autoCorrect: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCorrect != null) obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoFocusUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "autoFocus")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoFocus(autoFocus: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(autoFocus)) obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withAutoSave(autoSave: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoSave != null) obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withCaptureBoolean(capture: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (capture != null) obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withCaptureString(capture: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (capture != null) obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withCheckedUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "checked")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withChecked(checked: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(checked)) obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withClassName(className: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withColor(color: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withContentEditableUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "contentEditable")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withContentEditable(contentEditable: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(contentEditable)) obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withContextMenu(contextMenu: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contextMenu != null) obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withCrossOrigin(crossOrigin: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (crossOrigin != null) obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDatatype(datatype: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (datatype != null) obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDefaultCheckedUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDefaultValueArray(defaultValue: js.Array[String]): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDefaultValueString(defaultValue: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDir(dir: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dir != null) obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDisabledUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDraggableUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "draggable")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withDraggable(draggable: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(draggable)) obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withErrorUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "error")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withError(error: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(error)) obj.updateDynamic("error")(error.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFluidUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFocusUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "focus")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFocus(focus: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(focus)) obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withForm(form: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (form != null) obj.updateDynamic("form")(form.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormAction(formAction: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formAction != null) obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormEncType(formEncType: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formEncType != null) obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormMethod(formMethod: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formMethod != null) obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormNoValidateUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "formNoValidate")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormNoValidate(formNoValidate: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(formNoValidate)) obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withFormTarget(formTarget: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formTarget != null) obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withHeightString(height: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withHeightDouble(height: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withHiddenUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withHidden(hidden: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withIconAny(icon: js.Any): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (icon != null) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withIconSemanticShorthandItem(icon: SemanticShorthandItem[InputProps]): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (icon != null) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withIconPosition(iconPosition: left): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (iconPosition != null) obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withId(id: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (id != null) obj.updateDynamic("id")(id.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withInlist(inlist: js.Any): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inlist != null) obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withInput(input: SemanticShorthandItem[HtmlInputrops]): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (input != null) obj.updateDynamic("input")(input.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withInputMode(inputMode: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inputMode != null) obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withInvertedUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withIs(is: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (is != null) obj.updateDynamic("is")(is.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemID(itemID: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemID != null) obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemProp(itemProp: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemProp != null) obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemRef(itemRef: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemRef != null) obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemScopeUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "itemScope")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemScope(itemScope: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(itemScope)) obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withItemType(itemType: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemType != null) obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLabel(
      label: SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ _
        ]
    ): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (label != null) obj.updateDynamic("label")(label.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withLabelPositionLeft corner`(labelPosition: `left corner`): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLabelPositionLeft(labelPosition: left): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLabelPositionRight(labelPosition: right): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def `withLabelPositionRight corner`(labelPosition: `right corner`): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLang(lang: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lang != null) obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withList(list: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (list != null) obj.updateDynamic("list")(list.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLoadingUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "loading")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withLoading(loading: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(loading)) obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMaxString(max: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (max != null) obj.updateDynamic("max")(max.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMaxDouble(max: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (max != null) obj.updateDynamic("max")(max.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMaxLengthInt(maxLength: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxLength != null) obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMaxLengthDouble(maxLength: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxLength != null) obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMinString(min: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (min != null) obj.updateDynamic("min")(min.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMinDouble(min: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (min != null) obj.updateDynamic("min")(min.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMinLengthInt(minLength: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minLength != null) obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMinLengthDouble(minLength: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minLength != null) obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMultipleUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "multiple")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withMultiple(multiple: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(multiple)) obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withName(name: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnAbort(onAbort: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: AnimationEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnBlur(onBlur: FocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnChange(
      onChange: (/* event */ ChangeEvent[org.scalajs.dom.raw.HTMLInputElement], /* data */ InputOnChangeData) => Unit
    ): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnClick(onClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: CompositionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCopy(onCopy: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnCut(onCut: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnEmptied(onEmptied: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnEnded(onEnded: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnError(onError: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnFocus(onFocus: FocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnInput(onInput: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnInvalid(onInvalid: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: KeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnLoad(onLoad: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: MouseEvent[org.scalajs.dom.raw.HTMLInputElement, NativeMouseEvent] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPaste(onPaste: ClipboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPause(onPause: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPlay(onPlay: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPlaying(onPlaying: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: PointerEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnProgress(onProgress: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnRateChange(onRateChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnReset(onReset: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnScroll(onScroll: UIEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnSeeked(onSeeked: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnSeeking(onSeeking: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnSelect(onSelect: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnStalled(onStalled: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnSubmit(onSubmit: FormEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnSuspend(onSuspend: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: TouchEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: TransitionEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnWaiting(onWaiting: SyntheticEvent[org.scalajs.dom.raw.HTMLInputElement, Event] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withOnWheel(onWheel: WheelEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withPattern(pattern: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pattern != null) obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withPlaceholder(placeholder: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (placeholder != null) obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withPrefix(prefix: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withProperty(property: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (property != null) obj.updateDynamic("property")(property.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withRadioGroup(radioGroup: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radioGroup != null) obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withReadOnlyUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "readOnly")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withReadOnly(readOnly: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(readOnly)) obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withRequiredUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "required")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withRequired(required: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(required)) obj.updateDynamic("required")(required.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withResource(resource: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (resource != null) obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withResultsInt(results: Int): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withResultsDouble(results: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withRole(role: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (role != null) obj.updateDynamic("role")(role.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSecurity(security: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (security != null) obj.updateDynamic("security")(security.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeHuge(size: huge): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeMini(size: mini): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeBig(size: big): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeMassive(size: massive): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeSmall(size: small): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSizeLarge(size: large): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSlot(slot: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slot != null) obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSpellCheckUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "spellCheck")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSpellCheck(spellCheck: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(spellCheck)) obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSrc(src: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (src != null) obj.updateDynamic("src")(src.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withStepString(step: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (step != null) obj.updateDynamic("step")(step.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withStepDouble(step: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (step != null) obj.updateDynamic("step")(step.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withStyle(style: CSSProperties): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (style != null) obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSuppressContentEditableWarningUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressContentEditableWarning")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSuppressContentEditableWarning(suppressContentEditableWarning: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressContentEditableWarning)) obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSuppressHydrationWarningUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressHydrationWarning")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withSuppressHydrationWarning(suppressHydrationWarning: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressHydrationWarning)) obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTabIndexString(tabIndex: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTitle(title: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTransparentUndefined: StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "transparent")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTransparent(transparent: Boolean): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(transparent)) obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withType(`type`: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withTypeof(typeof: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (typeof != null) obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withUnselectableOn(unselectable: on): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withUnselectableOff(unselectable: off): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withValueArray(value: js.Array[String]): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withValueString(value: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withValueDouble(value: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withVocab(vocab: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vocab != null) obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withWidthString(width: String): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (width != null) obj.updateDynamic("width")(width.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
    @scala.inline
    def withWidthDouble(width: Double): StrictInputProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (width != null) obj.updateDynamic("width")(width.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.inputInputMod.StrictInputProps]
    }
  }
  
}

