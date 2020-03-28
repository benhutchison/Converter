package typingsSlinky.semanticUiReact.genericMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlIframeProps
  extends StrictHtmlIframeProps
     with /* key */ StringDictionary[js.Any]

object HtmlIframeProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, src: String = null): HtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIframeProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: HtmlIframeProps) {
    @scala.inline
    def duplicate: HtmlIframeProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlIframeProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HtmlIframeProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlIframeProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): HtmlIframeProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlIframeProps]
    }
    @scala.inline
    def withSrc(src: String): HtmlIframeProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (src != null) obj.updateDynamic("src")(src.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlIframeProps]
    }
  }
  
}

