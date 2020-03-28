package typings.stylis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var keyframe: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
  ] = js.native
  var preserve: js.UndefOr[Boolean] = js.native
  var semicolon: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    keyframe: js.UndefOr[Boolean] = js.undefined,
    prefix: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean]) = null,
    preserve: js.UndefOr[Boolean] = js.undefined,
    semicolon: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (!js.isUndefined(keyframe)) __obj.updateDynamic("keyframe")(keyframe.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit sealed class Sugar (x: Options) {
    @scala.inline
    def duplicate: Options = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.stylis.mod.Options]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): Options with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.stylis.mod.Options with T]
    @scala.inline
    def withCascadeUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "cascade")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withCascade(cascade: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(cascade)) obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withCompressUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "compress")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withCompress(compress: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(compress)) obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withGlobalUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "global")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withGlobal(global: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(global)) obj.updateDynamic("global")(global.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withKeyframeUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "keyframe")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withKeyframe(keyframe: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(keyframe)) obj.updateDynamic("keyframe")(keyframe.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withPrefixBoolean(prefix: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withPrefixFunction3(prefix: js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean]): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (prefix != null) obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withPreserveUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "preserve")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withPreserve(preserve: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(preserve)) obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withSemicolonUndefined: Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "semicolon")
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
    @scala.inline
    def withSemicolon(semicolon: Boolean): Options = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(semicolon)) obj.updateDynamic("semicolon")(semicolon.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.stylis.mod.Options]
    }
  }
  
}

