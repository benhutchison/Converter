package typings.webpackEnv.WebpackModuleApi

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
  @scala.inline
  implicit sealed class Sugar (x: NodeProcess) {
    @scala.inline
    def duplicate: NodeProcess = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.webpackEnv.WebpackModuleApi.NodeProcess]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): NodeProcess with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.webpackEnv.WebpackModuleApi.NodeProcess with T]
    @scala.inline
    def withEnv(env: js.Any): NodeProcess = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (env != null) obj.updateDynamic("env")(env.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.webpackEnv.WebpackModuleApi.NodeProcess]
    }
  }
  
}

