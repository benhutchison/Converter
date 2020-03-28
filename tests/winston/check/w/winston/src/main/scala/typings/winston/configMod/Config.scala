package typings.winston.configMod

import typings.winston.winstonStrings.bar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var foo: bar = js.native
}

object Config {
  @scala.inline
  def apply(foo: bar): Config = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit sealed class Sugar (x: Config) {
    @scala.inline
    def duplicate: Config = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.winston.configMod.Config]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Config with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.winston.configMod.Config with T]
    @scala.inline
    def withFoo(foo: bar): Config = js.Dynamic.global.Object.assign(js.Dynamic.literal(foo = foo.asInstanceOf[js.Any]), x).asInstanceOf[typings.winston.configMod.Config]
  }
  
}

