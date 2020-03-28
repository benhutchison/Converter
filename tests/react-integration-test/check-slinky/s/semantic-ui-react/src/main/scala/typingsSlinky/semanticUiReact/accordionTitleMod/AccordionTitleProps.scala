package typingsSlinky.semanticUiReact.accordionTitleMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionTitleProps
  extends StrictAccordionTitleProps
     with /* key */ StringDictionary[js.Any]

object AccordionTitleProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    icon: SemanticShorthandItem[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ _
    ] = null,
    index: Double | String = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit = null
  ): AccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[AccordionTitleProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AccordionTitleProps) {
    @scala.inline
    def duplicate: AccordionTitleProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AccordionTitleProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withActiveUndefined: AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withActive(active: Boolean): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withAs(as: js.Any): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withClassName(className: String): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withIcon(
      icon: SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ _
        ]
    ): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (icon != null) obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withIndexString(index: String): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withIndexDouble(index: Double): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (index != null) obj.updateDynamic("index")(index.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
    @scala.inline
    def withOnClick(onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit): AccordionTitleProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onClick != null) obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps]
    }
  }
  
}

