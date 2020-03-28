package typingsSlinky.react.mod

import slinky.core.TagMod
import typingsSlinky.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllHTMLAttributes[T] extends HTMLAttributes[T] {
  var accept: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
}

object AllHTMLAttributes {
  @scala.inline
  def apply[T](
    accept: String = null,
    acceptCharset: String = null,
    children: TagMod[Any] = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): AllHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllHTMLAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: AllHTMLAttributes[T]) {
    @scala.inline
    def duplicate: AllHTMLAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AllHTMLAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T] with T]
    @scala.inline
    def withAccept(accept: String): AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
    @scala.inline
    def withAcceptCharset(acceptCharset: String): AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (acceptCharset != null) obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
    @scala.inline
    def withChildren(children: TagMod[Any]): AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultCheckedUndefined: AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): AllHTMLAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.AllHTMLAttributes[T]]
    }
  }
  
}

