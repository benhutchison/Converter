package typingsSlinky.react.mod

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
    identifiedTouch: Double => Touch,
    item: Double => Touch,
    length: Double,
    NumberDictionary: /* index */ NumberDictionary[Touch] = null
  ): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TouchList]
  }
  @scala.inline
  implicit sealed class Sugar (x: TouchList) {
    @scala.inline
    def duplicate: TouchList = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.react.mod.TouchList]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): TouchList with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.react.mod.TouchList with T]
    @scala.inline
    def withIdentifiedTouch(identifiedTouch: Double => Touch): TouchList = js.Dynamic.global.Object.assign(js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch)), x).asInstanceOf[typingsSlinky.react.mod.TouchList]
    @scala.inline
    def withItem(item: Double => Touch): TouchList = js.Dynamic.global.Object.assign(js.Dynamic.literal(item = js.Any.fromFunction1(item)), x).asInstanceOf[typingsSlinky.react.mod.TouchList]
    @scala.inline
    def withLength(length: Double): TouchList = js.Dynamic.global.Object.assign(js.Dynamic.literal(length = length.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.react.mod.TouchList]
    @scala.inline
    def withNumberDictionary(NumberDictionary: /* index */ NumberDictionary[Touch]): TouchList = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (NumberDictionary != null) js.Dynamic.global.Object.assign(obj, NumberDictionary)
      obj.asInstanceOf[typingsSlinky.react.mod.TouchList]
    }
  }
  
}

