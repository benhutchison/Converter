package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  var labels: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
}

object ChartData {
  @scala.inline
  def apply(labels: js.Array[String | js.Array[String]] = null): ChartData = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit sealed class Sugar (x: ChartData) {
    @scala.inline
    def duplicate: ChartData = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.chartJs.mod.ChartData]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ChartData with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.chartJs.mod.ChartData with T]
    @scala.inline
    def withLabels(labels: js.Array[String | js.Array[String]]): ChartData = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (labels != null) obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.chartJs.mod.ChartData]
    }
  }
  
}

