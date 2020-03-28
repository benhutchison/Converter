package typings.numjs.mod

import typings.ndarray.mod.Data
import typings.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NdArray[T] extends ndarray[T] {
  @JSName("T")
  var T_NdArray: NdArray[T] = js.native
  var ndim: Double = js.native
  def slice(args: Double*): NdArray[T] = js.native
}

object NdArray {
  @scala.inline
  def apply[T](T: NdArray[T], data: Data[T], ndim: Double, slice: /* repeated */ Double => NdArray[T]): NdArray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], ndim = ndim.asInstanceOf[js.Any], slice = js.Any.fromFunction1(slice))
  
    __obj.asInstanceOf[NdArray[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: NdArray[T]) {
    @scala.inline
    def duplicate: NdArray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.numjs.mod.NdArray[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): NdArray[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.numjs.mod.NdArray[T] with T]
    @scala.inline
    def withT(T: NdArray[T]): NdArray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(T = T.asInstanceOf[js.Any]), x).asInstanceOf[typings.numjs.mod.NdArray[T]]
    @scala.inline
    def withData(data: Data[T]): NdArray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(data = data.asInstanceOf[js.Any]), x).asInstanceOf[typings.numjs.mod.NdArray[T]]
    @scala.inline
    def withNdim(ndim: Double): NdArray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(ndim = ndim.asInstanceOf[js.Any]), x).asInstanceOf[typings.numjs.mod.NdArray[T]]
    @scala.inline
    def withSlice(slice: /* repeated */ Double => NdArray[T]): NdArray[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(slice = js.Any.fromFunction1(slice)), x).asInstanceOf[typings.numjs.mod.NdArray[T]]
  }
  
}

