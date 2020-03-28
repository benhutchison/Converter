package typings.fpTs.constMod.fpTsLibHKTAugmentingMod

import typings.fpTs.constMod.Const
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URI2HKT2[L, A] extends js.Object {
  var Const: typings.fpTs.constMod.Const[L, A] = js.native
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Const: Const[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(Const = Const.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
  @scala.inline
  implicit sealed class Sugar[L, A] (x: URI2HKT2[L, A]) {
    @scala.inline
    def duplicate: URI2HKT2[L, A] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.fpTs.constMod.fpTsLibHKTAugmentingMod.URI2HKT2[L, A]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (URI2HKT2[L, A]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.fpTs.constMod.fpTsLibHKTAugmentingMod.URI2HKT2[L, A] with T]
    @scala.inline
    def withConst(Const: Const[L, A]): URI2HKT2[L, A] = js.Dynamic.global.Object.assign(js.Dynamic.literal(Const = Const.asInstanceOf[js.Any]), x).asInstanceOf[typings.fpTs.constMod.fpTsLibHKTAugmentingMod.URI2HKT2[L, A]]
  }
  
}

