package typings.expandTypeParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.expandTypeParameters.TA because Already inherited */ @js.native
trait A extends B {
  var a: Double = js.native
}

object A {
  @scala.inline
  def apply(a: Double, b: String): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A]
  }
  @scala.inline
  implicit sealed class Sugar (x: A) {
    @scala.inline
    def duplicate: A = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.expandTypeParameters.A]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): A with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.expandTypeParameters.A with T]
    @scala.inline
    def withA(a: Double): A = js.Dynamic.global.Object.assign(js.Dynamic.literal(a = a.asInstanceOf[js.Any]), x).asInstanceOf[typings.expandTypeParameters.A]
    @scala.inline
    def withB(b: String): A = js.Dynamic.global.Object.assign(js.Dynamic.literal(b = b.asInstanceOf[js.Any]), x).asInstanceOf[typings.expandTypeParameters.A]
  }
  
}

