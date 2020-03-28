package typings.typeMappings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSet extends js.Object {
  def get(): String = js.native
  def set(v: String): Unit = js.native
}

object AnonSet {
  @scala.inline
  def apply(get: () => String, set: String => Unit): AnonSet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[AnonSet]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonSet) {
    @scala.inline
    def duplicate: AnonSet = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.typeMappings.AnonSet]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonSet with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.typeMappings.AnonSet with T]
    @scala.inline
    def withGet(get: () => String): AnonSet = js.Dynamic.global.Object.assign(js.Dynamic.literal(get = js.Any.fromFunction0(get)), x).asInstanceOf[typings.typeMappings.AnonSet]
    @scala.inline
    def withSet(set: String => Unit): AnonSet = js.Dynamic.global.Object.assign(js.Dynamic.literal(set = js.Any.fromFunction1(set)), x).asInstanceOf[typings.typeMappings.AnonSet]
  }
  
}

