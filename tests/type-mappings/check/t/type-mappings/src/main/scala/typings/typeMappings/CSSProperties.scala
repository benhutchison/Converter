package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperties extends js.Object {
  var color: String = js.native
  var fontFamily: String = js.native
  var fontSize: String = js.native
  var fontWeight: String = js.native
  var letterSpacing: String = js.native
  var lineHeight: String = js.native
  var textTransform: String = js.native
}

object CSSProperties {
  @scala.inline
  def apply(
    color: String,
    fontFamily: String,
    fontSize: String,
    fontWeight: String,
    letterSpacing: String,
    lineHeight: String,
    textTransform: String
  ): CSSProperties = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textTransform = textTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CSSProperties]
  }
  @scala.inline
  implicit sealed class Sugar (x: CSSProperties) {
    @scala.inline
    def duplicate: CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): CSSProperties with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.CSSProperties with T]
    @scala.inline
    def withColor(color: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(color = color.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withFontFamily(fontFamily: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withFontSize(fontSize: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withFontWeight(fontWeight: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withLetterSpacing(letterSpacing: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(letterSpacing = letterSpacing.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withLineHeight(lineHeight: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
    @scala.inline
    def withTextTransform(textTransform: String): CSSProperties = js.Dynamic.global.Object.assign(js.Dynamic.literal(textTransform = textTransform.asInstanceOf[js.Any]), x).asInstanceOf[typings.typeMappings.CSSProperties]
  }
  
}

