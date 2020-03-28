package typingsSlinky.semanticUiReact.genericMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlLabelProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
}

object StrictHtmlLabelProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): StrictHtmlLabelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlLabelProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlLabelProps) {
    @scala.inline
    def duplicate: StrictHtmlLabelProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlLabelProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlLabelProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlLabelProps with T]
    @scala.inline
    def withChildren(children: TagMod[Any]): StrictHtmlLabelProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.semanticUiReact.genericMod.StrictHtmlLabelProps]
    }
  }
  
}

