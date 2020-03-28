package typings.react.mod

import typings.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](children: ReactNode = null, dangerouslySetInnerHTML: AnonHtml = null): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: DOMAttributes[T]) {
    @scala.inline
    def duplicate: DOMAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.DOMAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DOMAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.DOMAttributes[T] with T]
    @scala.inline
    def withChildren(children: ReactNode): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): DOMAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.DOMAttributes[T]]
    }
  }
  
}

