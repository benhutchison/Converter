package typings.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var language: js.Any = js.native
}

object Attributes {
  @scala.inline
  def apply(language: js.Any): Attributes = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit sealed class Sugar (x: Attributes) {
    @scala.inline
    def duplicate: Attributes = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.cldrjs.mod.Attributes]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Attributes with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.cldrjs.mod.Attributes with T]
    @scala.inline
    def withLanguage(language: js.Any): Attributes = js.Dynamic.global.Object.assign(js.Dynamic.literal(language = language.asInstanceOf[js.Any]), x).asInstanceOf[typings.cldrjs.mod.Attributes]
  }
  
}

