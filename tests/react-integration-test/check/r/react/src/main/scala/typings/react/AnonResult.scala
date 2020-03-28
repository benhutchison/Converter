package typings.react

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResult[T /* <: ComponentType[_] */] extends js.Object {
  val _result: T = js.native
}

object AnonResult {
  @scala.inline
  def apply[T /* <: ComponentType[_] */](_result: T): AnonResult[T] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T <: ComponentType[_]] (x: AnonResult[T]) {
    @scala.inline
    def duplicate: AnonResult[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonResult[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonResult[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonResult[T] with T]
    @scala.inline
    def with_result(_result: T): AnonResult[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(_result = _result.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.AnonResult[T]]
  }
  
}

