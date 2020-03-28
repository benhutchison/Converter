package typingsSlinky.semanticUiReact.testContainerTestContainerMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTestContainerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** TestContainer has no maximum width. */
  var fluid: js.UndefOr[Boolean] = js.native
  /**Should be CallbackTo[Number]*/
  var optFn0Number: js.UndefOr[js.Function0[Double]] = js.native
  /**Should be Callback*/
  var optFn0Void: js.UndefOr[js.Function0[Unit]] = js.native
  /**Should be (x:Number) => CallbackTo[Number]*/
  var optFn1Number: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  /**Should be (x:Number) => Callback*/
  var optFn1Void: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.native
  /** Reduce maximum width to more naturally accommodate text. */
  var text: js.UndefOr[Boolean] = js.native
  /** Describes how the text inside this component should be aligned. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /**Should be CallbackTo[Number]*/
  def requiredFn0Number(): Double = js.native
  /**Should be Callback*/
  def requiredFn0Void(): Unit = js.native
  /**Should be (x:Number) => CallbackTo[Number]*/
  def requiredFn1Number(x: Double): Double = js.native
  /**Should be (x:Number) => Callback*/
  def requiredFn1Void(x: Double): Unit = js.native
}

object StrictTestContainerProps {
  @scala.inline
  def apply(
    requiredFn0Number: () => Double,
    requiredFn0Void: () => Unit,
    requiredFn1Number: Double => Double,
    requiredFn1Void: Double => Unit,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    optFn0Number: () => Double = null,
    optFn0Void: () => Unit = null,
    optFn1Number: /* x */ Double => Double = null,
    optFn1Void: /* x */ Double => Unit = null,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): StrictTestContainerProps = {
    val __obj = js.Dynamic.literal(requiredFn0Number = js.Any.fromFunction0(requiredFn0Number), requiredFn0Void = js.Any.fromFunction0(requiredFn0Void), requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1(requiredFn1Void))
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
    __obj.asInstanceOf[StrictTestContainerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictTestContainerProps) {
    @scala.inline
    def duplicate: StrictTestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictTestContainerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps with T]
    @scala.inline
    def withRequiredFn0Number(requiredFn0Number: () => Double): StrictTestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn0Number = js.Any.fromFunction0(requiredFn0Number)), x).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    @scala.inline
    def withRequiredFn0Void(requiredFn0Void: () => Unit): StrictTestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn0Void = js.Any.fromFunction0(requiredFn0Void)), x).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    @scala.inline
    def withRequiredFn1Number(requiredFn1Number: Double => Double): StrictTestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn1Number = js.Any.fromFunction1(requiredFn1Number)), x).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    @scala.inline
    def withRequiredFn1Void(requiredFn1Void: Double => Unit): StrictTestContainerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(requiredFn1Void = js.Any.fromFunction1(requiredFn1Void)), x).asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    @scala.inline
    def withAs(as: js.Any): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withClassName(className: String): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withContent(content: SemanticShorthandContent): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (content != null) obj.updateDynamic("content")(content.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withFluidUndefined: StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "fluid")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withFluid(fluid: Boolean): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(fluid)) obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withOptFn0Number(optFn0Number: () => Double): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn0Number != null) obj.updateDynamic("optFn0Number")(js.Any.fromFunction0(optFn0Number))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withOptFn0Void(optFn0Void: () => Unit): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn0Void != null) obj.updateDynamic("optFn0Void")(js.Any.fromFunction0(optFn0Void))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withOptFn1Number(optFn1Number: /* x */ Double => Double): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn1Number != null) obj.updateDynamic("optFn1Number")(js.Any.fromFunction1(optFn1Number))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withOptFn1Void(optFn1Void: /* x */ Double => Unit): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (optFn1Void != null) obj.updateDynamic("optFn1Void")(js.Any.fromFunction1(optFn1Void))
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withTextUndefined: StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "text")
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withText(text: Boolean): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(text)) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
    @scala.inline
    def withTextAlign(textAlign: SemanticTEXTALIGNMENTS): StrictTestContainerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textAlign != null) obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.testContainerTestContainerMod.StrictTestContainerProps]
    }
  }
  
}

