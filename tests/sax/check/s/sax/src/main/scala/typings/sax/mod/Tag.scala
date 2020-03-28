package typings.sax.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends BaseTag {
  var attributes: StringDictionary[String] = js.native
}

object Tag {
  @scala.inline
  def apply(attributes: StringDictionary[String], isSelfClosing: Boolean, name: String): Tag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit sealed class Sugar (x: Tag) {
    @scala.inline
    def duplicate: Tag = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.Tag]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Tag with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.Tag with T]
    @scala.inline
    def withAttributes(attributes: StringDictionary[String]): Tag = js.Dynamic.global.Object.assign(js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.Tag]
    @scala.inline
    def withIsSelfClosing(isSelfClosing: Boolean): Tag = js.Dynamic.global.Object.assign(js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.Tag]
    @scala.inline
    def withName(name: String): Tag = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.Tag]
  }
  
}

