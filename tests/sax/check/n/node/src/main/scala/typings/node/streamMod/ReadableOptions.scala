package typings.node.streamMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableOptions extends js.Object {
  var destroy: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], _]] = js.native
  var encoding: js.UndefOr[String] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[Double], _]] = js.native
}

object ReadableOptions {
  @scala.inline
  def apply(
    destroy: /* error */ js.UndefOr[Error] => _ = null,
    encoding: String = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[Double], _] = null
  ): ReadableOptions = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReadableOptions) {
    @scala.inline
    def duplicate: ReadableOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.streamMod.ReadableOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReadableOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.ReadableOptions with T]
    @scala.inline
    def withDestroy(destroy: /* error */ js.UndefOr[Error] => _): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (destroy != null) obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withEncoding(encoding: String): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (encoding != null) obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withHighWaterMarkInt(highWaterMark: Int): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (highWaterMark != null) obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withHighWaterMarkDouble(highWaterMark: Double): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (highWaterMark != null) obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withObjectModeUndefined: ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "objectMode")
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withObjectMode(objectMode: Boolean): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(objectMode)) obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
    @scala.inline
    def withRead(read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[Double], _]): ReadableOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (read != null) obj.updateDynamic("read")(read.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.streamMod.ReadableOptions]
    }
  }
  
}

