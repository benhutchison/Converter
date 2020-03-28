package typingsJapgolly.react.mod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T]

object HTMLProps {
  @scala.inline
  def apply[T](
    accept: String = null,
    acceptCharset: String = null,
    children: VdomNode = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: japgolly.scalajs.react.raw.React.Ref = null
  ): HTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: HTMLProps[T]) {
    @scala.inline
    def duplicate: HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HTMLProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T] with T]
    @scala.inline
    def withAccept(accept: String): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withAcceptCharset(acceptCharset: String): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (acceptCharset != null) obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withChildren(children: VdomNode): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDefaultCheckedUndefined: HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withKey(key: Key): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withRef(ref: japgolly.scalajs.react.raw.React.Ref): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[T]]
    }
  }
  
}

