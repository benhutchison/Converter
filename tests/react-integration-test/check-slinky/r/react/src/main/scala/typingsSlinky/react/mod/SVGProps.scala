package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGProps[T]
  extends SVGAttributes[T]
     with ClassAttributes[T]

object SVGProps {
  @scala.inline
  def apply[T](ClassAttributes: ClassAttributes[T] = null, SVGAttributes: SVGAttributes[T] = null): SVGProps[T] = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    __obj.asInstanceOf[SVGProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: SVGProps[T]) {
    @scala.inline
    def duplicate: SVGProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.SVGProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.SVGProps[T] with T]
    @scala.inline
    def withClassAttributes(ClassAttributes: ClassAttributes[T]): SVGProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(obj, ClassAttributes)
      obj.asInstanceOf[typingsSlinky.react.mod.SVGProps[T]]
    }
    @scala.inline
    def withSVGAttributes(SVGAttributes: SVGAttributes[T]): SVGProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (SVGAttributes != null) js.Dynamic.global.Object.assign(obj, SVGAttributes)
      obj.asInstanceOf[typingsSlinky.react.mod.SVGProps[T]]
    }
  }
  
}

