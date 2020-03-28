package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassAttributes[T] extends Attributes {
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}

object ClassAttributes {
  @scala.inline
  def apply[T](key: Key = null, ref: LegacyRef[T] = null): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: ClassAttributes[T]) {
    @scala.inline
    def duplicate: ClassAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.ClassAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ClassAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.ClassAttributes[T] with T]
    @scala.inline
    def withKey(key: Key): ClassAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ClassAttributes[T]]
    }
    @scala.inline
    def withRef(ref: LegacyRef[T]): ClassAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ClassAttributes[T]]
    }
  }
  
}

