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
  @scala.inline
  implicit sealed class Sugar (x: VueConfiguration) {
    @scala.inline
    def duplicate: VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VueConfiguration with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.vueMod.VueConfiguration with T]
    @scala.inline
    def withDevtools(devtools: Boolean): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(devtools = devtools.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withErrorHandler(errorHandler: (Error, Vue, String) => Unit): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(errorHandler = js.Any.fromFunction3(errorHandler)), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withIgnoredElements(ignoredElements: js.Array[String | RegExp]): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(ignoredElements = ignoredElements.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withKeyCodes(keyCodes: StringDictionary[Double | js.Array[Double]]): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(keyCodes = keyCodes.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withOptionMergeStrategies(optionMergeStrategies: js.Any): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withPerformance(performance: Boolean): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(performance = performance.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withProductionTip(productionTip: Boolean): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(productionTip = productionTip.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withSilent(silent: Boolean): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(silent = silent.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
    @scala.inline
    def withWarnHandler(warnHandler: (String, Vue, String) => Unit): VueConfiguration = js.Dynamic.global.Object.assign(js.Dynamic.literal(warnHandler = js.Any.fromFunction3(warnHandler)), x).asInstanceOf[typings.vue.vueMod.VueConfiguration]
  }
  
}

