package typingsSlinky.semanticUiReact.accordionContentMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionContentProps
  extends StrictAccordionContentProps
     with /* key */ StringDictionary[js.Any]

object AccordionContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null
  ): AccordionContentProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionContentProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AccordionContentProps) {
    @scala.inline
    def duplicate: AccordionContentProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AccordionContentProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withActiveUndefined: AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withActive(active: Boolean): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withAs(as: js.Any): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withClassName(className: String): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): AccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps]
    }
  }
  
}

