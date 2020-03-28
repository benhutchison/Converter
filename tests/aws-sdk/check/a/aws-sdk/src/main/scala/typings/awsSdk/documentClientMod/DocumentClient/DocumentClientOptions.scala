package typings.awsSdk.documentClientMod.DocumentClient

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.dynamodbMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClientOptions extends ConverterOptions {
  /**
    * An optional map of parameters to bind to every request sent by this service object.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
    */
  var service: js.UndefOr[^] = js.native
}

object DocumentClientOptions {
  @scala.inline
  def apply(
    convertEmptyValues: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[js.Any] = null,
    service: ^ = null,
    wrapNumbers: js.UndefOr[Boolean] = js.undefined
  ): DocumentClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEmptyValues)) __obj.updateDynamic("convertEmptyValues")(convertEmptyValues.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapNumbers)) __obj.updateDynamic("wrapNumbers")(wrapNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClientOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: DocumentClientOptions) {
    @scala.inline
    def duplicate: DocumentClientOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DocumentClientOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions with T]
    @scala.inline
    def withConvertEmptyValuesUndefined: DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "convertEmptyValues")
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
    @scala.inline
    def withConvertEmptyValues(convertEmptyValues: Boolean): DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(convertEmptyValues)) obj.updateDynamic("convertEmptyValues")(convertEmptyValues.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
    @scala.inline
    def withParams(params: StringDictionary[js.Any]): DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (params != null) obj.updateDynamic("params")(params.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
    @scala.inline
    def withService(service: ^): DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (service != null) obj.updateDynamic("service")(service.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
    @scala.inline
    def withWrapNumbersUndefined: DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "wrapNumbers")
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
    @scala.inline
    def withWrapNumbers(wrapNumbers: Boolean): DocumentClientOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(wrapNumbers)) obj.updateDynamic("wrapNumbers")(wrapNumbers.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions]
    }
  }
  
}

