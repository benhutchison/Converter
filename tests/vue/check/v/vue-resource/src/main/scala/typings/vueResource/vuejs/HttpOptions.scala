package typings.vueResource.vuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOptions extends js.Object {
  var before: js.UndefOr[js.Function1[/* request */ js.Any, _]] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var emulateHTTP: js.UndefOr[Boolean] = js.native
  var emulateJSON: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var method: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var progress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  var url: js.UndefOr[String] = js.native
}

object HttpOptions {
  @scala.inline
  def apply(
    before: /* request */ js.Any => _ = null,
    body: js.Any = null,
    credentials: js.UndefOr[Boolean] = js.undefined,
    emulateHTTP: js.UndefOr[Boolean] = js.undefined,
    emulateJSON: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    method: String = null,
    params: js.Any = null,
    progress: /* event */ js.Any => _ = null,
    url: String = null
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateHTTP)) __obj.updateDynamic("emulateHTTP")(emulateHTTP.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateJSON)) __obj.updateDynamic("emulateJSON")(emulateJSON.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: HttpOptions) {
    @scala.inline
    def duplicate: HttpOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HttpOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.HttpOptions with T]
    @scala.inline
    def withBefore(before: /* request */ js.Any => _): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (before != null) obj.updateDynamic("before")(js.Any.fromFunction1(before))
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withBody(body: js.Any): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (body != null) obj.updateDynamic("body")(body.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withCredentialsUndefined: HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "credentials")
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withCredentials(credentials: Boolean): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(credentials)) obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withEmulateHTTPUndefined: HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "emulateHTTP")
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withEmulateHTTP(emulateHTTP: Boolean): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(emulateHTTP)) obj.updateDynamic("emulateHTTP")(emulateHTTP.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withEmulateJSONUndefined: HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "emulateJSON")
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withEmulateJSON(emulateJSON: Boolean): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(emulateJSON)) obj.updateDynamic("emulateJSON")(emulateJSON.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withHeaders(headers: js.Any): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (headers != null) obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withMethod(method: String): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (method != null) obj.updateDynamic("method")(method.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withParams(params: js.Any): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (params != null) obj.updateDynamic("params")(params.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withProgress(progress: /* event */ js.Any => _): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (progress != null) obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
    @scala.inline
    def withUrl(url: String): HttpOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (url != null) obj.updateDynamic("url")(url.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpOptions]
    }
  }
  
}

