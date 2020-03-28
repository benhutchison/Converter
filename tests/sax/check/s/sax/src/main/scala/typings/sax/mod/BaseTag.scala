package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTag extends js.Object {
  var isSelfClosing: Boolean = js.native
  var name: String = js.native
}

object BaseTag {
  @scala.inline
  def apply(isSelfClosing: Boolean, name: String): BaseTag = {
    val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseTag]
  }
  @scala.inline
  implicit sealed class Sugar (x: BaseTag) {
    @scala.inline
    def duplicate: BaseTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.BaseTag]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): BaseTag with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.BaseTag with T]
    @scala.inline
    def withIsSelfClosing(isSelfClosing: Boolean): BaseTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.BaseTag]
    @scala.inline
    def withName(name: String): BaseTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.BaseTag]
  }
  
}

