package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  name  :string,   age  :number}, 'name' | 'age'> */
@js.native
trait U extends js.Object {
  var age: Double = js.native
  var name: String = js.native
}

object U {
  @scala.inline
  def apply(age: Double, name: String): U = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[U]
  }
  @scala.inline
  implicit sealed class Sugar (x: U) {
    @scala.inline
    def duplicate: U = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.U]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): U with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.U with T]
    @scala.inline
    def withAge(age: Double): U = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.U]
    @scala.inline
    def withName(name: String): U = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.U]
  }
  
}

