package typingsSlinky.react.mod

import slinky.core.TagMod
import typingsSlinky.react.reactStrings.mount
import typingsSlinky.react.reactStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilerProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var id: String = js.native
  var onRender: ProfilerOnRenderCallback = js.native
}

object ProfilerProps {
  @scala.inline
  def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Set<SchedulerInteraction> */ /* interactions */ js.Any) => Unit,
    children: TagMod[Any] = null
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: ProfilerProps) {
    @scala.inline
    def duplicate: ProfilerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.ProfilerProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ProfilerProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.ProfilerProps with T]
    @scala.inline
    def withId(id: String): ProfilerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(id = id.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.ProfilerProps]
    @scala.inline
    def withOnRender(
      onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Set<SchedulerInteraction> */ /* interactions */ js.Any) => Unit
    ): ProfilerProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(onRender = js.Any.fromFunction7(onRender)), x).asInstanceOf[typingsSlinky.react.mod.ProfilerProps]
    @scala.inline
    def withChildren(children: TagMod[Any]): ProfilerProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.react.mod.ProfilerProps]
    }
  }
  
}

