package typings.react

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonType[T /* <: ComponentType[_] */] extends js.Object {
  val `type`: T = js.native
}

object AnonType {
  @scala.inline
  def apply[T /* <: ComponentType[_] */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T <: ComponentType[_]] (x: AnonType[T]) {
    @scala.inline
    def duplicate: AnonType[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.AnonType[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonType[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.AnonType[T] with T]
    @scala.inline
    def withType(`type`: T): AnonType[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.AnonType[T]]
    }
  }
  
}

