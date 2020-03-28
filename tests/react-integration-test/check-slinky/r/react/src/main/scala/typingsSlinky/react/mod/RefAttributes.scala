package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefAttributes[T] extends Attributes {
  var ref: js.UndefOr[Ref[T]] = js.native
}

object RefAttributes {
  @scala.inline
  def apply[T](key: Key = null, ref: Ref[T] = null): RefAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: RefAttributes[T]) {
    @scala.inline
    def duplicate: RefAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.RefAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): RefAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.RefAttributes[T] with T]
    @scala.inline
    def withKey(key: Key): RefAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.RefAttributes[T]]
    }
    @scala.inline
    def withRef(ref: Ref[T]): RefAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.RefAttributes[T]]
    }
  }
  
}

