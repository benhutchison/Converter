package typings.vue.vueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConfiguration extends js.Object {
  var devtools: Boolean = js.native
  var ignoredElements: js.Array[String | RegExp] = js.native
  var keyCodes: StringDictionary[Double | js.Array[Double]] = js.native
  var optionMergeStrategies: js.Any = js.native
  var performance: Boolean = js.native
  var productionTip: Boolean = js.native
  var silent: Boolean = js.native
  def errorHandler(err: Error, vm: Vue, info: String): Unit = js.native
  def warnHandler(msg: String, vm: Vue, trace: String): Unit = js.native
}

object VueConfiguration {
  @scala.inline
  def apply(
    devtools: Boolean,
    errorHandler: (Error, Vue, String) => Unit,
    ignoredElements: js.Array[String | RegExp],
    keyCodes: StringDictionary[Double | js.Array[Double]],
    optionMergeStrategies: js.Any,
    performance: Boolean,
    productionTip: Boolean,
    silent: Boolean,
    warnHandler: (String, Vue, String) => Unit
  ): VueConfiguration = {
    val __obj = js.Dynamic.literal(devtools = devtools.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction3(errorHandler), ignoredElements = ignoredElements.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], productionTip = productionTip.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], warnHandler = js.Any.fromFunction3(warnHandler))
  
    __obj.asInstanceOf[VueConfiguration]
  }
}

