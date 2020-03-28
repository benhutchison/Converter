package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerProps[T] extends js.Object {
  var unstable_observedBits: js.UndefOr[Double] = js.native
  def children(value: T): ReactNode = js.native
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: T => ReactNode, unstable_observedBits: Int | Double = null): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ConsumerProps[T]) {
    @scala.inline
    def duplicate: ConsumerProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ConsumerProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ConsumerProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ConsumerProps[T] with T]
    @scala.inline
    def withChildren(children: T => ReactNode): ConsumerProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(children = js.Any.fromFunction1(children)), x).asInstanceOf[typings.react.mod.ConsumerProps[T]]
    @scala.inline
    def withUnstable_observedBitsInt(unstable_observedBits: Int): ConsumerProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unstable_observedBits != null) obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ConsumerProps[T]]
    }
    @scala.inline
    def withUnstable_observedBitsDouble(unstable_observedBits: Double): ConsumerProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unstable_observedBits != null) obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ConsumerProps[T]]
    }
  }
  
}

