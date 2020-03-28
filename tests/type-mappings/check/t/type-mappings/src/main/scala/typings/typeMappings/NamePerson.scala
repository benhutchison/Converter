package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<type-mappings.Person, 'name'> */
@js.native
trait NamePerson extends js.Object {
  var name: String = js.native
}

object NamePerson {
  @scala.inline
  def apply(name: String): NamePerson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamePerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: NamePerson) {
    @scala.inline
    def duplicate: NamePerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.NamePerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): NamePerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.NamePerson with T]
    @scala.inline
    def withName(name: String): NamePerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.NamePerson]
  }
  
}

