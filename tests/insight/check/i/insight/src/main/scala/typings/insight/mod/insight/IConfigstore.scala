package typings.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigstore extends js.Object {
  var all: js.Any = js.native
  var path: String = js.native
  def del(key: String): Unit = js.native
  def get(key: String): js.Any = js.native
  def set(key: String, `val`: js.Any): Unit = js.native
}

object IConfigstore {
  @scala.inline
  def apply(
    all: js.Any,
    del: String => Unit,
    get: String => js.Any,
    path: String,
    set: (String, js.Any) => Unit
  ): IConfigstore = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[IConfigstore]
  }
  @scala.inline
  implicit sealed class Sugar (x: IConfigstore) {
    @scala.inline
    def duplicate: IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): IConfigstore with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.insight.mod.insight.IConfigstore with T]
    @scala.inline
    def withAll(all: js.Any): IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(all = all.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
    @scala.inline
    def withDel(del: String => Unit): IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(del = js.Any.fromFunction1(del)), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
    @scala.inline
    def withGet(get: String => js.Any): IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(get = js.Any.fromFunction1(get)), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
    @scala.inline
    def withPath(path: String): IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(path = path.asInstanceOf[js.Any]), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
    @scala.inline
    def withSet(set: (String, js.Any) => Unit): IConfigstore = js.Dynamic.global.Object.assign(js.Dynamic.literal(set = js.Any.fromFunction2(set)), x).asInstanceOf[typings.insight.mod.insight.IConfigstore]
  }
  
}

