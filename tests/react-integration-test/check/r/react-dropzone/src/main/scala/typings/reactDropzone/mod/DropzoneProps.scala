package typings.reactDropzone.mod

import typings.react.mod.DragEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneProps extends DropzoneOptions {
  var children: js.UndefOr[js.Function1[/* state */ DropzoneState, Element]] = js.native
}

object DropzoneProps {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
    children: /* state */ DropzoneState => Element = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getFilesFromEvent: /* event */ DropEvent => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ _ = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    noClick: js.UndefOr[Boolean] = js.undefined,
    noDrag: js.UndefOr[Boolean] = js.undefined,
    noDragEventsBubbling: js.UndefOr[Boolean] = js.undefined,
    noKeyboard: js.UndefOr[Boolean] = js.undefined,
    onDragEnter: DragEvent[HTMLElement] => Unit = null,
    onDragLeave: DragEvent[HTMLElement] => Unit = null,
    onDragOver: DragEvent[HTMLElement] => Unit = null,
    onDrop: (/* acceptedFiles */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
    ], /* rejectedFiles */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
    ], /* event */ DropEvent) => Unit = null,
    onDropAccepted: (/* files */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
    ], /* event */ DropEvent) => Unit = null,
    onDropRejected: (/* files */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
    ], /* event */ DropEvent) => Unit = null,
    onFileDialogCancel: () => Unit = null,
    preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
  ): DropzoneProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getFilesFromEvent != null) __obj.updateDynamic("getFilesFromEvent")(js.Any.fromFunction1(getFilesFromEvent))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(noClick)) __obj.updateDynamic("noClick")(noClick.asInstanceOf[js.Any])
    if (!js.isUndefined(noDrag)) __obj.updateDynamic("noDrag")(noDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(noDragEventsBubbling)) __obj.updateDynamic("noDragEventsBubbling")(noDragEventsBubbling.asInstanceOf[js.Any])
    if (!js.isUndefined(noKeyboard)) __obj.updateDynamic("noKeyboard")(noKeyboard.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: DropzoneProps) {
    @scala.inline
    def duplicate: DropzoneProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DropzoneProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.reactDropzone.mod.DropzoneProps with T]
    @scala.inline
    def withAcceptArray(accept: js.Array[String]): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withAcceptString(accept: String): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withChildren(children: /* state */ DropzoneState => Element): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (children != null) obj.updateDynamic("children")(js.Any.fromFunction1(children))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withDisabledUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withGetFilesFromEvent(
      getFilesFromEvent: /* event */ DropEvent => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ _
    ): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getFilesFromEvent != null) obj.updateDynamic("getFilesFromEvent")(js.Any.fromFunction1(getFilesFromEvent))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMaxSizeInt(maxSize: Int): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxSize != null) obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMaxSizeDouble(maxSize: Double): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxSize != null) obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMinSizeInt(minSize: Int): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minSize != null) obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMinSizeDouble(minSize: Double): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minSize != null) obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMultipleUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "multiple")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withMultiple(multiple: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(multiple)) obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoClickUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noClick")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoClick(noClick: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noClick)) obj.updateDynamic("noClick")(noClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoDragUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noDrag")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoDrag(noDrag: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noDrag)) obj.updateDynamic("noDrag")(noDrag.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoDragEventsBubblingUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noDragEventsBubbling")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoDragEventsBubbling(noDragEventsBubbling: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noDragEventsBubbling)) obj.updateDynamic("noDragEventsBubbling")(noDragEventsBubbling.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoKeyboardUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noKeyboard")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withNoKeyboard(noKeyboard: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noKeyboard)) obj.updateDynamic("noKeyboard")(noKeyboard.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[HTMLElement] => Unit): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[HTMLElement] => Unit): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[HTMLElement] => Unit): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDrop(
      onDrop: (/* acceptedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* rejectedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDropAccepted(
      onDropAccepted: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDropAccepted != null) obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnDropRejected(
      onDropRejected: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDropRejected != null) obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withOnFileDialogCancel(onFileDialogCancel: () => Unit): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFileDialogCancel != null) obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withPreventDropOnDocumentUndefined: DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "preventDropOnDocument")
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
    @scala.inline
    def withPreventDropOnDocument(preventDropOnDocument: Boolean): DropzoneProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(preventDropOnDocument)) obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.reactDropzone.mod.DropzoneProps]
    }
  }
  
}

