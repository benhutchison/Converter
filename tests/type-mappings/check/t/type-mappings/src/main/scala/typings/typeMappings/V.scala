package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  name  :string,   age  :number}, 'age'> */
@js.native
trait V extends js.Object {
  var age: Double = js.native
}

object V {
  @scala.inline
  def apply(age: Double): V = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[V]
  }
  @scala.inline
  implicit sealed class Sugar (x: V) {
    @scala.inline
    def duplicate: V = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.V]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): V with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.V with T]
    @scala.inline
    def withAge(age: Double): V = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.V]
  }
  
}

