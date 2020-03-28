package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined type-mappings.Omit<type-mappings.CSSProperties, 'color'> */
@js.native
trait Excluded extends js.Object {
  var fontFamily: String = js.native
  var fontSize: String = js.native
  var fontWeight: String = js.native
  var letterSpacing: String = js.native
  var lineHeight: String = js.native
  var textTransform: String = js.native
}

object Excluded {
  @scala.inline
  def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: String,
    letterSpacing: String,
    lineHeight: String,
    textTransform: String
  ): Excluded = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textTransform = textTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Excluded]
  }
  @scala.inline
  implicit sealed class Sugar (x: Excluded) {
    @scala.inline
    def duplicate: Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Excluded with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.Excluded with T]
    @scala.inline
    def withFontFamily(fontFamily: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def withFontSize(fontSize: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def withFontWeight(fontWeight: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def withLetterSpacing(letterSpacing: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(letterSpacing = letterSpacing.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def withLineHeight(lineHeight: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
    @scala.inline
    def withTextTransform(textTransform: String): Excluded = js.Dynamic.global.Object.assign(js.Dynamic.literal(textTransform = textTransform.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.Excluded]
  }
  
}

