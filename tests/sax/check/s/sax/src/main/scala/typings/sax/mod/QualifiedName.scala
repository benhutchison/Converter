package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedName extends js.Object {
  var local: String = js.native
  var name: String = js.native
  var prefix: String = js.native
  var uri: String = js.native
}

object QualifiedName {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String): QualifiedName = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualifiedName]
  }
  @scala.inline
  implicit sealed class Sugar (x: QualifiedName) {
    @scala.inline
    def duplicate: QualifiedName = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.QualifiedName]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): QualifiedName with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.QualifiedName with T]
    @scala.inline
    def withLocal(local: String): QualifiedName = js.Dynamic.global.Object.assign(js.Dynamic.literal(local = local.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedName]
    @scala.inline
    def withName(name: String): QualifiedName = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedName]
    @scala.inline
    def withPrefix(prefix: String): QualifiedName = js.Dynamic.global.Object.assign(js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedName]
    @scala.inline
    def withUri(uri: String): QualifiedName = js.Dynamic.global.Object.assign(js.Dynamic.literal(uri = uri.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedName]
  }
  
}

