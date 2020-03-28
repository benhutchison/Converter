package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultProps extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
  var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
}

object AnonDefaultProps {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any,
    propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): AnonDefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonDefaultProps) {
    @scala.inline
    def duplicate: AnonDefaultProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonDefaultProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonDefaultProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonDefaultProps with T]
    @scala.inline
    def withDefaultProps(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
    ): AnonDefaultProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.AnonDefaultProps]
    @scala.inline
    def withPropTypes(propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): AnonDefaultProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(propTypes = propTypes.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.AnonDefaultProps]
  }
  
}

