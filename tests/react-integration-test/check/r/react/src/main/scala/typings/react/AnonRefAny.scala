package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefAny extends js.Object {
  var ref: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<R, string> */ js.Any
  ] = js.native
}

object AnonRefAny {
  @scala.inline
  def apply(
    ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<R, string> */ js.Any = null
  ): AnonRefAny = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefAny]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonRefAny) {
    @scala.inline
    def duplicate: AnonRefAny = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonRefAny]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonRefAny with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonRefAny with T]
    @scala.inline
    def withRef(
      ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<R, string> */ js.Any
    ): AnonRefAny = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.AnonRefAny]
    }
  }
  
}

