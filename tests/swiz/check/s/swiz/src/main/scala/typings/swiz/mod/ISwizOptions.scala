package typings.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwizOptions extends js.Object {
  var `for`: js.UndefOr[String] = js.native
  var stripNulls: js.UndefOr[Boolean] = js.native
  var stripSerializerType: js.UndefOr[Boolean] = js.native
}

object ISwizOptions {
  @scala.inline
  def apply(
    `for`: String = null,
    stripNulls: js.UndefOr[Boolean] = js.undefined,
    stripSerializerType: js.UndefOr[Boolean] = js.undefined
  ): ISwizOptions = {
    val __obj = js.Dynamic.literal()
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (!js.isUndefined(stripNulls)) __obj.updateDynamic("stripNulls")(stripNulls.asInstanceOf[js.Any])
    if (!js.isUndefined(stripSerializerType)) __obj.updateDynamic("stripSerializerType")(stripSerializerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwizOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ISwizOptions) {
    @scala.inline
    def duplicate: ISwizOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.swiz.mod.ISwizOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ISwizOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.swiz.mod.ISwizOptions with T]
    @scala.inline
    def withFor(`for`: String): ISwizOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`for` != null) obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.swiz.mod.ISwizOptions]
    }
    @scala.inline
    def withStripNullsUndefined: ISwizOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "stripNulls")
      obj.asInstanceOf[typings.swiz.mod.ISwizOptions]
    }
    @scala.inline
    def withStripNulls(stripNulls: Boolean): ISwizOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(stripNulls)) obj.updateDynamic("stripNulls")(stripNulls.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.swiz.mod.ISwizOptions]
    }
    @scala.inline
    def withStripSerializerTypeUndefined: ISwizOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "stripSerializerType")
      obj.asInstanceOf[typings.swiz.mod.ISwizOptions]
    }
    @scala.inline
    def withStripSerializerType(stripSerializerType: Boolean): ISwizOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(stripSerializerType)) obj.updateDynamic("stripSerializerType")(stripSerializerType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.swiz.mod.ISwizOptions]
    }
  }
  
}

