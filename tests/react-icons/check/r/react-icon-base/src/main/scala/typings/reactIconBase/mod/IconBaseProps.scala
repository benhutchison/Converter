package typings.reactIconBase.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.ReactSVGElement
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconBaseProps extends ClassAttributes[ReactSVGElement] {
  var size: js.UndefOr[String | Double] = js.native
}

object IconBaseProps {
  @scala.inline
  def apply(key: Key = null, ref: Ref[ReactSVGElement] = null, size: String | Double = null): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: IconBaseProps) {
    @scala.inline
    def duplicate: IconBaseProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactIconBase.mod.IconBaseProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IconBaseProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactIconBase.mod.IconBaseProps with T]
    @scala.inline
    def withKey(key: Key): IconBaseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (key != null) obj.updateDynamic("key")(key.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactIconBase.mod.IconBaseProps]
    }
    @scala.inline
    def withRef(ref: Ref[ReactSVGElement]): IconBaseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ref != null) obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactIconBase.mod.IconBaseProps]
    }
    @scala.inline
    def withSizeString(size: String): IconBaseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactIconBase.mod.IconBaseProps]
    }
    @scala.inline
    def withSizeDouble(size: Double): IconBaseProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (size != null) obj.updateDynamic("size")(size.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactIconBase.mod.IconBaseProps]
    }
  }
  
}

