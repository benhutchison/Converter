package typings.semanticUiReact.accordionAccordionMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps
import typings.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictAccordionProps extends StrictAccordionAccordionProps {
  /** Format to take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Format for dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Adds some basic styling to accordion panels. */
  var styled: js.UndefOr[Boolean] = js.native
}

object StrictAccordionProps {
  @scala.inline
  def apply(
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
  ): StrictAccordionProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictAccordionProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictAccordionProps) {
    @scala.inline
    def duplicate: StrictAccordionProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictAccordionProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps with T]
    @scala.inline
    def withActiveIndexArray(activeIndex: js.Array[Double]): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withActiveIndexDouble(activeIndex: Double): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withAs(as: js.Any): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withClassName(className: String): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexArray(defaultActiveIndex: js.Array[Double]): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexDouble(defaultActiveIndex: Double): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withExclusiveUndefined: StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "exclusive")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withExclusive(exclusive: Boolean): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(exclusive)) obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withFluidUndefined: StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withInvertedUndefined: StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inverted")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withInverted(inverted: Boolean): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inverted)) obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
    ): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withPanels(panels: SemanticShorthandCollection[AccordionPanelProps]): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panels != null) obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withStyledUndefined: StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "styled")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
    @scala.inline
    def withStyled(styled: Boolean): StrictAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(styled)) obj.updateDynamic("styled")(styled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionMod.StrictAccordionProps]
    }
  }
  
}

