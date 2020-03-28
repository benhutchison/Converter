package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<type-mappings.Person> */
@js.native
trait ReadonlyPerson extends js.Object {
  val age: js.UndefOr[Double] = js.native
  val name: String = js.native
}

object ReadonlyPerson {
  @scala.inline
  def apply(name: String, age: Int | Double = null): ReadonlyPerson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReadonlyPerson) {
    @scala.inline
    def duplicate: ReadonlyPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.ReadonlyPerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReadonlyPerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.ReadonlyPerson with T]
    @scala.inline
    def withName(name: String): ReadonlyPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.ReadonlyPerson]
    @scala.inline
    def withAgeInt(age: Int): ReadonlyPerson = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.ReadonlyPerson]
    }
    @scala.inline
    def withAgeDouble(age: Double): ReadonlyPerson = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.ReadonlyPerson]
    }
  }
  
}

