package typings.angular

import typings.angular.mod.auto.IInjectorService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Adds the specified class(es) to each of the set of matched elements.
    *
    * @param className One or more space-separated classes to be added to the class attribute of each matched element.
    * @see {@link https://api.jquery.com/addClass/#addClass-className}
    */
  def addClass(className: String): this.type = js.native
  def injector(): IInjectorService = js.native
}

object JQuery {
  @scala.inline
  def apply(addClass: String => JQuery, injector: () => IInjectorService): JQuery = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), injector = js.Any.fromFunction0(injector))
  
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit sealed class Sugar (x: JQuery) {
    @scala.inline
    def duplicate: JQuery = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.angular.JQuery]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): JQuery with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.angular.JQuery with T]
    @scala.inline
    def withAddClass(addClass: String => JQuery): JQuery = js.Dynamic.global.Object.assign(js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass)), x).asInstanceOf[typings.angular.JQuery]
    @scala.inline
    def withInjector(injector: () => IInjectorService): JQuery = js.Dynamic.global.Object.assign(js.Dynamic.literal(injector = js.Any.fromFunction0(injector)), x).asInstanceOf[typings.angular.JQuery]
  }
  
}

