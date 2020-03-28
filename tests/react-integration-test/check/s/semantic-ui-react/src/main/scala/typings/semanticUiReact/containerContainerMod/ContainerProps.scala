package typings.semanticUiReact.containerContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProps
  extends StrictContainerProps
     with /* key */ StringDictionary[js.Any]

object ContainerProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ContainerProps) {
    @scala.inline
    def duplicate: ContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ContainerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withAs(as: js.Any): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withClassName(className: String): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withFluidUndefined: ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withTextUndefined: ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "text")
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withText(text: Boolean): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(text)) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
    @scala.inline
    def withTextAlign(textAlign: SemanticTEXTALIGNMENTS): ContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textAlign != null) obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.containerContainerMod.ContainerProps]
    }
  }
  
}

