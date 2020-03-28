package typings.awsSdk.configMod

import typings.awsSdk.awsSdkStrings.latest
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIVersions extends js.Object {
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest | String] = js.native
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.native
}

object APIVersions {
  @scala.inline
  def apply(apiVersion: latest | String = null, apiVersions: ConfigurationServiceApiVersions = null): APIVersions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIVersions]
  }
  @scala.inline
  implicit sealed class Sugar (x: APIVersions) {
    @scala.inline
    def duplicate: APIVersions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.awsSdk.configMod.APIVersions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): APIVersions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdk.configMod.APIVersions with T]
    @scala.inline
    def withApiVersionLatest(apiVersion: latest): APIVersions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (apiVersion != null) obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.configMod.APIVersions]
    }
    @scala.inline
    def withApiVersionString(apiVersion: String): APIVersions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (apiVersion != null) obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.configMod.APIVersions]
    }
    @scala.inline
    def withApiVersions(apiVersions: ConfigurationServiceApiVersions): APIVersions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (apiVersions != null) obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.configMod.APIVersions]
    }
  }
  
}

