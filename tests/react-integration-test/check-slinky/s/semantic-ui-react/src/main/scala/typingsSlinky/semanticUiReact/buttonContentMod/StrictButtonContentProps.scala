package typingsSlinky.semanticUiReact.buttonContentMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictButtonContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Initially hidden, visible on hover. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Initially visible, hidden on hover. */
  var visible: js.UndefOr[Boolean] = js.native
}

object StrictButtonContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StrictButtonContentProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictButtonContentProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictButtonContentProps) {
    @scala.inline
    def duplicate: StrictButtonContentProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictButtonContentProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps with T]
    @scala.inline
    def withAs(as: js.Any): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withClassName(className: String): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withHiddenUndefined: StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withHidden(hidden: Boolean): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withVisibleUndefined: StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "visible")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
    @scala.inline
    def withVisible(visible: Boolean): StrictButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(visible)) obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonContentMod.StrictButtonContentProps]
    }
  }
  
}

