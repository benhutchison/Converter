package typings.semanticUiReact.accordionAccordionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps
  extends StrictAccordionProps
     with /* key */ StringDictionary[js.Any]

object AccordionProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Double | js.Array[Double] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    defaultActiveIndex: Double | js.Array[Double] = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    panels: SemanticShorthandCollection[AccordionPanelProps] = null,
    styled: js.UndefOr[Boolean] = js.undefined
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (!js.isUndefined(styled)) __obj.updateDynamic("styled")(styled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AccordionProps) {
    @scala.inline
    def duplicate: AccordionProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AccordionProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withActiveIndexArray(activeIndex: js.Array[Double]): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withActiveIndexDouble(activeIndex: Double): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withAs(as: js.Any): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withClassName(className: String): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexArray(defaultActiveIndex: js.Array[Double]): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexDouble(defaultActiveIndex: Double): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withExclusiveUndefined: AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "exclusive")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withExclusive(exclusive: Boolean): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(exclusive)) obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withFluidUndefined: AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withInvertedUndefined: AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
    ): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withPanels(panels: SemanticShorthandCollection[AccordionPanelProps]): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panels != null) obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withStyledUndefined: AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "styled")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
    @scala.inline
    def withStyled(styled: Boolean): AccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(styled)) obj.updateDynamic("styled")(styled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.AccordionProps]
    }
  }
  
}

