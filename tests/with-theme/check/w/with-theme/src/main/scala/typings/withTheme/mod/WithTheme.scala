package typings.withTheme.mod

import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTheme extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var theme: String = js.native
}

object WithTheme {
  @scala.inline
  def apply(theme: String, innerRef: Ref[_] | RefObject[_] = null): WithTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTheme]
  }
  @scala.inline
  implicit sealed class Sugar (x: WithTheme) {
    @scala.inline
    def duplicate: WithTheme = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.withTheme.mod.WithTheme]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): WithTheme with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.withTheme.mod.WithTheme with T]
    @scala.inline
    def withTheme(theme: String): WithTheme = js.Dynamic.global.Object.assign(js.Dynamic.literal(theme = theme.asInstanceOf[js.Any]), x).asInstanceOf[typings.withTheme.mod.WithTheme]
    @scala.inline
    def withInnerRefRef(innerRef: Ref[_]): WithTheme = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (innerRef != null) obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.withTheme.mod.WithTheme]
    }
    @scala.inline
    def withInnerRefRefObject(innerRef: RefObject[_]): WithTheme = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (innerRef != null) obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.withTheme.mod.WithTheme]
    }
  }
  
}

