package typings.semanticUiReact.buttonGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.buttonMod.ButtonProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictButtonGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Groups can be attached to other content. */
  var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.native
  /** Groups can be less pronounced. */
  var basic: js.UndefOr[Boolean] = js.native
  /** Array of shorthand Button values. */
  var buttons: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Groups can have a shared color. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Groups can reduce their padding to fit into tighter spaces. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Groups can be aligned to the left or right of its container. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** Groups can take the width of their container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted as icons. */
  var icon: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted as labeled icon buttons. */
  var labeled: js.UndefOr[Boolean] = js.native
  /** Groups can hint towards a negative consequence. */
  var negative: js.UndefOr[Boolean] = js.native
  /** Groups can hint towards a positive consequence. */
  var positive: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[Boolean] = js.native
  /** Groups can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  /** Groups can be formatted to toggle on and off. */
  var toggle: js.UndefOr[Boolean] = js.native
  /** Groups can be formatted to appear vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  /** Groups can have their widths divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictButtonGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | left | right | top | bottom = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    buttons: SemanticShorthandCollection[ButtonProps] = null,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    floated: SemanticFLOATS = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    labeled: js.UndefOr[Boolean] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: SemanticWIDTHS = null
  ): StrictButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictButtonGroupProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictButtonGroupProps) {
    @scala.inline
    def duplicate: StrictButtonGroupProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictButtonGroupProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps with T]
    @scala.inline
    def withAs(as: js.Any): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withAttachedBottom(attached: bottom): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withAttachedLeft(attached: left): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withAttachedBoolean(attached: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withAttachedTop(attached: top): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withAttachedRight(attached: right): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withBasicUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "basic")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withBasic(basic: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(basic)) obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withButtons(buttons: SemanticShorthandCollection[ButtonProps]): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (buttons != null) obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withClassName(className: String): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withColor(color: SemanticCOLORS): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withCompactUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "compact")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withCompact(compact: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(compact)) obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withFloated(floated: SemanticFLOATS): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floated != null) obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withFluidUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withIconUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "icon")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withIcon(icon: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(icon)) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withInvertedUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withLabeledUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "labeled")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withLabeled(labeled: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(labeled)) obj.updateDynamic("labeled")(labeled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withNegativeUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "negative")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withNegative(negative: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(negative)) obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withPositiveUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "positive")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withPositive(positive: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(positive)) obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withPrimaryUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "primary")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withPrimary(primary: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(primary)) obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withSecondaryUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "secondary")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withSecondary(secondary: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(secondary)) obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withSize(size: SemanticSIZES): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withToggleUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "toggle")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withToggle(toggle: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(toggle)) obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withVerticalUndefined: StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "vertical")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withVertical(vertical: Boolean): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(vertical)) obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
    @scala.inline
    def withWidths(widths: SemanticWIDTHS): StrictButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (widths != null) obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.StrictButtonGroupProps]
    }
  }
  
}

