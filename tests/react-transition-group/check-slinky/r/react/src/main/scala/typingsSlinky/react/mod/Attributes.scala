package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface SyntheticEvent<T> {
//     currentTarget: EventTarget & T;
// }
// interface AnimationEvent<T> extends SyntheticEvent<T> {
//     nativeEvent: NativeAnimationEvent;
// }
@js.native
trait Attributes extends js.Object {
  var key: js.UndefOr[Key] = js.native
}

object Attributes {
  @scala.inline
  def apply(key: Key = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit sealed class Sugar (x: Attributes) {
    @scala.inline
    def duplicate: Attributes = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.Attributes]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Attributes with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.Attributes with T]
    @scala.inline
    def withKey(key: Key): Attributes = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.Attributes]
    }
  }
  
}

