package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends typings.expressServeStaticCore.mod._Global_.Express.Response {
  def location(url: String): Response = js.native
}

object Response {
  @scala.inline
  def apply(location: String => Response): Response = {
    val __obj = js.Dynamic.literal(location = js.Any.fromFunction1(location))
  
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit sealed class Sugar (x: Response) {
    @scala.inline
    def duplicate: Response = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.expressServeStaticCore.mod.Response]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Response with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Response with T]
    @scala.inline
    def withLocation(location: String => Response): Response = js.Dynamic.global.Object.assign(js.Dynamic.literal(location = js.Any.fromFunction1(location)), x).asInstanceOf[typings.expressServeStaticCore.mod.Response]
  }
  
}

