package typings.node.streamMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableOptions extends js.Object {
  var `final`: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit], Unit]
  ] = js.native
}

object WritableOptions {
  @scala.inline
  def apply(`final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit = null): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (`final` != null) __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    __obj.asInstanceOf[WritableOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: WritableOptions) {
    @scala.inline
    def duplicate: WritableOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.streamMod.WritableOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): WritableOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.WritableOptions with T]
    @scala.inline
    def withFinal(`final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit): WritableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`final` != null) obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      obj.asInstanceOf[typings.node.streamMod.WritableOptions]
    }
  }
  
}

