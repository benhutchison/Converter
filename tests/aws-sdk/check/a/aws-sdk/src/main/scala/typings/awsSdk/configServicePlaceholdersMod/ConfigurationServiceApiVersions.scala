package typings.awsSdk.configServicePlaceholdersMod

import typings.awsSdk.dynamodbMod.apiVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationServiceApiVersions extends js.Object {
  var dynamodb: js.UndefOr[apiVersion] = js.native
}

object ConfigurationServiceApiVersions {
  @scala.inline
  def apply(dynamodb: apiVersion = null): ConfigurationServiceApiVersions = {
    val __obj = js.Dynamic.literal()
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationServiceApiVersions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ConfigurationServiceApiVersions) {
    @scala.inline
    def duplicate: ConfigurationServiceApiVersions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ConfigurationServiceApiVersions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions with T]
    @scala.inline
    def withDynamodb(dynamodb: apiVersion): ConfigurationServiceApiVersions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dynamodb != null) obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions]
    }
  }
  
}

