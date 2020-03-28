package typingsSlinky.semanticUiReact.genericMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlImageProps
  extends StrictHtmlImageProps
     with /* key */ StringDictionary[js.Any]

object HtmlImageProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, src: String = null): HtmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlImageProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: HtmlImageProps) {
    @scala.inline
    def duplicate: HtmlImageProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlImageProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HtmlImageProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlImageProps with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): HtmlImageProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlImageProps]
    }
    @scala.inline
    def withSrc(src: String): HtmlImageProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (src != null) obj.updateDynamic("src")(src.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.HtmlImageProps]
    }
  }
  
}

