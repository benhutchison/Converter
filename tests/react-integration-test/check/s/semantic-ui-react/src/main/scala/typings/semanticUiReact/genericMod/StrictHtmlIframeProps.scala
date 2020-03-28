package typings.semanticUiReact.genericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlIframeProps extends js.Object {
  var src: js.UndefOr[String] = js.native
}

object StrictHtmlIframeProps {
  @scala.inline
  def apply(src: String = null): StrictHtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlIframeProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlIframeProps) {
    @scala.inline
    def duplicate: StrictHtmlIframeProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlIframeProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlIframeProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlIframeProps with T]
    @scala.inline
    def withSrc(src: String): StrictHtmlIframeProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (src != null) obj.updateDynamic("src")(src.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlIframeProps]
    }
  }
  
}

