package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent type-mappings.Proxify<type-mappings.Person> */
@js.native
trait IProxiedPerson extends js.Object {
  var age: AnonGet = js.native
  var name: AnonSet = js.native
}

object IProxiedPerson {
  @scala.inline
  def apply(age: AnonGet, name: AnonSet): IProxiedPerson = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IProxiedPerson]
  }
  @scala.inline
  implicit sealed class Sugar (x: IProxiedPerson) {
    @scala.inline
    def duplicate: IProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.IProxiedPerson]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IProxiedPerson with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.IProxiedPerson with T]
    @scala.inline
    def withAge(age: AnonGet): IProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(age = age.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.IProxiedPerson]
    @scala.inline
    def withName(name: AnonSet): IProxiedPerson = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.IProxiedPerson]
  }
  
}

