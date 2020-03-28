package typings.vueResource.vuejs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHeaders
  extends /* key */ StringDictionary[js.Any] {
  var common: js.UndefOr[StringDictionary[String]] = js.native
  var custom: js.UndefOr[StringDictionary[String]] = js.native
  var delete: js.UndefOr[StringDictionary[String]] = js.native
  var patch: js.UndefOr[StringDictionary[String]] = js.native
  var post: js.UndefOr[StringDictionary[String]] = js.native
  var put: js.UndefOr[StringDictionary[String]] = js.native
}

object HttpHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    common: StringDictionary[String] = null,
    custom: StringDictionary[String] = null,
    delete: StringDictionary[String] = null,
    patch: StringDictionary[String] = null,
    post: StringDictionary[String] = null,
    put: StringDictionary[String] = null
  ): HttpHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeaders]
  }
  @scala.inline
  implicit sealed class Sugar (x: HttpHeaders) {
    @scala.inline
    def duplicate: HttpHeaders = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HttpHeaders with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.HttpHeaders with T]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withCommon(common: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (common != null) obj.updateDynamic("common")(common.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withCustom(custom: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (custom != null) obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withDelete(delete: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (delete != null) obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withPatch(patch: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (patch != null) obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withPost(post: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (post != null) obj.updateDynamic("post")(post.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
    @scala.inline
    def withPut(put: StringDictionary[String]): HttpHeaders = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (put != null) obj.updateDynamic("put")(put.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vueResource.vuejs.HttpHeaders]
    }
  }
  
}

