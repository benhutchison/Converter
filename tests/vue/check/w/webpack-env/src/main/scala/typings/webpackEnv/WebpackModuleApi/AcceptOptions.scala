package typings.webpackEnv.WebpackModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: js.UndefOr[Boolean] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(
    autoApply: js.UndefOr[Boolean] = js.undefined,
    ignoreUnaccepted: js.UndefOr[Boolean] = js.undefined
  ): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnaccepted)) __obj.updateDynamic("ignoreUnaccepted")(ignoreUnaccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: AcceptOptions) {
    @scala.inline
    def duplicate: AcceptOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AcceptOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions with T]
    @scala.inline
    def withAutoApplyUndefined: AcceptOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "autoApply")
      obj.asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions]
    }
    @scala.inline
    def withAutoApply(autoApply: Boolean): AcceptOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(autoApply)) obj.updateDynamic("autoApply")(autoApply.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions]
    }
    @scala.inline
    def withIgnoreUnacceptedUndefined: AcceptOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "ignoreUnaccepted")
      obj.asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions]
    }
    @scala.inline
    def withIgnoreUnaccepted(ignoreUnaccepted: Boolean): AcceptOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(ignoreUnaccepted)) obj.updateDynamic("ignoreUnaccepted")(ignoreUnaccepted.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.webpackEnv.WebpackModuleApi.AcceptOptions]
    }
  }
  
}

