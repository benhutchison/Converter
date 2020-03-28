package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<type-mappings.Person> */
@js.native
trait PartialPerson extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
}

object PartialPerson {
  @scala.inline
  def apply(age: Int | Double = null, name: String = null): PartialPerson = {
    val __obj = js.Dynamic.literal()
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: PartialPerson) {
    @scala.inline
    def duplicate: PartialPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.PartialPerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): PartialPerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.PartialPerson with T]
    @scala.inline
    def withAgeInt(age: Int): PartialPerson = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.PartialPerson]
    }
    @scala.inline
    def withAgeDouble(age: Double): PartialPerson = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.PartialPerson]
    }
    @scala.inline
    def withName(name: String): PartialPerson = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.PartialPerson]
    }
  }
  
}

