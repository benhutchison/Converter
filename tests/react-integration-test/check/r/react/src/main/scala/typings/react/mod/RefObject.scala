package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefObject[T] extends js.Object {
  val current: T | Null = js.native
}

object RefObject {
  @scala.inline
  def apply[T](current: T = null): RefObject[T] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefObject[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: RefObject[T]) {
    @scala.inline
    def duplicate: RefObject[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.RefObject[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RefObject[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.RefObject[T] with T]
    @scala.inline
    def withCurrent(current: T): RefObject[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (current != null) obj.updateDynamic("current")(current.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.RefObject[T]]
    }
  }
  
}

