package typingsSlinky.semanticUiReact.accordionAccordionAccordionMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictAccordionAccordionProps extends js.Object {
  /** Index of the currently active panel. */
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  /** Only allow one panel open at a time. */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    * Called when a panel title is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {AccordionTitleProps} data - All item props.
    */
  var onTitleClick: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLDivElement], 
      /* data */ AccordionTitleProps, 
      Unit
    ]
  ] = js.native
  /** Shorthand array of props for Accordion. */
  var panels: js.UndefOr[SemanticShorthandCollection[AccordionPanelProps]] = js.native
}

object StrictAccordionAccordionProps {
  @scala.inline
  def apply(
    activeIndex: Double | js.Array[Double] = null,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    defaultActiveIndex: Double | js.Array[Double] = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit = null,
    panels: SemanticShorthandCollection[AccordionPanelProps] = null
  ): StrictAccordionAccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionAccordionProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictAccordionAccordionProps) {
    @scala.inline
    def duplicate: StrictAccordionAccordionProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictAccordionAccordionProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps with T]
    @scala.inline
    def withActiveIndexArray(activeIndex: js.Array[Double]): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withActiveIndexDouble(activeIndex: Double): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activeIndex != null) obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withAs(as: js.Any): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withClassName(className: String): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexArray(defaultActiveIndex: js.Array[Double]): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withDefaultActiveIndexDouble(defaultActiveIndex: Double): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (defaultActiveIndex != null) obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withExclusiveUndefined: StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "exclusive")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withExclusive(exclusive: Boolean): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(exclusive)) obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit
    ): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
    @scala.inline
    def withPanels(panels: SemanticShorthandCollection[AccordionPanelProps]): StrictAccordionAccordionProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panels != null) obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps]
    }
  }
  
}

