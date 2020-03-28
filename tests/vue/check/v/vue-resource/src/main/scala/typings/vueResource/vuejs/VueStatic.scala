package typings.vueResource.vuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueStatic extends js.Object {
  var http: Http_ = js.native
  var resource: Resource_ = js.native
}

object VueStatic {
  @scala.inline
  def apply(http: Http_, resource: Resource_): VueStatic = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VueStatic]
  }
  @scala.inline
  implicit sealed class Sugar (x: VueStatic) {
    @scala.inline
    def duplicate: VueStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.VueStatic]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VueStatic with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.VueStatic with T]
    @scala.inline
    def withHttp(http: Http_): VueStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(http = http.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.VueStatic]
    @scala.inline
    def withResource(resource: Resource_): VueStatic = js.Dynamic.global.Object.assign(js.Dynamic.literal(resource = resource.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.VueStatic]
  }
  
}

