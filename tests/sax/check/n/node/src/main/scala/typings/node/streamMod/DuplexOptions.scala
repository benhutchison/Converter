package typings.node.streamMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplexOptions
  extends ReadableOptions
     with WritableOptions {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    destroy: /* error */ js.UndefOr[Error] => _ = null,
    encoding: String = null,
    `final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[Double], _] = null
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplexOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: DuplexOptions) {
    @scala.inline
    def duplicate: DuplexOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.streamMod.DuplexOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DuplexOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.DuplexOptions with T]
    @scala.inline
    def withAllowHalfOpenUndefined: DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "allowHalfOpen")
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withAllowHalfOpen(allowHalfOpen: Boolean): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(allowHalfOpen)) obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withDestroy(destroy: /* error */ js.UndefOr[Error] => _): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (destroy != null) obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withEncoding(encoding: String): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (encoding != null) obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withFinal(`final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`final` != null) obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withHighWaterMarkInt(highWaterMark: Int): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (highWaterMark != null) obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withHighWaterMarkDouble(highWaterMark: Double): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (highWaterMark != null) obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withObjectModeUndefined: DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "objectMode")
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withObjectMode(objectMode: Boolean): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(objectMode)) obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
    @scala.inline
    def withRead(read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[Double], _]): DuplexOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (read != null) obj.updateDynamic("read")(read.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.DuplexOptions]
    }
  }
  
}

