package typingsSlinky.semanticUiReact.accordionPanelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps
import typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionPanelProps
  extends StrictAccordionPanelProps
     with /* key */ StringDictionary[js.Any]

object AccordionPanelProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[AccordionContentProps] = null,
    index: Double | String = null,
    onTitleClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit = null,
    title: SemanticShorthandItem[AccordionTitleProps] = null
  ): AccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AccordionPanelProps) {
    @scala.inline
    def duplicate: AccordionPanelProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AccordionPanelProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withActiveUndefined: AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withActive(active: Boolean): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandItem[AccordionContentProps]): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withIndexString(index: String): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withIndexDouble(index: Double): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withOnTitleClick(
      onTitleClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit
    ): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onTitleClick != null) obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
    @scala.inline
    def withTitle(title: SemanticShorthandItem[AccordionTitleProps]): AccordionPanelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (title != null) obj.updateDynamic("title")(title.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps]
    }
  }
  
}

