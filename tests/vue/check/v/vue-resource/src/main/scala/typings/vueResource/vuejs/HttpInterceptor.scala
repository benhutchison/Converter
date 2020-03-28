package typings.vueResource.vuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpInterceptor extends js.Object {
  var request: js.UndefOr[js.Function1[/* request */ HttpOptions, HttpOptions]] = js.native
  var response: js.UndefOr[js.Function1[/* response */ HttpResponse, HttpResponse]] = js.native
}

object HttpInterceptor {
  @scala.inline
  def apply(
    request: /* request */ HttpOptions => HttpOptions = null,
    response: /* response */ HttpResponse => HttpResponse = null
  ): HttpInterceptor = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1(response))
    __obj.asInstanceOf[HttpInterceptor]
  }
  @scala.inline
  implicit sealed class Sugar (x: HttpInterceptor) {
    @scala.inline
    def duplicate: HttpInterceptor = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.HttpInterceptor]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HttpInterceptor with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.HttpInterceptor with T]
    @scala.inline
    def withRequest(request: /* request */ HttpOptions => HttpOptions): HttpInterceptor = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (request != null) obj.updateDynamic("request")(js.Any.fromFunction1(request))
      obj.asInstanceOf[typings.vueResource.vuejs.HttpInterceptor]
    }
    @scala.inline
    def withResponse(response: /* response */ HttpResponse => HttpResponse): HttpInterceptor = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (response != null) obj.updateDynamic("response")(js.Any.fromFunction1(response))
      obj.asInstanceOf[typings.vueResource.vuejs.HttpInterceptor]
    }
  }
  
}

