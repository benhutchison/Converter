package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAXOptions extends js.Object {
  var lowercase: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var noscript: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var xmlns: js.UndefOr[Boolean] = js.native
}

object SAXOptions {
  @scala.inline
  def apply(
    lowercase: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    noscript: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): SAXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (!js.isUndefined(noscript)) __obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: SAXOptions) {
    @scala.inline
    def duplicate: SAXOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.SAXOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SAXOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.SAXOptions with T]
    @scala.inline
    def withLowercaseUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "lowercase")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withLowercase(lowercase: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(lowercase)) obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withNormalizeUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "normalize")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withNormalize(normalize: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(normalize)) obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withNoscriptUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noscript")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withNoscript(noscript: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noscript)) obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withPositionUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "position")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withPosition(position: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(position)) obj.updateDynamic("position")(position.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withTrimUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "trim")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withTrim(trim: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(trim)) obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withXmlnsUndefined: SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "xmlns")
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
    @scala.inline
    def withXmlns(xmlns: Boolean): SAXOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(xmlns)) obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.sax.mod.SAXOptions]
    }
  }
  
}

