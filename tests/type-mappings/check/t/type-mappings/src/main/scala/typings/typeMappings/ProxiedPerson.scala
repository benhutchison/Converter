package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined type-mappings.Proxify<type-mappings.Person> */
@js.native
trait ProxiedPerson extends js.Object {
  var age: AnonGet = js.native
  var name: AnonSet = js.native
}

object ProxiedPerson {
  @scala.inline
  def apply(age: AnonGet, name: AnonSet): ProxiedPerson = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxiedPerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: ProxiedPerson) {
    @scala.inline
    def duplicate: ProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.ProxiedPerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ProxiedPerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.ProxiedPerson with T]
    @scala.inline
    def withAge(age: AnonGet): ProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.ProxiedPerson]
    @scala.inline
    def withName(name: AnonSet): ProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.ProxiedPerson]
  }
  
}

