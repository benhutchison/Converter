package typings.monacoEditor

import typings.monacoEditor.monaco.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKey[T] extends js.Object {
  var key: String = js.native
  var value: Promise[T, _] = js.native
}

object AnonKey {
  @scala.inline
  def apply[T](key: String, value: Promise[T, _]): AnonKey[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: AnonKey[T]) {
    @scala.inline
    def duplicate: AnonKey[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.monacoEditor.AnonKey[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonKey[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.AnonKey[T] with T]
    @scala.inline
    def withKey(key: String): AnonKey[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(key = key.asInstanceOf[js.Any]), x).asInstanceOf[typings.monacoEditor.AnonKey[T]]
    @scala.inline
    def withValue(value: Promise[T, _]): AnonKey[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.monacoEditor.AnonKey[T]]
  }
  
}

