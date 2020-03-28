package typings.semanticUiReact.buttonMod

import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
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
import typings.react.reactStrings.button
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
import typings.react.reactStrings.reset
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.submit
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.`google plus`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.facebook
import typings.semanticUiReact.semanticUiReactStrings.fade
import typings.semanticUiReact.semanticUiReactStrings.instagram
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.linkedin
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.twitter
import typings.semanticUiReact.semanticUiReactStrings.vertical
import typings.semanticUiReact.semanticUiReactStrings.vk
import typings.semanticUiReact.semanticUiReactStrings.youtube
import typings.std.Event
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictButtonProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  /** A button can show it is currently the active user selection. */
  var active: js.UndefOr[Boolean] = js.native
  /** A button can animate to show hidden content. */
  var animated: js.UndefOr[Boolean | fade | vertical] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A button can be attached to other content. */
  var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.native
  /** A basic button is less pronounced. */
  var basic: js.UndefOr[Boolean] = js.native
  /** A button can be circular. */
  var circular: js.UndefOr[Boolean] = js.native
  /** A button can have different colors. */
  @JSName("color")
  var color_StrictButtonProps: js.UndefOr[
    SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube
  ] = js.native
  /** A button can reduce its padding to fit into tighter spaces. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A button can be aligned to the left or right of its container. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** A button can take the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Add an Icon by name, props object, or pass an <Icon />. */
  var icon: js.UndefOr[
    Boolean | (SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ _
    ])
  ] = js.native
  /** A button can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Add a Label by text, props object, or pass a <Label />. */
  var label: js.UndefOr[
    SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ _
    ]
  ] = js.native
  /** A labeled button can format a Label or Icon to appear on the left or right. */
  var labelPosition: js.UndefOr[right | left] = js.native
  /** A button can show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.native
  /** A button can hint towards a negative consequence. */
  var negative: js.UndefOr[Boolean] = js.native
  /**
    * Called after user's click.
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClick")
  var onClick_StrictButtonProps: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      /* data */ ButtonProps, 
      Unit
    ]
  ] = js.native
  /** A button can hint towards a positive consequence. */
  var positive: js.UndefOr[Boolean] = js.native
  /** A button can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[Boolean] = js.native
  /** A button can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[Boolean] = js.native
  /** A button can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  /** A button can receive focus. */
  @JSName("tabIndex")
  var tabIndex_StrictButtonProps: js.UndefOr[Double | String] = js.native
  /** A button can be formatted to toggle on and off. */
  var toggle: js.UndefOr[Boolean] = js.native
}

object StrictButtonProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    animated: Boolean | fade | vertical = null,
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
    `aria-orientation`: horizontal | typings.react.reactStrings.vertical = null,
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
    attached: Boolean | left | right | top | bottom = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | (SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ _
    ]) = null,
    id: String = null,
    inlist: js.Any = null,
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
    labelPosition: right | left = null,
    lang: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLButtonElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLButtonElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLButtonElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLButtonElement] => Unit = null,
    onBlur: FocusEvent[HTMLButtonElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onChange: FormEvent[HTMLButtonElement] => Unit = null,
    onClick: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* data */ ButtonProps) => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLButtonElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLButtonElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLButtonElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLButtonElement] => Unit = null,
    onCut: ClipboardEvent[HTMLButtonElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLButtonElement] => Unit = null,
    onDragEnd: DragEvent[HTMLButtonElement] => Unit = null,
    onDragEnter: DragEvent[HTMLButtonElement] => Unit = null,
    onDragExit: DragEvent[HTMLButtonElement] => Unit = null,
    onDragLeave: DragEvent[HTMLButtonElement] => Unit = null,
    onDragOver: DragEvent[HTMLButtonElement] => Unit = null,
    onDragStart: DragEvent[HTMLButtonElement] => Unit = null,
    onDrop: DragEvent[HTMLButtonElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLButtonElement] => Unit = null,
    onInput: FormEvent[HTMLButtonElement] => Unit = null,
    onInvalid: FormEvent[HTMLButtonElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLButtonElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLButtonElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLButtonElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLButtonElement] => Unit = null,
    onPause: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLButtonElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLButtonElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onReset: FormEvent[HTMLButtonElement] => Unit = null,
    onScroll: UIEvent[HTMLButtonElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLButtonElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLButtonElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLButtonElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLButtonElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLButtonElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLButtonElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLButtonElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLButtonElement] => Unit = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    size: SemanticSIZES = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    title: String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    `type`: submit | reset | button = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null
  ): StrictButtonProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
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
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
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
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
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
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictButtonProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictButtonProps) {
    @scala.inline
    def duplicate: StrictButtonProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictButtonProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps with T]
    @scala.inline
    def withAbout(about: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (about != null) obj.updateDynamic("about")(about.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAccessKey(accessKey: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accessKey != null) obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withActiveUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withActive(active: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAnimatedBoolean(animated: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (animated != null) obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAnimatedFade(animated: fade): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (animated != null) obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAnimatedVertical(animated: vertical): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (animated != null) obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-activedescendant`(`aria-activedescendant`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-activedescendant` != null) obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-atomicUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-atomic")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-atomic`(`aria-atomic`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-atomic`)) obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-autocompleteBoth`(`aria-autocomplete`: both): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-autocompleteNone`(`aria-autocomplete`: none): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-autocompleteList`(`aria-autocomplete`: list): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-autocompleteInline`(`aria-autocomplete`: `inline`): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-autocomplete` != null) obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-busyUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-busy")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-busy`(`aria-busy`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-busy`)) obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-checkedMixed`(`aria-checked`: mixed): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-checkedBoolean`(`aria-checked`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-checked` != null) obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colcountInt`(`aria-colcount`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colcountDouble`(`aria-colcount`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colcount` != null) obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colindexInt`(`aria-colindex`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colindexDouble`(`aria-colindex`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colindex` != null) obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colspanInt`(`aria-colspan`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-colspanDouble`(`aria-colspan`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-colspan` != null) obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-controls`(`aria-controls`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-controls` != null) obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentStep`(`aria-current`: step): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentLocation`(`aria-current`: location): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentPage`(`aria-current`: page): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentBoolean`(`aria-current`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentDate`(`aria-current`: date): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-currentTime`(`aria-current`: time): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-current` != null) obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-describedby`(`aria-describedby`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-describedby` != null) obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-details`(`aria-details`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-details` != null) obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-disabledUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-disabled")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-disabled`(`aria-disabled`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-disabled`)) obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectMove`(`aria-dropeffect`: move): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectExecute`(`aria-dropeffect`: execute): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectPopup`(`aria-dropeffect`: popup): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectLink`(`aria-dropeffect`: link): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectCopy`(`aria-dropeffect`: copy): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-dropeffectNone`(`aria-dropeffect`: none): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-dropeffect` != null) obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-errormessage`(`aria-errormessage`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-errormessage` != null) obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-expandedUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-expanded")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-expanded`(`aria-expanded`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-expanded`)) obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-flowto`(`aria-flowto`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-flowto` != null) obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-grabbedUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-grabbed")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-grabbed`(`aria-grabbed`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-grabbed`)) obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupMenu`(`aria-haspopup`: menu): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupBoolean`(`aria-haspopup`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupListbox`(`aria-haspopup`: listbox): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupGrid`(`aria-haspopup`: grid): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupTree`(`aria-haspopup`: tree): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-haspopupDialog`(`aria-haspopup`: dialog): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-haspopup` != null) obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-hiddenUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-hidden")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-hidden`(`aria-hidden`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-hidden`)) obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-invalidSpelling`(`aria-invalid`: spelling): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-invalidBoolean`(`aria-invalid`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-invalidGrammar`(`aria-invalid`: grammar): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-invalid` != null) obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-keyshortcuts`(`aria-keyshortcuts`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-keyshortcuts` != null) obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-label`(`aria-label`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-label` != null) obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-labelledby`(`aria-labelledby`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-labelledby` != null) obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-levelInt`(`aria-level`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-levelDouble`(`aria-level`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-level` != null) obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-livePolite`(`aria-live`: polite): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-liveAssertive`(`aria-live`: assertive): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-liveOff`(`aria-live`: off): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-live` != null) obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-modalUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-modal")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-modal`(`aria-modal`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-modal`)) obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-multilineUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiline")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-multiline`(`aria-multiline`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiline`)) obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-multiselectableUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-multiselectable")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-multiselectable`(`aria-multiselectable`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-multiselectable`)) obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-orientationHorizontal`(`aria-orientation`: horizontal): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-orientationVertical`(`aria-orientation`: typings.react.reactStrings.vertical): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-orientation` != null) obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-owns`(`aria-owns`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-owns` != null) obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-placeholder`(`aria-placeholder`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-placeholder` != null) obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-posinsetInt`(`aria-posinset`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-posinsetDouble`(`aria-posinset`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-posinset` != null) obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-pressedMixed`(`aria-pressed`: mixed): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-pressedBoolean`(`aria-pressed`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-pressed` != null) obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-readonlyUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-readonly")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-readonly`(`aria-readonly`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-readonly`)) obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-relevantAdditions`(`aria-relevant`: additions): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-relevantAll`(`aria-relevant`: all): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-relevantText`(`aria-relevant`: text): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-relevantAdditions text`(`aria-relevant`: `additions text`): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-relevantRemovals`(`aria-relevant`: removals): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-relevant` != null) obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-requiredUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-required")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-required`(`aria-required`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-required`)) obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-roledescription`(`aria-roledescription`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-roledescription` != null) obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowcountInt`(`aria-rowcount`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowcountDouble`(`aria-rowcount`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowcount` != null) obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowindexInt`(`aria-rowindex`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowindexDouble`(`aria-rowindex`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowindex` != null) obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowspanInt`(`aria-rowspan`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-rowspanDouble`(`aria-rowspan`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-rowspan` != null) obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-selectedUndefined`: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "aria-selected")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-selected`(`aria-selected`: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(`aria-selected`)) obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-setsizeInt`(`aria-setsize`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-setsizeDouble`(`aria-setsize`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-setsize` != null) obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-sortNone`(`aria-sort`: none): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-sortDescending`(`aria-sort`: descending): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-sortAscending`(`aria-sort`: ascending): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-sortOther`(`aria-sort`: other): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-sort` != null) obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valuemaxInt`(`aria-valuemax`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valuemaxDouble`(`aria-valuemax`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemax` != null) obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valueminInt`(`aria-valuemin`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valueminDouble`(`aria-valuemin`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuemin` != null) obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valuenowInt`(`aria-valuenow`: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valuenowDouble`(`aria-valuenow`: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuenow` != null) obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withAria-valuetext`(`aria-valuetext`: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`aria-valuetext` != null) obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAs(as: js.Any): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAttachedBottom(attached: bottom): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAttachedLeft(attached: left): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAttachedBoolean(attached: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAttachedTop(attached: top): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAttachedRight(attached: right): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAutoCapitalize(autoCapitalize: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCapitalize != null) obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAutoCorrect(autoCorrect: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoCorrect != null) obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAutoFocusUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "autoFocus")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAutoFocus(autoFocus: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(autoFocus)) obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withAutoSave(autoSave: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoSave != null) obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withBasicUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "basic")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withBasic(basic: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(basic)) obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withCircularUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "circular")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withCircular(circular: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(circular)) obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withClassName(className: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorYoutube(color: youtube): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorLinkedin(color: linkedin): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorSemanticCOLORS(color: SemanticCOLORS): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorFacebook(color: facebook): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def `withColorGoogle plus`(color: `google plus`): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorTwitter(color: twitter): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorInstagram(color: instagram): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withColorVk(color: vk): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withCompactUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "compact")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withCompact(compact: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(compact)) obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withContentEditableUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "contentEditable")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withContentEditable(contentEditable: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(contentEditable)) obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withContextMenu(contextMenu: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contextMenu != null) obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDatatype(datatype: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (datatype != null) obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDefaultCheckedUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDefaultValueArray(defaultValue: js.Array[String]): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDefaultValueString(defaultValue: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultValue != null) obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDir(dir: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dir != null) obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDisabledUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDraggableUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "draggable")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withDraggable(draggable: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(draggable)) obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFloated(floated: SemanticFLOATS): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floated != null) obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFluidUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withForm(form: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (form != null) obj.updateDynamic("form")(form.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormAction(formAction: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formAction != null) obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormEncType(formEncType: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formEncType != null) obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormMethod(formMethod: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formMethod != null) obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormNoValidateUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "formNoValidate")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormNoValidate(formNoValidate: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(formNoValidate)) obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withFormTarget(formTarget: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (formTarget != null) obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withHiddenUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withHidden(hidden: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withIconBoolean(icon: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (icon != null) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withIconSemanticShorthandItem(
      icon: SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ _
        ]
    ): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (icon != null) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withId(id: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (id != null) obj.updateDynamic("id")(id.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withInlist(inlist: js.Any): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inlist != null) obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withInputMode(inputMode: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inputMode != null) obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withInvertedUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withIs(is: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (is != null) obj.updateDynamic("is")(is.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemID(itemID: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemID != null) obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemProp(itemProp: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemProp != null) obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemRef(itemRef: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemRef != null) obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemScopeUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "itemScope")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemScope(itemScope: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(itemScope)) obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withItemType(itemType: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (itemType != null) obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLabel(
      label: SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ _
        ]
    ): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (label != null) obj.updateDynamic("label")(label.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLabelPositionLeft(labelPosition: left): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLabelPositionRight(labelPosition: right): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labelPosition != null) obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLang(lang: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lang != null) obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLoadingUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "loading")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withLoading(loading: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(loading)) obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withName(name: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withNegativeUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "negative")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withNegative(negative: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(negative)) obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnAbort(onAbort: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAbort != null) obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: AnimationEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationEnd != null) obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: AnimationEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationIteration != null) obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: AnimationEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAnimationStart != null) obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onAuxClick != null) obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBeforeInput != null) obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnBlur(onBlur: FocusEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onBlur != null) obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlay != null) obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCanPlayThrough != null) obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnChange(onChange: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onChange != null) obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnClick(
      onClick: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* data */ ButtonProps) => Unit
    ): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: CompositionEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionEnd != null) obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: CompositionEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionStart != null) obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: CompositionEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCompositionUpdate != null) obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onContextMenu != null) obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCopy(onCopy: ClipboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCopy != null) obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnCut(onCut: ClipboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onCut != null) obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDoubleClick != null) obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDrag(onDrag: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrag != null) obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnd != null) obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragExit(onDragExit: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragExit != null) obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDragStart(onDragStart: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragStart != null) obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDrop(onDrop: DragEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDurationChange != null) obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnEmptied(onEmptied: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEmptied != null) obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEncrypted != null) obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnEnded(onEnded: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onEnded != null) obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnError(onError: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onError != null) obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnFocus(onFocus: FocusEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFocus != null) obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnInput(onInput: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInput != null) obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnInvalid(onInvalid: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onInvalid != null) obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: KeyboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyDown != null) obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: KeyboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyPress != null) obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: KeyboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onKeyUp != null) obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnLoad(onLoad: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoad != null) obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadStart != null) obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedData != null) obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onLoadedMetadata != null) obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseDown != null) obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseEnter != null) obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseLeave != null) obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseMove != null) obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOut != null) obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseOver != null) obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onMouseUp != null) obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPaste(onPaste: ClipboardEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPaste != null) obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPause(onPause: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPause != null) obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPlay(onPlay: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlay != null) obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPlaying(onPlaying: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPlaying != null) obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerCancel != null) obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerDown != null) obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerEnter != null) obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerLeave != null) obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerMove != null) obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOut != null) obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerOver != null) obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: PointerEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onPointerUp != null) obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnProgress(onProgress: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onProgress != null) obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnRateChange(onRateChange: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onRateChange != null) obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnReset(onReset: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onReset != null) obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnScroll(onScroll: UIEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onScroll != null) obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnSeeked(onSeeked: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeked != null) obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnSeeking(onSeeking: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSeeking != null) obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnSelect(onSelect: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSelect != null) obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnStalled(onStalled: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onStalled != null) obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnSubmit(onSubmit: FormEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSubmit != null) obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnSuspend(onSuspend: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onSuspend != null) obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTimeUpdate != null) obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: TouchEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchCancel != null) obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: TouchEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchEnd != null) obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: TouchEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchMove != null) obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: TouchEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTouchStart != null) obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: TransitionEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTransitionEnd != null) obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onVolumeChange != null) obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnWaiting(onWaiting: SyntheticEvent[HTMLButtonElement, Event] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWaiting != null) obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withOnWheel(onWheel: WheelEvent[HTMLButtonElement] => Unit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onWheel != null) obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPlaceholder(placeholder: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (placeholder != null) obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPositiveUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "positive")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPositive(positive: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(positive)) obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPrefix(prefix: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPrimaryUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "primary")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withPrimary(primary: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(primary)) obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withProperty(property: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (property != null) obj.updateDynamic("property")(property.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withRadioGroup(radioGroup: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radioGroup != null) obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withResource(resource: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (resource != null) obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withResultsInt(results: Int): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withResultsDouble(results: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (results != null) obj.updateDynamic("results")(results.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withRole(role: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (role != null) obj.updateDynamic("role")(role.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSecondaryUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "secondary")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSecondary(secondary: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(secondary)) obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSecurity(security: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (security != null) obj.updateDynamic("security")(security.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSize(size: SemanticSIZES): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSlot(slot: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slot != null) obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSpellCheckUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "spellCheck")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSpellCheck(spellCheck: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(spellCheck)) obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withStyle(style: CSSProperties): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (style != null) obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSuppressContentEditableWarningUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressContentEditableWarning")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSuppressContentEditableWarning(suppressContentEditableWarning: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressContentEditableWarning)) obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSuppressHydrationWarningUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "suppressHydrationWarning")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withSuppressHydrationWarning(suppressHydrationWarning: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(suppressHydrationWarning)) obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTabIndexString(tabIndex: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTitle(title: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withToggleUndefined: StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "toggle")
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withToggle(toggle: Boolean): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(toggle)) obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTypeButton(`type`: button): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTypeReset(`type`: reset): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTypeSubmit(`type`: submit): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withTypeof(typeof: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (typeof != null) obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withUnselectableOn(unselectable: on): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withUnselectableOff(unselectable: off): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unselectable != null) obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withValueArray(value: js.Array[String]): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withValueString(value: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withValueDouble(value: Double): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
    @scala.inline
    def withVocab(vocab: String): StrictButtonProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vocab != null) obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonMod.StrictButtonProps]
    }
  }
  
}

