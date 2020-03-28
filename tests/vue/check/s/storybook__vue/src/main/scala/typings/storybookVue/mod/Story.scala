package typings.storybookVue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends js.Object {
  val kind: String = js.native
  def add(storyName: String, getStory: StoryFunction): this.type = js.native
  def addDecorator(decorator: StoryDecorator): this.type = js.native
}

object Story {
  @scala.inline
  def apply(add: (String, StoryFunction) => Story, addDecorator: StoryDecorator => Story, kind: String): Story = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addDecorator = js.Any.fromFunction1(addDecorator), kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Story]
  }
  @scala.inline
  implicit sealed class Sugar (x: Story) {
    @scala.inline
    def duplicate: Story = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.storybookVue.mod.Story]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Story with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.storybookVue.mod.Story with T]
    @scala.inline
    def withAdd(add: (String, StoryFunction) => Story): Story = js.Dynamic.global.Object.assign(js.Dynamic.literal(add = js.Any.fromFunction2(add)), x).asInstanceOf[typings.storybookVue.mod.Story]
    @scala.inline
    def withAddDecorator(addDecorator: StoryDecorator => Story): Story = js.Dynamic.global.Object.assign(js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator)), x).asInstanceOf[typings.storybookVue.mod.Story]
    @scala.inline
    def withKind(kind: String): Story = js.Dynamic.global.Object.assign(js.Dynamic.literal(kind = kind.asInstanceOf[js.Any]), x).asInstanceOf[typings.storybookVue.mod.Story]
  }
  
}

