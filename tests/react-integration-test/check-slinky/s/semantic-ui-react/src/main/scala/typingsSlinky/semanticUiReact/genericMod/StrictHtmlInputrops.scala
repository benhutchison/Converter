package typingsSlinky.semanticUiReact.genericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlInputrops extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object StrictHtmlInputrops {
  @scala.inline
  def apply(`type`: String = null): StrictHtmlInputrops = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlInputrops]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlInputrops) {
    @scala.inline
    def duplicate: StrictHtmlInputrops = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlInputrops]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlInputrops with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlInputrops with T]
    @scala.inline
    def withType(`type`: String): StrictHtmlInputrops = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlInputrops]
    }
  }
  
}

