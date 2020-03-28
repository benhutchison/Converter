package typings.vueResource.vuejs

import typings.vueResource.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceActions extends js.Object {
  var delete: AnonMethod = js.native
  var get: AnonMethod = js.native
  var query: AnonMethod = js.native
  var remove: AnonMethod = js.native
  var save: AnonMethod = js.native
  var update: AnonMethod = js.native
}

object ResourceActions {
  @scala.inline
  def apply(
    delete: AnonMethod,
    get: AnonMethod,
    query: AnonMethod,
    remove: AnonMethod,
    save: AnonMethod,
    update: AnonMethod
  ): ResourceActions = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceActions]
  }
  @scala.inline
  implicit sealed class Sugar (x: ResourceActions) {
    @scala.inline
    def duplicate: ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ResourceActions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vueResource.vuejs.ResourceActions with T]
    @scala.inline
    def withDelete(delete: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(delete = delete.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def withGet(get: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(get = get.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def withQuery(query: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(query = query.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def withRemove(remove: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(remove = remove.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def withSave(save: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(save = save.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
    @scala.inline
    def withUpdate(update: AnonMethod): ResourceActions = js.Dynamic.global.Object.assign(js.Dynamic.literal(update = update.asInstanceOf[js.Any]), x).asInstanceOf[typings.vueResource.vuejs.ResourceActions]
  }
  
}

