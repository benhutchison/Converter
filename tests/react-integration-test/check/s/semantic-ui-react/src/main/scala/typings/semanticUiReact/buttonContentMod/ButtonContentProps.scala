package typings.semanticUiReact.buttonContentMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonContentProps
  extends StrictButtonContentProps
     with /* key */ StringDictionary[js.Any]

object ButtonContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ButtonContentProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonContentProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ButtonContentProps) {
    @scala.inline
    def duplicate: ButtonContentProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ButtonContentProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withAs(as: js.Any): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withClassName(className: String): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withHiddenUndefined: ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "hidden")
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withHidden(hidden: Boolean): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(hidden)) obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withVisibleUndefined: ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "visible")
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
    @scala.inline
    def withVisible(visible: Boolean): ButtonContentProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(visible)) obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.buttonContentMod.ButtonContentProps]
    }
  }
  
}

