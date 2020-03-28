package typings.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializable extends js.Object {
  def getSerializerType(): String = js.native
}

object ISerializable {
  @scala.inline
  def apply(getSerializerType: () => String): ISerializable = {
    val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
  
    __obj.asInstanceOf[ISerializable]
  }
  @scala.inline
  implicit sealed class Sugar (x: ISerializable) {
    @scala.inline
    def duplicate: ISerializable = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.swiz.mod.ISerializable]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ISerializable with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.swiz.mod.ISerializable with T]
    @scala.inline
    def withGetSerializerType(getSerializerType: () => String): ISerializable = js.Dynamic.global.Object.assign(js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType)), x).asInstanceOf[typings.swiz.mod.ISerializable]
  }
  
}

