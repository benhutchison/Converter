package typingsSlinky.stardustUiReactComponentRef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<PropTypes.ReactElementLike> */ js.Any = js.native
  var innerRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<React.Ref<any>> */ js.Any = js.native
}

object AnonChildren {
  @scala.inline
  def apply(
    children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<PropTypes.ReactElementLike> */ js.Any,
    innerRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<React.Ref<any>> */ js.Any
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonChildren) {
    @scala.inline
    def duplicate: AnonChildren = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.AnonChildren]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonChildren with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.AnonChildren with T]
    @scala.inline
    def withChildren(
      children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<PropTypes.ReactElementLike> */ js.Any
    ): AnonChildren = js.Dynamic.global.Object.assign(js.Dynamic.literal(children = children.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.AnonChildren]
    @scala.inline
    def withInnerRef(
      innerRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Validator<React.Ref<any>> */ js.Any
    ): AnonChildren = js.Dynamic.global.Object.assign(js.Dynamic.literal(innerRef = innerRef.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.stardustUiReactComponentRef.AnonChildren]
  }
  
}

