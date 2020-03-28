package typings.unionToInheritance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Either[L, R]
  extends Legal3[js.Any, L, R]
     with _Test[js.Any, L, R]
     with _Test2[R, L] {
  var value: R = js.native
}

object Either {
  @scala.inline
  def apply[L, R](value: R): Either[L, R] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Either[L, R]]
  }
  @scala.inline
  implicit sealed class Sugar[L, R] (x: Either[L, R]) {
    @scala.inline
    def duplicate: Either[L, R] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.unionToInheritance.Either[L, R]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (Either[L, R]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.unionToInheritance.Either[L, R] with T]
    @scala.inline
    def withValue(value: R): Either[L, R] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.unionToInheritance.Either[L, R]]
  }
  
}

