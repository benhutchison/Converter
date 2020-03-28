package typings.react.mod

import typings.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAttributes[T] extends DOMAttributes[T] {
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
}

object SVGAttributes {
  @scala.inline
  def apply[T](
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    height: Double | String = null
  ): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: SVGAttributes[T]) {
    @scala.inline
    def duplicate: SVGAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.SVGAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.SVGAttributes[T] with T]
    @scala.inline
    def withChildren(children: ReactNode): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(children.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClassName(className: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColor(color: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dangerouslySetInnerHTML != null) obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHeightString(height: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHeightDouble(height: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
  }
  
}

