package typings.vueResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vue-resource.vuejs.HttpOptions & {  root  :string} */
@js.native
trait HttpOptionsrootstring extends js.Object {
  var before: js.UndefOr[js.Function1[/* request */ js.Any, _]] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var emulateHTTP: js.UndefOr[Boolean] = js.native
  var emulateJSON: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var method: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var progress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  var root: String = js.native
  var url: js.UndefOr[String] = js.native
}

object HttpOptionsrootstring {
  @scala.inline
  def apply(
    root: String,
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
  ): HttpOptionsrootstring = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[HttpOptionsrootstring]
  }
  @scala.inline
  implicit sealed class Sugar (x: HttpOptionsrootstring) {
    @scala.inline
    def duplicate: HttpOptionsrootstring = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HttpOptionsrootstring with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.HttpOptionsrootstring with T]
    @scala.inline
    def withRoot(root: String): HttpOptionsrootstring = js.Dynamic.global.Object.assign(js.Dynamic.literal(root = root.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    @scala.inline
    def withBefore(before: /* request */ js.Any => _): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (before != null) obj.updateDynamic("before")(js.Any.fromFunction1(before))
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withBody(body: js.Any): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (body != null) obj.updateDynamic("body")(body.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withCredentialsUndefined: HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "credentials")
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withCredentials(credentials: Boolean): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(credentials)) obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withEmulateHTTPUndefined: HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "emulateHTTP")
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withEmulateHTTP(emulateHTTP: Boolean): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(emulateHTTP)) obj.updateDynamic("emulateHTTP")(emulateHTTP.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withEmulateJSONUndefined: HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "emulateJSON")
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withEmulateJSON(emulateJSON: Boolean): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(emulateJSON)) obj.updateDynamic("emulateJSON")(emulateJSON.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withHeaders(headers: js.Any): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (headers != null) obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withMethod(method: String): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (method != null) obj.updateDynamic("method")(method.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withParams(params: js.Any): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (params != null) obj.updateDynamic("params")(params.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withProgress(progress: /* event */ js.Any => _): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (progress != null) obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
    @scala.inline
    def withUrl(url: String): HttpOptionsrootstring = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (url != null) obj.updateDynamic("url")(url.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.HttpOptionsrootstring]
    }
  }
  
}

