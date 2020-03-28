package typings.semanticUiReact.buttonGroupMod

import org.scalablytyped.runtime.StringDictionary
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
trait ButtonGroupProps
  extends StrictButtonGroupProps
     with /* key */ StringDictionary[js.Any]

object ButtonGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
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
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[ButtonGroupProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ButtonGroupProps) {
    @scala.inline
    def duplicate: ButtonGroupProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ButtonGroupProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAs(as: js.Any): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAttachedBottom(attached: bottom): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAttachedLeft(attached: left): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAttachedBoolean(attached: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAttachedTop(attached: top): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withAttachedRight(attached: right): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attached != null) obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBasicUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "basic")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withBasic(basic: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(basic)) obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withButtons(buttons: SemanticShorthandCollection[ButtonProps]): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (buttons != null) obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withClassName(className: String): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withColor(color: SemanticCOLORS): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withCompactUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "compact")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withCompact(compact: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(compact)) obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withFloated(floated: SemanticFLOATS): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floated != null) obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withFluidUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withIconUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "icon")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withIcon(icon: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(icon)) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withInvertedUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withLabeledUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "labeled")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withLabeled(labeled: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(labeled)) obj.updateDynamic("labeled")(labeled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withNegativeUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "negative")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withNegative(negative: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(negative)) obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withPositiveUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "positive")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withPositive(positive: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(positive)) obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withPrimaryUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "primary")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withPrimary(primary: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(primary)) obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withSecondaryUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "secondary")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withSecondary(secondary: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(secondary)) obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withSize(size: SemanticSIZES): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withToggleUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "toggle")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withToggle(toggle: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(toggle)) obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withVerticalUndefined: ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "vertical")
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withVertical(vertical: Boolean): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(vertical)) obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
    @scala.inline
    def withWidths(widths: SemanticWIDTHS): ButtonGroupProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (widths != null) obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonGroupMod.ButtonGroupProps]
    }
  }
  
}

