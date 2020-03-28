package typings.node.NodeJS

import typings.std.ArrayConstrucor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var Array: ArrayConstrucor = js.native
  var global: Global = js.native
}

object Global {
  @scala.inline
  def apply(Array: ArrayConstrucor, global: Global): Global = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit sealed class Sugar (x: Global) {
    @scala.inline
    def duplicate: Global = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.NodeJS.Global]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Global with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.NodeJS.Global with T]
    @scala.inline
    def withArray(Array: ArrayConstrucor): Global = js.Dynamic.global.Object.assign(js.Dynamic.literal(Array = Array.asInstanceOf[js.Any]), x).asInstanceOf[typings.node.NodeJS.Global]
    @scala.inline
    def withGlobal(global: Global): Global = js.Dynamic.global.Object.assign(js.Dynamic.literal(global = global.asInstanceOf[js.Any]), x).asInstanceOf[typings.node.NodeJS.Global]
  }
  
}

