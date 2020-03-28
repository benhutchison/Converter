package typingsSlinky.reactDropzone.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.HTMLProps<std.HTMLElement>, react-dropzone.react-dropzone.PropTypes> & {  accept ? :string | std.Array<string>,   minSize ? :number,   maxSize ? :number,   preventDropOnDocument ? :boolean,   noClick ? :boolean,   noKeyboard ? :boolean,   noDrag ? :boolean,   noDragEventsBubbling ? :boolean,   disabled ? :boolean,   onDrop ? :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(acceptedFiles : std.Array<T>, rejectedFiles : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void,   onDropAccepted ? :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void,   onDropRejected ? :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void,   getFilesFromEvent ? :(event : react-dropzone.react-dropzone.DropEvent): / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> * / any,   onFileDialogCancel ? :(): void} */
@js.native
trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var getFilesFromEvent: js.UndefOr[
    js.Function1[
      /* event */ DropEvent, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ _
    ]
  ] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var noClick: js.UndefOr[Boolean] = js.native
  var noDrag: js.UndefOr[Boolean] = js.native
  var noDragEventsBubbling: js.UndefOr[Boolean] = js.native
  var noKeyboard: js.UndefOr[Boolean] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDrop: js.UndefOr[
    js.Function3[
      /* acceptedFiles */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
      ], 
      /* rejectedFiles */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
      ], 
      /* event */ DropEvent, 
      Unit
    ]
  ] = js.native
  var onDropAccepted: js.UndefOr[
    js.Function2[
      /* files */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
      ], 
      /* event */ DropEvent, 
      Unit
    ]
  ] = js.native
  var onDropRejected: js.UndefOr[
    js.Function2[
      /* files */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
      ], 
      /* event */ DropEvent, 
      Unit
    ]
  ] = js.native
  var onFileDialogCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var preventDropOnDocument: js.UndefOr[Boolean] = js.native
}

object DropzoneOptions {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
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
  ): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[DropzoneOptions]
  }
  @scala.inline
  implicit sealed class Sugar (x: DropzoneOptions) {
    @scala.inline
    def duplicate: DropzoneOptions = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): DropzoneOptions with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions with T]
    @scala.inline
    def withAcceptArray(accept: js.Array[String]): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withAcceptString(accept: String): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accept != null) obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withDisabledUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "disabled")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withDisabled(disabled: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(disabled)) obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withGetFilesFromEvent(
      getFilesFromEvent: /* event */ DropEvent => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ _
    ): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getFilesFromEvent != null) obj.updateDynamic("getFilesFromEvent")(js.Any.fromFunction1(getFilesFromEvent))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMaxSizeInt(maxSize: Int): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxSize != null) obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMaxSizeDouble(maxSize: Double): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maxSize != null) obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMinSizeInt(minSize: Int): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minSize != null) obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMinSizeDouble(minSize: Double): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (minSize != null) obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMultipleUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "multiple")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withMultiple(multiple: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(multiple)) obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoClickUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noClick")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoClick(noClick: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noClick)) obj.updateDynamic("noClick")(noClick.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoDragUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noDrag")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoDrag(noDrag: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noDrag)) obj.updateDynamic("noDrag")(noDrag.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoDragEventsBubblingUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noDragEventsBubbling")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoDragEventsBubbling(noDragEventsBubbling: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noDragEventsBubbling)) obj.updateDynamic("noDragEventsBubbling")(noDragEventsBubbling.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoKeyboardUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "noKeyboard")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withNoKeyboard(noKeyboard: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(noKeyboard)) obj.updateDynamic("noKeyboard")(noKeyboard.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: DragEvent[HTMLElement] => Unit): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragEnter != null) obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: DragEvent[HTMLElement] => Unit): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragLeave != null) obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDragOver(onDragOver: DragEvent[HTMLElement] => Unit): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDragOver != null) obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDrop(
      onDrop: (/* acceptedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* rejectedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDrop != null) obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDropAccepted(
      onDropAccepted: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDropAccepted != null) obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnDropRejected(
      onDropRejected: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ _
        ], /* event */ DropEvent) => Unit
    ): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onDropRejected != null) obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withOnFileDialogCancel(onFileDialogCancel: () => Unit): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (onFileDialogCancel != null) obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withPreventDropOnDocumentUndefined: DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "preventDropOnDocument")
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
    @scala.inline
    def withPreventDropOnDocument(preventDropOnDocument: Boolean): DropzoneOptions = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(preventDropOnDocument)) obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsSlinky.reactDropzone.mod.DropzoneOptions]
    }
  }
  
}

