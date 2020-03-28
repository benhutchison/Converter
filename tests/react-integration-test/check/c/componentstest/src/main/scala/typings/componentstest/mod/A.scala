package typings.componentstest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A extends Props {
  var aMember: Double = js.native
  def aCallback(): Double = js.native
}

object A {
  @scala.inline
  def apply(aCallback: () => Double, aMember: Double): A = {
    val __obj = js.Dynamic.literal(aCallback = js.Any.fromFunction0(aCallback), aMember = aMember.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A]
  }
  @scala.inline
  implicit sealed class Sugar (x: A) {
    @scala.inline
    def duplicate: A = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.componentstest.mod.A]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): A with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.componentstest.mod.A with T]
    @scala.inline
    def withACallback(aCallback: () => Double): A = js.Dynamic.global.Object.assign(js.Dynamic.literal(aCallback = js.Any.fromFunction0(aCallback)), x).asInstanceOf[typings.componentstest.mod.A]
    @scala.inline
    def withAMember(aMember: Double): A = js.Dynamic.global.Object.assign(js.Dynamic.literal(aMember = aMember.asInstanceOf[js.Any]), x).asInstanceOf[typings.componentstest.mod.A]
  }
  
}

