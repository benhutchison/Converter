package typings.chartJs

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.mod.ChartFontOptions
import typings.chartJs.mod.ChartOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var global: ChartOptions with ChartFontOptions = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(
    global: ChartOptions with ChartFontOptions,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonDictkey) {
    @scala.inline
    def duplicate: AnonDictkey = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.chartJs.AnonDictkey]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonDictkey with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.chartJs.AnonDictkey with T]
    @scala.inline
    def withGlobal(global: ChartOptions with ChartFontOptions): AnonDictkey = js.Dynamic.global.Object.assign(js.Dynamic.literal(global = global.asInstanceOf[js.Any]), x).asInstanceOf[typings.chartJs.AnonDictkey]
    @scala.inline
    def withStringDictionary(StringDictionary: /* key */ StringDictionary[js.Any]): AnonDictkey = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.chartJs.AnonDictkey]
    }
  }
  
}

