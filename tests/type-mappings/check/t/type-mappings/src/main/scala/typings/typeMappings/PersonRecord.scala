package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'name' | 'age', string> */
@js.native
trait PersonRecord extends js.Object {
  var age: String = js.native
  var name: String = js.native
}

object PersonRecord {
  @scala.inline
  def apply(age: String, name: String): PersonRecord = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersonRecord]
  }
  @scala.inline
  implicit sealed class Sugar (x: PersonRecord) {
    @scala.inline
    def duplicate: PersonRecord = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.PersonRecord]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): PersonRecord with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.PersonRecord with T]
    @scala.inline
    def withAge(age: String): PersonRecord = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.PersonRecord]
    @scala.inline
    def withName(name: String): PersonRecord = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.PersonRecord]
  }
  
}

