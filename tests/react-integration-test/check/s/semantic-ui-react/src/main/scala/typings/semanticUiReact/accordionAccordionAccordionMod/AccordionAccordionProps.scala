package typings.semanticUiReact.accordionAccordionAccordionMod

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
trait AccordionAccordionProps
  extends StrictAccordionAccordionProps
     with /* key */ StringDictionary[js.Any]

object AccordionAccordionProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Double | js.Array[Double] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    defaultActiveIndex: Double | js.Array[Double] = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    panels: SemanticShorthandCollection[AccordionPanelProps] = null
  ): AccordionAccordionProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionAccordionProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AccordionAccordionProps) {
    @scala.inline
    def duplicate: AccordionAccordionProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AccordionAccordionProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withActiveIndexArray(activeIndex: js.Array[Double]): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withActiveIndexDouble(activeIndex: Double): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withAs(as: js.Any): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withClassName(className: String): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexArray(defaultActiveIndex: js.Array[Double]): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexDouble(defaultActiveIndex: Double): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withExclusiveUndefined: AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "exclusive")
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withExclusive(exclusive: Boolean): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(exclusive)) obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
    ): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
    @scala.inline
    def withPanels(panels: SemanticShorthandCollection[AccordionPanelProps]): AccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panels != null) obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps]
    }
  }
  
}

