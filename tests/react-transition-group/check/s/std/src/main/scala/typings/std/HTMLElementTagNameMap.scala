package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementTagNameMap extends js.Object {
  var a: HTMLAnchorElement = js.native
  var abbr: HTMLElement = js.native
  var address: HTMLElement = js.native
  var area: HTMLAreaElement = js.native
  var article: HTMLElement = js.native
  var aside: HTMLElement = js.native
  var audio: HTMLAudioElement = js.native
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(
    a: HTMLAnchorElement,
    abbr: HTMLElement,
    address: HTMLElement,
    area: HTMLAreaElement,
    article: HTMLElement,
    aside: HTMLElement,
    audio: HTMLAudioElement
  ): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  @scala.inline
  implicit sealed class Sugar (x: HTMLElementTagNameMap) {
    @scala.inline
    def duplicate: HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): HTMLElementTagNameMap with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.std.HTMLElementTagNameMap with T]
    @scala.inline
    def withA(a: HTMLAnchorElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(a = a.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withAbbr(abbr: HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withAddress(address: HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(address = address.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withArea(area: HTMLAreaElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(area = area.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withArticle(article: HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(article = article.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withAside(aside: HTMLElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(aside = aside.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
    @scala.inline
    def withAudio(audio: HTMLAudioElement): HTMLElementTagNameMap = js.Dynamic.global.Object.assign(js.Dynamic.literal(audio = audio.asInstanceOf[js.Any]), x).asInstanceOf[typings.std.HTMLElementTagNameMap]
  }
  
}

