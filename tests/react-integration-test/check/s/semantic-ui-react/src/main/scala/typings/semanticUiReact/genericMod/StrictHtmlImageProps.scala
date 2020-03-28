package typings.semanticUiReact.genericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlImageProps extends js.Object {
  var src: js.UndefOr[String] = js.native
}

object StrictHtmlImageProps {
  @scala.inline
  def apply(src: String = null): StrictHtmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlImageProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlImageProps) {
    @scala.inline
    def duplicate: StrictHtmlImageProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlImageProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlImageProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlImageProps with T]
    @scala.inline
    def withSrc(src: String): StrictHtmlImageProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (src != null) obj.updateDynamic("src")(src.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlImageProps]
    }
  }
  
}

