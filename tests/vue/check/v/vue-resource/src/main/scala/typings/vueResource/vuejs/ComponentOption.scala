package typings.vueResource.vuejs

import typings.vueResource.headersHttpHeaderskeystri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOption extends js.Object {
  var http: js.UndefOr[headersHttpHeaderskeystri] = js.native
}

object ComponentOption {
  @scala.inline
  def apply(http: headersHttpHeaderskeystri = null): ComponentOption = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOption]
  }
  @scala.inline
  implicit sealed class Sugar (x: ComponentOption) {
    @scala.inline
    def duplicate: ComponentOption = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.ComponentOption]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ComponentOption with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.ComponentOption with T]
    @scala.inline
    def withHttp(http: headersHttpHeaderskeystri): ComponentOption = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (http != null) obj.updateDynamic("http")(http.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.ComponentOption]
    }
  }
  
}

