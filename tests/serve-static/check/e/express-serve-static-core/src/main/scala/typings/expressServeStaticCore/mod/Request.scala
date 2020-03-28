package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typings.expressServeStaticCore.mod._Global_.Express.Request {
  var url: String = js.native
}

object Request {
  @scala.inline
  def apply(url: String): Request = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit sealed class Sugar (x: Request) {
    @scala.inline
    def duplicate: Request = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.expressServeStaticCore.mod.Request]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Request with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Request with T]
    @scala.inline
    def withUrl(url: String): Request = js.Dynamic.global.Object.assign(js.Dynamic.literal(url = url.asInstanceOf[js.Any]), x).asInstanceOf[typings.expressServeStaticCore.mod.Request]
  }
  
}

