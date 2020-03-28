package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementTagNameMap extends js.Object {
  var a: org.scalajs.dom.raw.HTMLAnchorElement = js.native
  var abbr: org.scalajs.dom.raw.HTMLElement = js.native
  var address: org.scalajs.dom.raw.HTMLElement = js.native
  var area: org.scalajs.dom.raw.HTMLAreaElement = js.native
  var article: org.scalajs.dom.raw.HTMLElement = js.native
  var aside: org.scalajs.dom.raw.HTMLElement = js.native
  var audio: org.scalajs.dom.raw.HTMLAudioElement = js.native
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(
    a: org.scalajs.dom.raw.HTMLAnchorElement,
    abbr: org.scalajs.dom.raw.HTMLElement,
    address: org.scalajs.dom.raw.HTMLElement,
    area: org.scalajs.dom.raw.HTMLAreaElement,
    article: org.scalajs.dom.raw.HTMLElement,
    aside: org.scalajs.dom.raw.HTMLElement,
    audio: org.scalajs.dom.raw.HTMLAudioElement
  ): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  @scala.inline
  implicit sealed class Sugar (x: HTMLElementTagNameMap) {
    @scala.inline
    def duplicate: HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HTMLElementTagNameMap with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap with T]
    @scala.inline
    def withA(a: org.scalajs.dom.raw.HTMLAnchorElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(a = a.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withAbbr(abbr: org.scalajs.dom.raw.HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withAddress(address: org.scalajs.dom.raw.HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(address = address.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withArea(area: org.scalajs.dom.raw.HTMLAreaElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(area = area.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withArticle(article: org.scalajs.dom.raw.HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(article = article.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withAside(aside: org.scalajs.dom.raw.HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(aside = aside.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
    @scala.inline
    def withAudio(audio: org.scalajs.dom.raw.HTMLAudioElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(audio = audio.asInstanceOf[js.Any]), x).asInstanceOf[typingsSlinky.std.HTMLElementTagNameMap]
  }
  
}

