package typingsSlinky.reactContextmenu.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.div.tag
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactContextmenu.mod.MenuItemProps
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactContextmenu.mod.MenuItem] {
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    attributes: HTMLAttributes[HTMLDivElement] = null,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    onClick: (js.Function3[
      /* event */ SyntheticTouchEvent[org.scalajs.dom.raw.HTMLDivElement] | SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function = null,
    preventClose: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactContextmenu.mod.MenuItem] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactContextmenu.mod.MenuItem] = new BuildingComponent(js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods :_*)
  type Props = MenuItemProps
}

