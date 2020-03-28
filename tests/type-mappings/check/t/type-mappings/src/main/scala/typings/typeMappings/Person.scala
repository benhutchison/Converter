package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  var age: js.UndefOr[Double | Null] = js.native
  var name: String = js.native
}

object Person {
  @scala.inline
  def apply(name: String, age: Int | Double = null): Person = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit sealed class Sugar (x: Person) {
    @scala.inline
    def duplicate: Person = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.Person]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Person with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.Person with T]
    @scala.inline
    def withName(name: String): Person = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Person]
    @scala.inline
    def withAgeInt(age: Int): Person = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.Person]
    }
    @scala.inline
    def withAgeDouble(age: Double): Person = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (age != null) obj.updateDynamic("age")(age.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.Person]
    }
  }
  
}

