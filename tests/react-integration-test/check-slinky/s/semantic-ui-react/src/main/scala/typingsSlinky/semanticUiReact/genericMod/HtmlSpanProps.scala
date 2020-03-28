package typingsSlinky.semanticUiReact.genericMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlSpanProps
  extends StrictHtmlSpanProps
     with /* key */ StringDictionary[js.Any]

object HtmlSpanProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, children: TagMod[Any] = null): HtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSpanProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: HtmlSpanProps) {
    @scala.inline
    def duplicate: HtmlSpanProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HtmlSpanProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): HtmlSpanProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): HtmlSpanProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps]
    }
  }
  
}

