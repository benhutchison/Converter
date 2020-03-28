package typingsSlinky.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPropTypes extends js.Object {
  var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
}

object AnonPropTypes {
  @scala.inline
  def apply(propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): AnonPropTypes = {
    val __obj = js.Dynamic.literal(propTypes = propTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPropTypes]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonPropTypes) {
    @scala.inline
    def duplicate: AnonPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.AnonPropTypes]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonPropTypes with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.AnonPropTypes with T]
    @scala.inline
    def withPropTypes(propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): AnonPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(propTypes = propTypes.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.AnonPropTypes]
  }
  
}

