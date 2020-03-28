package typings.vue.vnodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeDirective extends js.Object {
  val arg: String = js.native
  val expression: js.Any = js.native
  val modifiers: StringDictionary[Boolean] = js.native
  val name: String = js.native
  val oldValue: js.Any = js.native
  val value: js.Any = js.native
}

object VNodeDirective {
  @scala.inline
  def apply(
    arg: String,
    expression: js.Any,
    modifiers: StringDictionary[Boolean],
    name: String,
    oldValue: js.Any,
    value: js.Any
  ): VNodeDirective = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VNodeDirective]
  }
  @scala.inline
  implicit sealed class Sugar (x: VNodeDirective) {
    @scala.inline
    def duplicate: VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): VNodeDirective with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.vnodeMod.VNodeDirective with T]
    @scala.inline
    def withArg(arg: String): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(arg = arg.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def withExpression(expression: js.Any): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(expression = expression.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def withModifiers(modifiers: StringDictionary[Boolean]): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def withName(name: String): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def withOldValue(oldValue: js.Any): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
    @scala.inline
    def withValue(value: js.Any): VNodeDirective = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.vue.vnodeMod.VNodeDirective]
  }
  
}

