package typings.vueResource.vuejs

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpResponse extends js.Object {
  var data: js.Object = js.native
  var headers: js.Function = js.native
  var ok: Boolean = js.native
  var status: Double = js.native
  var statusText: String = js.native
  def blob(): Blob = js.native
  def json(): js.Any = js.native
  def text(): String = js.native
}

object HttpResponse {
  @scala.inline
  def apply(
    blob: () => Blob,
    data: js.Object,
    headers: js.Function,
    json: () => js.Any,
    ok: Boolean,
    status: Double,
    statusText: String,
    text: () => String
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(blob = js.Any.fromFunction0(blob), data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[HttpResponse]
  }
  @scala.inline
  implicit sealed class Sugar (x: HttpResponse) {
    @scala.inline
    def duplicate: HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HttpResponse with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.HttpResponse with T]
    @scala.inline
    def withBlob(blob: () => Blob): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(blob = js.Any.fromFunction0(blob)), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withData(data: js.Object): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(data = data.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withHeaders(headers: js.Function): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(headers = headers.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withJson(json: () => js.Any): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(json = js.Any.fromFunction0(json)), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withOk(ok: Boolean): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(ok = ok.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withStatus(status: Double): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(status = status.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withStatusText(statusText: String): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(statusText = statusText.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
    @scala.inline
    def withText(text: () => String): HttpResponse = js.Dynamic.global.Object.assign(js.Dynamic.literal(text = js.Any.fromFunction0(text)), x).asInstanceOf[typings.vueResource.vuejs.HttpResponse]
  }
  
}

