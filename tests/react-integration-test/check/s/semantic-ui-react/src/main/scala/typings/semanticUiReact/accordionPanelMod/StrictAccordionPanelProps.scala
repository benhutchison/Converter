package typings.semanticUiReact.accordionPanelMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.accordionContentMod.AccordionContentProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictAccordionPanelProps extends js.Object {
  /** Whether or not the title is in the open state. */
  var active: js.UndefOr[Boolean] = js.native
  /** A shorthand for Accordion.Content. */
  var content: js.UndefOr[SemanticShorthandItem[AccordionContentProps]] = js.native
  /** A panel index. */
  var index: js.UndefOr[Double | String] = js.native
  /**
    * Called when a panel title is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {AccordionTitleProps} data - All item props.
    */
  var onTitleClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ AccordionTitleProps, 
      Unit
    ]
  ] = js.native
  /** A shorthand for Accordion.Title. */
  var title: js.UndefOr[SemanticShorthandItem[AccordionTitleProps]] = js.native
}

object StrictAccordionPanelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[AccordionContentProps] = null,
    index: Double | String = null,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    title: SemanticShorthandItem[AccordionTitleProps] = null
  ): StrictAccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionPanelProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictAccordionPanelProps) {
    @scala.inline
    def duplicate: StrictAccordionPanelProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictAccordionPanelProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps with T]
    @scala.inline
    def withActiveUndefined: StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withActive(active: Boolean): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandItem[AccordionContentProps]): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withIndexString(index: String): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withIndexDouble(index: Double): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
    ): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
    @scala.inline
    def withTitle(title: SemanticShorthandItem[AccordionTitleProps]): StrictAccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionPanelMod.StrictAccordionPanelProps]
    }
  }
  
}

