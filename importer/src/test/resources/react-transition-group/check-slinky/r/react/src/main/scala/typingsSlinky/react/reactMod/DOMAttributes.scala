package typingsSlinky.react.reactMod

import slinky.core.TagMod
import typingsSlinky.react.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](children: TagMod[Any] = null, dangerouslySetInnerHTML: Anon_Html = null): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

