package typings.fpTs.hktMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HKT[URI, A] extends js.Object {
  val _A: A = js.native
  val _URI: URI = js.native
}

object HKT {
  @scala.inline
  def apply[URI, A](_A: A, _URI: URI): HKT[URI, A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HKT[URI, A]]
  }
  @scala.inline
  implicit sealed class Sugar[URI, A] (x: HKT[URI, A]) {
    @scala.inline
    def duplicate: HKT[URI, A] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.fpTs.hktMod.HKT[URI, A]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (HKT[URI, A]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.fpTs.hktMod.HKT[URI, A] with T]
    @scala.inline
    def with_A(_A: A): HKT[URI, A] = js.Dynamic.global.Object.assign(js.Dynamic.literal(_A = _A.asInstanceOf[js.Any]), x).asInstanceOf[typings.fpTs.hktMod.HKT[URI, A]]
    @scala.inline
    def with_URI(_URI: URI): HKT[URI, A] = js.Dynamic.global.Object.assign(js.Dynamic.literal(_URI = _URI.asInstanceOf[js.Any]), x).asInstanceOf[typings.fpTs.hktMod.HKT[URI, A]]
  }
  
}

