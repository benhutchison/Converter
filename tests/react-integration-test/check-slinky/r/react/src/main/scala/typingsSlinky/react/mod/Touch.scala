package typingsSlinky.react.mod

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Touch extends js.Object {
  var clientX: Double = js.native
  var clientY: Double = js.native
  var identifier: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var target: EventTarget = js.native
}

object Touch {
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    identifier: Double,
    pageX: Double,
    pageY: Double,
    screenX: Double,
    screenY: Double,
    target: EventTarget
  ): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Touch]
  }
  @scala.inline
  implicit sealed class Sugar (x: Touch) {
    @scala.inline
    def duplicate: Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Touch with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.Touch with T]
    @scala.inline
    def withClientX(clientX: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withClientY(clientY: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withIdentifier(identifier: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withPageX(pageX: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withPageY(pageY: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(pageY = pageY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withScreenX(screenX: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withScreenY(screenY: Double): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(screenY = screenY.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
    @scala.inline
    def withTarget(target: EventTarget): Touch = js.Dynamic.global.Object.assign(js.Dynamic.literal(target = target.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.Touch]
  }
  
}

