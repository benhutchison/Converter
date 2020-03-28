package typingsSlinky.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}

object Anon0 {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ): Anon0 = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit sealed class Sugar (x: Anon0) {
    @scala.inline
    def duplicate: Anon0 = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.Anon0]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Anon0 with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.Anon0 with T]
    @scala.inline
    def withDefaultProps(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
    ): Anon0 = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.Anon0]
  }
  
}

