package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterOptions extends js.Object {
  /**
    * An optional flag indicating that the document client should cast
    * empty strings, buffers, and sets to NULL shapes
    */
  var convertEmptyValues: js.UndefOr[Boolean] = js.native
  /**
    * Whether to return numbers as a NumberValue object instead of
    * converting them to native JavaScript numbers. This allows for the
    * safe round-trip transport of numbers of arbitrary size.
    */
  var wrapNumbers: js.UndefOr[Boolean] = js.native
}

object ConverterOptions {
  @scala.inline
  def apply(
    convertEmptyValues: js.UndefOr[Boolean] = js.undefined,
    wrapNumbers: js.UndefOr[Boolean] = js.undefined
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEmptyValues)) __obj.updateDynamic("convertEmptyValues")(convertEmptyValues.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapNumbers)) __obj.updateDynamic("wrapNumbers")(wrapNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ConverterOptions) {
    @scala.inline
    def duplicate: ConverterOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ConverterOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions with T]
    @scala.inline
    def withConvertEmptyValuesUndefined: ConverterOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "convertEmptyValues")
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions]
    }
    @scala.inline
    def withConvertEmptyValues(convertEmptyValues: Boolean): ConverterOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(convertEmptyValues)) obj.updateDynamic("convertEmptyValues")(convertEmptyValues.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions]
    }
    @scala.inline
    def withWrapNumbersUndefined: ConverterOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "wrapNumbers")
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions]
    }
    @scala.inline
    def withWrapNumbers(wrapNumbers: Boolean): ConverterOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(wrapNumbers)) obj.updateDynamic("wrapNumbers")(wrapNumbers.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions]
    }
  }
  
}

