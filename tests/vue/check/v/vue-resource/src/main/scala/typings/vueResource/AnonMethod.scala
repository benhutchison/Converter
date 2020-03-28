package typings.vueResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMethod extends js.Object {
  var method: String = js.native
}

object AnonMethod {
  @scala.inline
  def apply(method: String): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethod]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonMethod) {
    @scala.inline
    def duplicate: AnonMethod = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.AnonMethod]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonMethod with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.AnonMethod with T]
    @scala.inline
    def withMethod(method: String): AnonMethod = js.Dynamic.global.Object.assign(js.Dynamic.literal(method = method.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.AnonMethod]
  }
  
}

