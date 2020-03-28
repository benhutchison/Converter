package typings.react.mod

import typings.react.AnonHtml
import typings.react.reactStrings.foo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProps[T] extends AllHTMLAttributes[T] {
  var defaultValue: foo = js.native
  var onChange: foo = js.native
  var `type`: foo = js.native
  var value: foo = js.native
}

object HTMLProps {
  @scala.inline
  def apply[T](
    defaultValue: foo,
    onChange: foo,
    `type`: foo,
    value: foo,
    accept: String = null,
    acceptCharset: String = null,
    children: ReactNode = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): HTMLProps[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: HTMLProps[T]) {
    @scala.inline
    def duplicate: HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.HTMLProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HTMLProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.HTMLProps[T] with T]
    @scala.inline
    def withDefaultValue(defaultValue: foo): HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.HTMLProps[T]]
    @scala.inline
    def withOnChange(onChange: foo): HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.HTMLProps[T]]
    @scala.inline
    def withType(`type`: foo): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withValue(value: foo): HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.HTMLProps[T]]
    @scala.inline
    def withAccept(accept: String): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withAcceptCharset(acceptCharset: String): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (acceptCharset != null) obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withChildren(children: ReactNode): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDefaultCheckedUndefined: HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "defaultChecked")
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withDefaultChecked(defaultChecked: Boolean): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(defaultChecked)) obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
  }
  
}

