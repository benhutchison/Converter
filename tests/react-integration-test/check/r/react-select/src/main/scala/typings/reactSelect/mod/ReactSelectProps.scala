package typings.reactSelect.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSelectProps[TValue] extends Props[ReactSelectClass[TValue]] {
  /**
    * text to display when `allowCreate` is true.
    * @default 'Add "{label}"?'
    */
  var addLabelText: js.UndefOr[String] = js.native
}

object ReactSelectProps {
  @scala.inline
  def apply[TValue](
    addLabelText: String = null,
    children: ReactNode = null,
    key: Key = null,
    ref: LegacyRef[ReactSelectClass[TValue]] = null
  ): ReactSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (addLabelText != null) __obj.updateDynamic("addLabelText")(addLabelText.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSelectProps[TValue]]
  }
  @scala.inline
  implicit sealed class Sugar[TValue] (x: ReactSelectProps[TValue]) {
    @scala.inline
    def duplicate: ReactSelectProps[TValue] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactSelectProps[TValue] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue] with T]
    @scala.inline
    def withAddLabelText(addLabelText: String): ReactSelectProps[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (addLabelText != null) obj.updateDynamic("addLabelText")(addLabelText.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue]]
    }
    @scala.inline
    def withChildren(children: ReactNode): ReactSelectProps[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue]]
    }
    @scala.inline
    def withKey(key: Key): ReactSelectProps[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue]]
    }
    @scala.inline
    def withRef(ref: LegacyRef[ReactSelectClass[TValue]]): ReactSelectProps[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactSelect.mod.ReactSelectProps[TValue]]
    }
  }
  
}

