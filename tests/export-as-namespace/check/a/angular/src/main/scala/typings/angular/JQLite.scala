package typings.angular

import org.scalablytyped.runtime.NumberDictionary
import typings.angular.mod.auto.IInjectorService
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQLite
  extends JQuery
     with /* index */ NumberDictionary[HTMLElement]

object JQLite {
  @scala.inline
  def apply(
    addClass: String => JQLite,
    injector: () => IInjectorService,
    NumberDictionary: /* index */ NumberDictionary[HTMLElement] = null
  ): JQLite = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), injector = js.Any.fromFunction0(injector))
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[JQLite]
  }
  @scala.inline
  implicit sealed class Sugar (x: JQLite) {
    @scala.inline
    def duplicate: JQLite = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.angular.JQLite]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): JQLite with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.angular.JQLite with T]
    @scala.inline
    def withAddClass(addClass: String => JQLite): JQLite = js.Dynamic.global.Object.assign(js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass)), x).asInstanceOf[typings.angular.JQLite]
    @scala.inline
    def withInjector(injector: () => IInjectorService): JQLite = js.Dynamic.global.Object.assign(js.Dynamic.literal(injector = js.Any.fromFunction0(injector)), x).asInstanceOf[typings.angular.JQLite]
    @scala.inline
    def withNumberDictionary(NumberDictionary: /* index */ NumberDictionary[HTMLElement]): JQLite = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (NumberDictionary != null) js.Dynamic.global.Object.assign(obj, NumberDictionary)
      obj.asInstanceOf[typings.angular.JQLite]
    }
  }
  
}

