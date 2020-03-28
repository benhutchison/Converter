package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This should be "infer SS" but can't use it yet
@js.native
trait NewLifecycle[P, S, SS] extends js.Object {
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.native
  /**
    * Runs before React applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.native
}

object NewLifecycle {
  @scala.inline
  def apply[P, S, SS](
    componentDidUpdate: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit = null,
    getSnapshotBeforeUpdate: (/* prevProps */ P, /* prevState */ S) => SS | Null = null
  ): NewLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    __obj.asInstanceOf[NewLifecycle[P, S, SS]]
  }
  @scala.inline
  implicit sealed class Sugar[P, S, SS] (x: NewLifecycle[P, S, SS]) {
    @scala.inline
    def duplicate: NewLifecycle[P, S, SS] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.NewLifecycle[P, S, SS]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (NewLifecycle[P, S, SS]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.NewLifecycle[P, S, SS] with T]
    @scala.inline
    def withComponentDidUpdate(componentDidUpdate: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit): NewLifecycle[P, S, SS] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentDidUpdate != null) obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
      obj.asInstanceOf[typings.react.mod.NewLifecycle[P, S, SS]]
    }
    @scala.inline
    def withGetSnapshotBeforeUpdate(getSnapshotBeforeUpdate: (/* prevProps */ P, /* prevState */ S) => SS | Null): NewLifecycle[P, S, SS] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getSnapshotBeforeUpdate != null) obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
      obj.asInstanceOf[typings.react.mod.NewLifecycle[P, S, SS]]
    }
  }
  
}

