package typingsSlinky.reactBootstrap.bootstrapUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BSProps extends js.Object {
  var bsClass: js.Any = js.native
}

object BSProps {
  @scala.inline
  def apply(bsClass: js.Any): BSProps = {
    val __obj = js.Dynamic.literal(bsClass = bsClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BSProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: BSProps) {
    @scala.inline
    def duplicate: BSProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactBootstrap.bootstrapUtilsMod.BSProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): BSProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBootstrap.bootstrapUtilsMod.BSProps with T]
    @scala.inline
    def withBsClass(bsClass: js.Any): BSProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(bsClass = bsClass.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.reactBootstrap.bootstrapUtilsMod.BSProps]
  }
  
}

