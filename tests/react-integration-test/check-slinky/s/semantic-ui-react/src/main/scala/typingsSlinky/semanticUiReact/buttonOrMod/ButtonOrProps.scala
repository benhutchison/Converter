package typingsSlinky.semanticUiReact.buttonOrMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOrProps
  extends StrictButtonOrProps
     with /* key */ StringDictionary[js.Any]

object ButtonOrProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    text: Double | String = null
  ): ButtonOrProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOrProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ButtonOrProps) {
    @scala.inline
    def duplicate: ButtonOrProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ButtonOrProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): ButtonOrProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    }
    @scala.inline
    def withAs(as: js.Any): ButtonOrProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (as != null) obj.updateDynamic("as")(as.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    }
    @scala.inline
    def withClassName(className: String): ButtonOrProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    }
    @scala.inline
    def withTextString(text: String): ButtonOrProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (text != null) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    }
    @scala.inline
    def withTextDouble(text: Double): ButtonOrProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (text != null) obj.updateDynamic("text")(text.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps]
    }
  }
  
}

