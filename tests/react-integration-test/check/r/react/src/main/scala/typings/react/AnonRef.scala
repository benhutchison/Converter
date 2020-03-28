package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRef extends js.Object {
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
  ] = js.native
}

object AnonRef {
  @scala.inline
  def apply(ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any = null): AnonRef = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRef]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonRef) {
    @scala.inline
    def duplicate: AnonRef = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonRef]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonRef with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonRef with T]
    @scala.inline
    def withRef(ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any): AnonRef = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.AnonRef]
    }
  }
  
}

