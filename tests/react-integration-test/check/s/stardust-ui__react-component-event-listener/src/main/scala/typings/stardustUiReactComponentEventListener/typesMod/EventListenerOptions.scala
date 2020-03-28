package typings.stardustUiReactComponentEventListener.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerOptions[T /* <: EventTypes */] extends js.Object {
  /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
  var capture: js.UndefOr[Boolean] = js.native
  /** A function which receives a notification when an event of the specified type occurs. */
  var listener: EventHandler[T] = js.native
  /** A ref object with a target node. */
  var targetRef: TargetRef = js.native
  /** A case-sensitive string representing the event type to listen for. */
  var `type`: T = js.native
}

object EventListenerOptions {
  @scala.inline
  def apply[T /* <: EventTypes */](
    listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Unit,
    targetRef: TargetRef,
    `type`: T,
    capture: js.UndefOr[Boolean] = js.undefined
  ): EventListenerOptions[T] = {
    val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerOptions[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T <: EventTypes] (x: EventListenerOptions[T]) {
    @scala.inline
    def duplicate: EventListenerOptions[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): EventListenerOptions[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T] with T]
    @scala.inline
    def withListener(
      listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Unit
    ): EventListenerOptions[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(listener = js.Any.fromFunction1(listener)), x).asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    @scala.inline
    def withTargetRef(targetRef: TargetRef): EventListenerOptions[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any]), x).asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    @scala.inline
    def withType(`type`: T): EventListenerOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    }
    @scala.inline
    def withCaptureUndefined: EventListenerOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "capture")
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    }
    @scala.inline
    def withCapture(capture: Boolean): EventListenerOptions[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(capture)) obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stardustUiReactComponentEventListener.typesMod.EventListenerOptions[T]]
    }
  }
  
}

