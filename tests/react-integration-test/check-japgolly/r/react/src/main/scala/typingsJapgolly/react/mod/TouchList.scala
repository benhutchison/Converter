package typingsJapgolly.react.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  var length: Double = js.native
  def identifiedTouch(identifier: Double): Touch = js.native
  def item(index: Double): Touch = js.native
}

object TouchList {
  @scala.inline
  def apply(
    identifiedTouch: Double => CallbackTo[Touch],
    item: Double => CallbackTo[Touch],
    length: Double,
    NumberDictionary: /* index */ NumberDictionary[Touch] = null
  ): TouchList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("identifiedTouch")(js.Any.fromFunction1((t0: Double) => identifiedTouch(t0).runNow()))
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: Double) => item(t0).runNow()))
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TouchList]
  }
}

