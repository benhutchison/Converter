package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<type-mappings.Person> */
@js.native
trait RequiredPerson extends js.Object {
  var age: Double = js.native
  var name: String = js.native
}

object RequiredPerson {
  @scala.inline
  def apply(age: Double, name: String): RequiredPerson = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredPerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: RequiredPerson) {
    @scala.inline
    def duplicate: RequiredPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.RequiredPerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RequiredPerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.RequiredPerson with T]
    @scala.inline
    def withAge(age: Double): RequiredPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.RequiredPerson]
    @scala.inline
    def withName(name: String): RequiredPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.RequiredPerson]
  }
  
}

