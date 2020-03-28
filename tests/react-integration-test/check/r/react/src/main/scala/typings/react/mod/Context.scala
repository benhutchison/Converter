package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  var Consumer: typings.react.mod.Consumer[T] = js.native
  var Provider: typings.react.mod.Provider[T] = js.native
  var displayName: js.UndefOr[String] = js.native
}

object Context {
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T], displayName: String = null): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: Context[T]) {
    @scala.inline
    def duplicate: Context[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.Context[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Context[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.Context[T] with T]
    @scala.inline
    def withConsumer(Consumer: Consumer[T]): Context[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.Context[T]]
    @scala.inline
    def withProvider(Provider: Provider[T]): Context[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.Context[T]]
    @scala.inline
    def withDisplayName(displayName: String): Context[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (displayName != null) obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.Context[T]]
    }
  }
  
}

