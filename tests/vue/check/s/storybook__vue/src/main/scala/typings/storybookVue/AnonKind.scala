package typings.storybookVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKind extends js.Object {
  var kind: String = js.native
  var story: String = js.native
}

object AnonKind {
  @scala.inline
  def apply(kind: String, story: String): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKind]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonKind) {
    @scala.inline
    def duplicate: AnonKind = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.storybookVue.AnonKind]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonKind with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.storybookVue.AnonKind with T]
    @scala.inline
    def withKind(kind: String): AnonKind = js.Dynamic.global.Object.assign(js.Dynamic.literal(kind = kind.asInstanceOf[js.Any]), x).asInstanceOf[typings.storybookVue.AnonKind]
    @scala.inline
    def withStory(story: String): AnonKind = js.Dynamic.global.Object.assign(js.Dynamic.literal(story = story.asInstanceOf[js.Any]), x).asInstanceOf[typings.storybookVue.AnonKind]
  }
  
}

