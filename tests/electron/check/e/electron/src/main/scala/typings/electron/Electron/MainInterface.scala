package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainInterface extends CommonInterface {
  var app: App_ = js.native
}

object MainInterface {
  @scala.inline
  def apply(app: App_): MainInterface = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MainInterface]
  }
  @scala.inline
  implicit sealed class Sugar (x: MainInterface) {
    @scala.inline
    def duplicate: MainInterface = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.electron.Electron.MainInterface]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): MainInterface with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.MainInterface with T]
    @scala.inline
    def withApp(app: App_): MainInterface = js.Dynamic.global.Object.assign(js.Dynamic.literal(app = app.asInstanceOf[js.Any]), x).asInstanceOf[typings.electron.Electron.MainInterface]
  }
  
}

