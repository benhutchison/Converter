package typings.reactDropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneRef extends js.Object {
  def open(): Unit = js.native
}

object DropzoneRef {
  @scala.inline
  def apply(open: () => Unit): DropzoneRef = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[DropzoneRef]
  }
  @scala.inline
  implicit sealed class Sugar (x: DropzoneRef) {
    @scala.inline
    def duplicate: DropzoneRef = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactDropzone.mod.DropzoneRef]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DropzoneRef with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactDropzone.mod.DropzoneRef with T]
    @scala.inline
    def withOpen(open: () => Unit): DropzoneRef = js.Dynamic.global.Object.assign(js.Dynamic.literal(open = js.Any.fromFunction0(open)), x).asInstanceOf[typings.reactDropzone.mod.DropzoneRef]
  }
  
}

