package typings.storybookVue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryStore extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var kind: String = js.native
  var stories: js.Array[StoryObject] = js.native
}

object StoryStore {
  @scala.inline
  def apply(kind: String, stories: js.Array[StoryObject], fileName: String = null): StoryStore = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryStore]
  }
  @scala.inline
  implicit sealed class Sugar (x: StoryStore) {
    @scala.inline
    def duplicate: StoryStore = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.storybookVue.mod.StoryStore]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): StoryStore with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.storybookVue.mod.StoryStore with T]
    @scala.inline
    def withKind(kind: String): StoryStore = js.Dynamic.global.Object.assign(js.Dynamic.literal(kind = kind.asInstanceOf[js.Any]), x).asInstanceOf[typings.storybookVue.mod.StoryStore]
    @scala.inline
    def withStories(stories: js.Array[StoryObject]): StoryStore = js.Dynamic.global.Object.assign(js.Dynamic.literal(stories = stories.asInstanceOf[js.Any]), x).asInstanceOf[typings.storybookVue.mod.StoryStore]
    @scala.inline
    def withFileName(fileName: String): StoryStore = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fileName != null) obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.storybookVue.mod.StoryStore]
    }
  }
  
}

