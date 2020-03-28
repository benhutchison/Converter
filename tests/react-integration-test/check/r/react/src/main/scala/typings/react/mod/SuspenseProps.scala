package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspenseProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonNullable<ReactNode> */ js.Any) | Null = js.native
}

object SuspenseProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    fallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonNullable<ReactNode> */ js.Any = null
  ): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: SuspenseProps) {
    @scala.inline
    def duplicate: SuspenseProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.SuspenseProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SuspenseProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.SuspenseProps with T]
    @scala.inline
    def withChildren(children: ReactNode): SuspenseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SuspenseProps]
    }
    @scala.inline
    def withFallback(
      fallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonNullable<ReactNode> */ js.Any
    ): SuspenseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fallback != null) obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SuspenseProps]
    }
  }
  
}

