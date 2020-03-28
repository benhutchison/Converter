package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLowerBound extends js.Object {
  var lowerBound: js.UndefOr[js.Array[Double]] = js.native
  var upperBound: js.UndefOr[js.Array[Double]] = js.native
}

object AnonLowerBound {
  @scala.inline
  def apply(lowerBound: js.Array[Double] = null, upperBound: js.Array[Double] = null): AnonLowerBound = {
    val __obj = js.Dynamic.literal()
    if (lowerBound != null) __obj.updateDynamic("lowerBound")(lowerBound.asInstanceOf[js.Any])
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLowerBound]
  }
  @scala.inline
  implicit sealed class Sugar (x: AnonLowerBound) {
    @scala.inline
    def duplicate: AnonLowerBound = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.phaser.AnonLowerBound]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AnonLowerBound with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.AnonLowerBound with T]
    @scala.inline
    def withLowerBound(lowerBound: js.Array[Double]): AnonLowerBound = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lowerBound != null) obj.updateDynamic("lowerBound")(lowerBound.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.phaser.AnonLowerBound]
    }
    @scala.inline
    def withUpperBound(upperBound: js.Array[Double]): AnonLowerBound = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (upperBound != null) obj.updateDynamic("upperBound")(upperBound.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.phaser.AnonLowerBound]
    }
  }
  
}

