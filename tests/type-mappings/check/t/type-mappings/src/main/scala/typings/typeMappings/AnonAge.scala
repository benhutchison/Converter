package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAge extends js.Object {
  var age: Double = js.native
}

object AnonAge {
  @scala.inline
  def apply(age: Double): AnonAge = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAge]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonAge) {
    @scala.inline
    def duplicate: AnonAge = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.AnonAge]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonAge with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.AnonAge with T]
    @scala.inline
    def withAge(age: Double): AnonAge = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.AnonAge]
  }
  
}

