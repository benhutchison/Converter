package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<type-mappings.TypographyStyle> */
@js.native
trait TypographyStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var letterSpacing: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String] = js.native
  var textTransform: js.UndefOr[String] = js.native
}

object TypographyStyleOptions {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null,
    letterSpacing: String = null,
    lineHeight: String = null,
    textTransform: String = null
  ): TypographyStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyleOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: TypographyStyleOptions) {
    @scala.inline
    def duplicate: TypographyStyleOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TypographyStyleOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.TypographyStyleOptions with T]
    @scala.inline
    def withColor(color: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withFontFamily(fontFamily: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontFamily != null) obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withFontSize(fontSize: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontSize != null) obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withFontWeight(fontWeight: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontWeight != null) obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withLetterSpacing(letterSpacing: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (letterSpacing != null) obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withLineHeight(lineHeight: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lineHeight != null) obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
    @scala.inline
    def withTextTransform(textTransform: String): TypographyStyleOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textTransform != null) obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.typeMappings.TypographyStyleOptions]
    }
  }
  
}

