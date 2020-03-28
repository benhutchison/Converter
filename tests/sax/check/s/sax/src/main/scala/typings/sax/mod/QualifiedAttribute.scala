package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedAttribute extends QualifiedName {
  var value: String = js.native
}

object QualifiedAttribute {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: String): QualifiedAttribute = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualifiedAttribute]
  }
  @scala.inline
  implicit sealed class Sugar (x: QualifiedAttribute) {
    @scala.inline
    def duplicate: QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): QualifiedAttribute with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.QualifiedAttribute with T]
    @scala.inline
    def withLocal(local: String): QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(local = local.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
    @scala.inline
    def withName(name: String): QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
    @scala.inline
    def withPrefix(prefix: String): QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
    @scala.inline
    def withUri(uri: String): QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(uri = uri.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
    @scala.inline
    def withValue(value: String): QualifiedAttribute = js.Dynamic.global.Object.assign(js.Dynamic.literal(value = value.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedAttribute]
  }
  
}

