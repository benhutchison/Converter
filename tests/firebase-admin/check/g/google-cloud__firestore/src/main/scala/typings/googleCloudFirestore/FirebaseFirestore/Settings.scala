package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var projectId: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(projectId: String = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit sealed class Sugar (x: Settings) {
    @scala.inline
    def duplicate: Settings = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Settings]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Settings with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Settings with T]
    @scala.inline
    def withProjectId(projectId: String): Settings = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (projectId != null) obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Settings]
    }
  }
  
}

