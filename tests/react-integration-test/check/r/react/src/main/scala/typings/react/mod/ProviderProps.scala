package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Context via RenderProps
@js.native
trait ProviderProps[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var value: T = js.native
}

object ProviderProps {
  @scala.inline
  def apply[T](value: T, children: ReactNode = null): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ProviderProps[T]) {
    @scala.inline
    def duplicate: ProviderProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ProviderProps[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ProviderProps[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ProviderProps[T] with T]
    @scala.inline
    def withValue(value: T): ProviderProps[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ProviderProps[T]]
    @scala.inline
    def withChildren(children: ReactNode): ProviderProps[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ProviderProps[T]]
    }
  }
  
}

