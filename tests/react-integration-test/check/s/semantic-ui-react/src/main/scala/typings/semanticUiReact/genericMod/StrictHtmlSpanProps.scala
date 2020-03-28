package typings.semanticUiReact.genericMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlSpanProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
}

object StrictHtmlSpanProps {
  @scala.inline
  def apply(children: ReactNode = null): StrictHtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlSpanProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: StrictHtmlSpanProps) {
    @scala.inline
    def duplicate: StrictHtmlSpanProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlSpanProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StrictHtmlSpanProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlSpanProps with T]
    @scala.inline
    def withChildren(children: ReactNode): StrictHtmlSpanProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.semanticUiReact.genericMod.StrictHtmlSpanProps]
    }
  }
  
}

