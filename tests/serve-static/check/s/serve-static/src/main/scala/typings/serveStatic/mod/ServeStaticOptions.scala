package typings.serveStatic.mod

import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeStaticOptions extends js.Object {
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.native
}

object ServeStaticOptions {
  @scala.inline
  def apply(setHeaders: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _ = null): ServeStaticOptions = {
    val __obj = js.Dynamic.literal()
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
    __obj.asInstanceOf[ServeStaticOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ServeStaticOptions) {
    @scala.inline
    def duplicate: ServeStaticOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.serveStatic.mod.ServeStaticOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ServeStaticOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.serveStatic.mod.ServeStaticOptions with T]
    @scala.inline
    def withSetHeaders(setHeaders: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _): ServeStaticOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (setHeaders != null) obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
      obj.asInstanceOf[typings.serveStatic.mod.ServeStaticOptions]
    }
  }
  
}

