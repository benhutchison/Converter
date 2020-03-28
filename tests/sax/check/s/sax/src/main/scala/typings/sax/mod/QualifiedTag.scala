package typings.sax.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sax.mod.BaseTag because var conflicts: name. Inlined isSelfClosing */ @js.native
trait QualifiedTag extends QualifiedName {
  var attributes: StringDictionary[QualifiedAttribute] = js.native
  var isSelfClosing: Boolean = js.native
  var ns: StringDictionary[String] = js.native
}

object QualifiedTag {
  @scala.inline
  def apply(
    attributes: StringDictionary[QualifiedAttribute],
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: StringDictionary[String],
    prefix: String,
    uri: String
  ): QualifiedTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualifiedTag]
  }
  @scala.inline
  implicit sealed class Sugar (x: QualifiedTag) {
    @scala.inline
    def duplicate: QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): QualifiedTag with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.sax.mod.QualifiedTag with T]
    @scala.inline
    def withAttributes(attributes: StringDictionary[QualifiedAttribute]): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withIsSelfClosing(isSelfClosing: Boolean): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withLocal(local: String): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(local = local.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withName(name: String): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(name = name.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withNs(ns: StringDictionary[String]): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(ns = ns.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withPrefix(prefix: String): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
    @scala.inline
    def withUri(uri: String): QualifiedTag = js.Dynamic.global.Object.assign(js.Dynamic.literal(uri = uri.asInstanceOf[js.Any]), x).asInstanceOf[typings.sax.mod.QualifiedTag]
  }
  
}

