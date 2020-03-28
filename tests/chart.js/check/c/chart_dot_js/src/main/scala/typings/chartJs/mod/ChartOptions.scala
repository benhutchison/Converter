package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
  // Plugins can require any options
  var plugins: js.UndefOr[StringDictionary[js.Any]] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(plugins: StringDictionary[js.Any] = null, responsive: js.UndefOr[Boolean] = js.undefined): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ChartOptions) {
    @scala.inline
    def duplicate: ChartOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.chartJs.mod.ChartOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ChartOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.chartJs.mod.ChartOptions with T]
    @scala.inline
    def withPlugins(plugins: StringDictionary[js.Any]): ChartOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (plugins != null) obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.chartJs.mod.ChartOptions]
    }
    @scala.inline
    def withResponsiveUndefined: ChartOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "responsive")
      obj.asInstanceOf[typings.chartJs.mod.ChartOptions]
    }
    @scala.inline
    def withResponsive(responsive: Boolean): ChartOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(responsive)) obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.chartJs.mod.ChartOptions]
    }
  }
  
}

