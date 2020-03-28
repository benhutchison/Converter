package typings.reactSelect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[TValue]
  extends /**
  * In the event that a custom menuRenderer is provided, Option should be able
  * to accept arbitrary key-value pairs. See react-virtualized-select.
  */
/* property */ StringDictionary[js.Any] {
  /** Value for searching */
  var value: js.UndefOr[TValue] = js.native
}

object Option {
  @scala.inline
  def apply[TValue](
    StringDictionary: /**
    * In the event that a custom menuRenderer is provided, Option should be able
    * to accept arbitrary key-value pairs. See react-virtualized-select.
    */
  /* property */ StringDictionary[js.Any] = null,
    value: TValue = null
  ): Option[TValue] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[TValue]]
  }
  @scala.inline
  implicit sealed class Sugar[TValue] (x: Option[TValue]) {
    @scala.inline
    def duplicate: Option[TValue] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactSelect.mod.Option[TValue]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Option[TValue] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactSelect.mod.Option[TValue] with T]
    @scala.inline
    def withStringDictionary(
      StringDictionary: /**
      * In the event that a custom menuRenderer is provided, Option should be able
      * to accept arbitrary key-value pairs. See react-virtualized-select.
      */
    /* property */ StringDictionary[js.Any]
    ): Option[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.reactSelect.mod.Option[TValue]]
    }
    @scala.inline
    def withValue(value: TValue): Option[TValue] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (value != null) obj.updateDynamic("value")(value.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactSelect.mod.Option[TValue]]
    }
  }
  
}

