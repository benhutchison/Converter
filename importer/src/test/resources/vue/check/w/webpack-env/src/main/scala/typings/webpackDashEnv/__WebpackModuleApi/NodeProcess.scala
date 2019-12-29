package typings.webpackDashEnv.__WebpackModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inside env you can pass any variable
  */
@js.native
trait NodeProcess extends js.Object {
  var env: js.UndefOr[js.Any] = js.native
}

object NodeProcess {
  @scala.inline
  def apply(env: js.Any = null): NodeProcess = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProcess]
  }
}

