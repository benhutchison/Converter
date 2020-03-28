package typings.semanticUiReact.genericMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlInputrops
  extends StrictHtmlInputrops
     with /* key */ StringDictionary[js.Any]

object HtmlInputrops {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, `type`: String = null): HtmlInputrops = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlInputrops]
  }
  @scala.inline
  implicit sealed class Sugar (x: HtmlInputrops) {
    @scala.inline
    def duplicate: HtmlInputrops = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.genericMod.HtmlInputrops]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HtmlInputrops with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.genericMod.HtmlInputrops with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): HtmlInputrops = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.semanticUiReact.genericMod.HtmlInputrops]
    }
    @scala.inline
    def withType(`type`: String): HtmlInputrops = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.genericMod.HtmlInputrops]
    }
  }
  
}

