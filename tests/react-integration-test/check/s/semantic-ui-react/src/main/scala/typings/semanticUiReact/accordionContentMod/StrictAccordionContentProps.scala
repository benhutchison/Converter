package typings.semanticUiReact.accordionContentMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictAccordionContentProps extends js.Object {
  /** Whether or not the content is visible. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
}

object StrictAccordionContentProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null
  ): StrictAccordionContentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionContentProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictAccordionContentProps) {
    @scala.inline
    def duplicate: StrictAccordionContentProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictAccordionContentProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps with T]
    @scala.inline
    def withActiveUndefined: StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "active")
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
    @scala.inline
    def withActive(active: Boolean): StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(active)) obj.updateDynamic("active")(active.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
    @scala.inline
    def withAs(as: js.Any): StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
    @scala.inline
    def withClassName(className: String): StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictAccordionContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.accordionContentMod.StrictAccordionContentProps]
    }
  }
  
}

