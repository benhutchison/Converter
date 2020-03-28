package typingsJapgolly.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiTheme extends js.Object {
  var spacing: js.UndefOr[js.Any] = js.native
}

object MuiTheme {
  @scala.inline
  def apply(spacing: js.Any = null): MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiTheme]
  }
  @scala.inline
  implicit sealed class Sugar (x: MuiTheme) {
    @scala.inline
    def duplicate: MuiTheme = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): MuiTheme with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme with T]
    @scala.inline
    def withSpacing(spacing: js.Any): MuiTheme = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (spacing != null) obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme]
    }
  }
  
}

