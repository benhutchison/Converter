package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFontOptions extends js.Object {
  var foo: Boolean = js.native
}

object ChartFontOptions {
  @scala.inline
  def apply(foo: Boolean): ChartFontOptions = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartFontOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ChartFontOptions) {
    @scala.inline
    def duplicate: ChartFontOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.chartJs.mod.ChartFontOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ChartFontOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.chartJs.mod.ChartFontOptions with T]
    @scala.inline
    def withFoo(foo: Boolean): ChartFontOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(foo = foo.asInstanceOf[js.Any]), x).asInstanceOf[typings.chartJs.mod.ChartFontOptions]
  }
  
}

