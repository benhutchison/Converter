package typingsSlinky.semanticUiReact.containerContainerMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictContainerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Container has no maximum width. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Reduce maximum width to more naturally accommodate text. */
  var text: js.UndefOr[Boolean] = js.native
  /** Describes how the text inside this component should be aligned. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
}

object StrictContainerProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): StrictContainerProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictContainerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictContainerProps) {
    @scala.inline
    def duplicate: StrictContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictContainerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps with T]
    @scala.inline
    def withAs(as: js.Any): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withClassName(className: String): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withFluidUndefined: StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withTextUndefined: StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "text")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withText(text: Boolean): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(text)) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
    @scala.inline
    def withTextAlign(textAlign: SemanticTEXTALIGNMENTS): StrictContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textAlign != null) obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.containerContainerMod.StrictContainerProps]
    }
  }
  
}

