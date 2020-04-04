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
}

