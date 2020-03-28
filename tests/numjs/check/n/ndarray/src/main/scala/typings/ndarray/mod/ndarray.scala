package typings.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ndarray[T] extends js.Object {
  var T: ndarray[T] = js.native
  var data: Data[T] = js.native
}

object ndarray {
  @scala.inline
  def apply[T](T: ndarray[T], data: Data[T]): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ndarray[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ndarray[T]) {
    @scala.inline
    def duplicate: ndarray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.ndarray.mod.ndarray[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ndarray[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.ndarray.mod.ndarray[T] with T]
    @scala.inline
    def withT(T: ndarray[T]): ndarray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(T = T.asInstanceOf[js.Any]), x).asInstanceOf[typings.ndarray.mod.ndarray[T]]
    @scala.inline
    def withData(data: Data[T]): ndarray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(data = data.asInstanceOf[js.Any]), x).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  }
  
}

