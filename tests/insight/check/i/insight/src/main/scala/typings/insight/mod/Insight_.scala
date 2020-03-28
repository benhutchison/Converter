package typings.insight.mod

import typings.insight.mod.insight.IConfigstore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insight_ extends js.Object {
  var clientId: String = js.native
  var config: IConfigstore = js.native
  var optOut: Boolean = js.native
  def track(args: String*): Unit = js.native
}

object Insight_ {
  @scala.inline
  def apply(clientId: String, config: IConfigstore, optOut: Boolean, track: /* repeated */ String => Unit): Insight_ = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], track = js.Any.fromFunction1(track))
  
    __obj.asInstanceOf[Insight_]
  }
  @scala.inline
  implicit sealed class Sugar (x: Insight_) {
    @scala.inline
    def duplicate: Insight_ = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.insight.mod.Insight_]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Insight_ with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.insight.mod.Insight_ with T]
    @scala.inline
    def withClientId(clientId: String): Insight_ = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.Insight_]
    @scala.inline
    def withConfig(config: IConfigstore): Insight_ = js.Dynamic.global.Object.assign(js.Dynamic.literal(config = config.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.Insight_]
    @scala.inline
    def withOptOut(optOut: Boolean): Insight_ = js.Dynamic.global.Object.assign(js.Dynamic.literal(optOut = optOut.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.Insight_]
    @scala.inline
    def withTrack(track: /* repeated */ String => Unit): Insight_ = js.Dynamic.global.Object.assign(js.Dynamic.literal(track = js.Any.fromFunction1(track)), x).asInstanceOf[typings.insight.mod.Insight_]
  }
  
}

