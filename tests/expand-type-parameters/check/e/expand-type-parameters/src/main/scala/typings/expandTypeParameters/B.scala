package typings.expandTypeParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B extends TA {
  var b: String = js.native
}

object B {
  @scala.inline
  def apply(b: String): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[B]
  }
  @scala.inline
  implicit sealed class Sugar (x: B) {
    @scala.inline
    def duplicate: B = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.expandTypeParameters.B]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): B with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.expandTypeParameters.B with T]
    @scala.inline
    def withB(b: String): B = js.Dynamic.global.Object.assign(js.Dynamic.literal(b = b.asInstanceOf[js.Any]), x).asInstanceOf[typings.expandTypeParameters.B]
  }
  
}

