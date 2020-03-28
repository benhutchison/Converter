package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T]

object HTMLProps {
  @scala.inline
  def apply[T](AllHTMLAttributes: AllHTMLAttributes[T] = null, ClassAttributes: ClassAttributes[T] = null): HTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[HTMLProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: HTMLProps[T]) {
    @scala.inline
    def duplicate: HTMLProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.HTMLProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HTMLProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.HTMLProps[T] with T]
    @scala.inline
    def withAllHTMLAttributes(AllHTMLAttributes: AllHTMLAttributes[T]): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(obj, AllHTMLAttributes)
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
    @scala.inline
    def withClassAttributes(ClassAttributes: ClassAttributes[T]): HTMLProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(obj, ClassAttributes)
      obj.asInstanceOf[typings.react.mod.HTMLProps[T]]
    }
  }
  
}

