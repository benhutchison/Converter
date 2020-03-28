package typings.node.NodeJS

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrnoException extends Error {
  var code: js.UndefOr[String] = js.native
  var errno: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var syscall: js.UndefOr[String] = js.native
}

object ErrnoException {
  @scala.inline
  def apply(
    code: String = null,
    errno: Int | Double = null,
    path: String = null,
    stack: String = null,
    syscall: String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syscall != null) __obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrnoException]
  }
  @scala.inline
  implicit sealed class Sugar (x: ErrnoException) {
    @scala.inline
    def duplicate: ErrnoException = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.NodeJS.ErrnoException]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ErrnoException with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.NodeJS.ErrnoException with T]
    @scala.inline
    def withCode(code: String): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (code != null) obj.updateDynamic("code")(code.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
    @scala.inline
    def withErrnoInt(errno: Int): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (errno != null) obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
    @scala.inline
    def withErrnoDouble(errno: Double): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (errno != null) obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
    @scala.inline
    def withPath(path: String): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (path != null) obj.updateDynamic("path")(path.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
    @scala.inline
    def withStack(stack: String): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stack != null) obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
    @scala.inline
    def withSyscall(syscall: String): ErrnoException = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (syscall != null) obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.node.NodeJS.ErrnoException]
    }
  }
  
}

