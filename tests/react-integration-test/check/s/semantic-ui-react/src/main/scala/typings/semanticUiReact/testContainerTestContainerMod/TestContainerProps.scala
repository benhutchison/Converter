package typings.semanticUiReact.testContainerTestContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestContainerProps
  extends StrictTestContainerProps
     with /* key */ StringDictionary[js.Any]

object TestContainerProps {
  @scala.inline
  def apply(
    requiredFn0Number: () => Double,
    requiredFn0Void: () => Unit,
    requiredFn1Number: Double => Double,
    requiredFn1Void: Double => Unit,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    optFn0Number: () => Double = null,
    optFn0Void: () => Unit = null,
    optFn1Number: /* x */ Double => Double = null,
    optFn1Void: /* x */ Double => Unit = null,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): TestContainerProps = {
    val __obj = js.Dynamic.literal(requiredFn0Number = js.Any.fromFunction0(requiredFn0Number), requiredFn0Void = js.Any.fromFunction0(requiredFn0Void), requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1(requiredFn1Void))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (optFn0Number != null) __obj.updateDynamic("optFn0Number")(js.Any.fromFunction0(optFn0Number))
    if (optFn0Void != null) __obj.updateDynamic("optFn0Void")(js.Any.fromFunction0(optFn0Void))
    if (optFn1Number != null) __obj.updateDynamic("optFn1Number")(js.Any.fromFunction1(optFn1Number))
    if (optFn1Void != null) __obj.updateDynamic("optFn1Void")(js.Any.fromFunction1(optFn1Void))
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestContainerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: TestContainerProps) {
    @scala.inline
    def duplicate: TestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TestContainerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps with T]
    @scala.inline
    def withRequiredFn0Number(requiredFn0Number: () => Double): TestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn0Number = js.Any.fromFunction0(requiredFn0Number)), x).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    @scala.inline
    def withRequiredFn0Void(requiredFn0Void: () => Unit): TestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn0Void = js.Any.fromFunction0(requiredFn0Void)), x).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    @scala.inline
    def withRequiredFn1Number(requiredFn1Number: Double => Double): TestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn1Number = js.Any.fromFunction1(requiredFn1Number)), x).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    @scala.inline
    def withRequiredFn1Void(requiredFn1Void: Double => Unit): TestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn1Void = js.Any.fromFunction1(requiredFn1Void)), x).asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withAs(as: js.Any): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withChildren(children: ReactNode): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withClassName(className: String): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withFluidUndefined: TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withOptFn0Number(optFn0Number: () => Double): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn0Number != null) obj.updateDynamic("optFn0Number")(js.Any.fromFunction0(optFn0Number))
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withOptFn0Void(optFn0Void: () => Unit): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn0Void != null) obj.updateDynamic("optFn0Void")(js.Any.fromFunction0(optFn0Void))
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withOptFn1Number(optFn1Number: /* x */ Double => Double): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn1Number != null) obj.updateDynamic("optFn1Number")(js.Any.fromFunction1(optFn1Number))
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withOptFn1Void(optFn1Void: /* x */ Double => Unit): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn1Void != null) obj.updateDynamic("optFn1Void")(js.Any.fromFunction1(optFn1Void))
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withTextUndefined: TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "text")
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withText(text: Boolean): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(text)) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
    @scala.inline
    def withTextAlign(textAlign: SemanticTEXTALIGNMENTS): TestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textAlign != null) obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.testContainerTestContainerMod.TestContainerProps]
    }
  }
  
}

