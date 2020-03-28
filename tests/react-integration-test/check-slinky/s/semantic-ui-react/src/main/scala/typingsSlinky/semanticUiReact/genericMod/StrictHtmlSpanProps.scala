package typingsSlinky.semanticUiReact.genericMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlSpanProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
}

object StrictHtmlSpanProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): StrictHtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlSpanProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlSpanProps) {
    @scala.inline
    def duplicate: StrictHtmlSpanProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlSpanProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlSpanProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlSpanProps with T]
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictHtmlSpanProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlSpanProps]
    }
  }
  
}

