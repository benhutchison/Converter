package typings.react.mod

import typings.std.Document
import typings.std.StyleMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Browser Interfaces
// https://github.com/nikeee/2048-typescript/blob/master/2048/js/touch.d.ts
// ----------------------------------------------------------------------
@js.native
trait AbstractView extends js.Object {
  var document: Document = js.native
  var styleMedia: StyleMedia = js.native
}

object AbstractView {
  @scala.inline
  def apply(document: Document, styleMedia: StyleMedia): AbstractView = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], styleMedia = styleMedia.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractView]
  }
  @scala.inline
  implicit sealed class Sugar (x: AbstractView) {
    @scala.inline
    def duplicate: AbstractView = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.AbstractView]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): AbstractView with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.AbstractView with T]
    @scala.inline
    def withDocument(document: Document): AbstractView = js.Dynamic.global.Object.assign(js.Dynamic.literal(document = document.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.AbstractView]
    @scala.inline
    def withStyleMedia(styleMedia: StyleMedia): AbstractView = js.Dynamic.global.Object.assign(js.Dynamic.literal(styleMedia = styleMedia.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.AbstractView]
  }
  
}

