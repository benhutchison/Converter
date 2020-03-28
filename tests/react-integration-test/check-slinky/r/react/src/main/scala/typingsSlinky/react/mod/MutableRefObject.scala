package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableRefObject[T] extends js.Object {
  var current: T = js.native
}

object MutableRefObject {
  @scala.inline
  def apply[T](current: T): MutableRefObject[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MutableRefObject[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: MutableRefObject[T]) {
    @scala.inline
    def duplicate: MutableRefObject[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.MutableRefObject[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): MutableRefObject[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.MutableRefObject[T] with T]
    @scala.inline
    def withCurrent(current: T): MutableRefObject[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(current = current.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.MutableRefObject[T]]
  }
  
}

