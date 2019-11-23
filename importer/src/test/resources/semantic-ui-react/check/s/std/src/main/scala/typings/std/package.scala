package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  import org.scalablytyped.runtime.StringDictionary

  type AnimationEvent = Event
  type ClipboardEvent = Event
  type CompositionEvent = Event
  type DragEvent = Event
  type FocusEvent = Event
  type HTMLAnchorElement = HTMLElement
  type HTMLAreaElement = HTMLElement
  type HTMLAudioElement = HTMLElement
  type HTMLBRElement = HTMLElement
  type HTMLBaseElement = HTMLElement
  type HTMLBodyElement = HTMLElement
  type HTMLButtonElement = HTMLElement
  type HTMLCanvasElement = HTMLElement
  type HTMLDListElement = HTMLElement
  type HTMLDataElement = HTMLElement
  type HTMLDataListElement = HTMLElement
  type HTMLDialogElement = HTMLElement
  type HTMLDivElement = HTMLElement
  type HTMLElement = Element
  type HTMLEmbedElement = HTMLElement
  type HTMLFieldSetElement = HTMLElement
  type HTMLFormElement = HTMLElement
  type HTMLHRElement = HTMLElement
  type HTMLHeadElement = HTMLElement
  type HTMLHeadingElement = HTMLElement
  type HTMLHtmlElement = HTMLElement
  type HTMLIFrameElement = HTMLElement
  type HTMLImageElement = HTMLElement
  type HTMLInputElement = HTMLElement
  type HTMLLIElement = HTMLElement
  type HTMLLabelElement = HTMLElement
  type HTMLLegendElement = HTMLElement
  type HTMLLinkElement = HTMLElement
  type HTMLMapElement = HTMLElement
  type HTMLMetaElement = HTMLElement
  type HTMLModElement = HTMLElement
  type HTMLOListElement = HTMLElement
  type HTMLObjectElement = HTMLElement
  type HTMLOptGroupElement = HTMLElement
  type HTMLOptionElement = HTMLElement
  type HTMLParagraphElement = HTMLElement
  type HTMLParamElement = HTMLElement
  type HTMLPreElement = HTMLElement
  type HTMLProgressElement = HTMLElement
  type HTMLQuoteElement = HTMLElement
  type HTMLScriptElement = HTMLElement
  type HTMLSelectElement = HTMLElement
  type HTMLSourceElement = HTMLElement
  type HTMLSpanElement = HTMLElement
  type HTMLStyleElement = HTMLElement
  type HTMLTableColElement = HTMLElement
  type HTMLTableDataCellElement = HTMLElement
  type HTMLTableElement = HTMLElement
  type HTMLTableHeaderCellElement = HTMLElement
  type HTMLTableRowElement = HTMLElement
  type HTMLTableSectionElement = HTMLElement
  type HTMLTemplateElement = HTMLElement
  type HTMLTextAreaElement = HTMLElement
  type HTMLTitleElement = HTMLElement
  type HTMLTrackElement = HTMLElement
  type HTMLUListElement = HTMLElement
  type HTMLVideoElement = HTMLElement
  type HTMLWebViewElement = HTMLElement
  type KeyboardEvent = Event
  type MouseEvent = Event
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.std.stdStrings.Partial with T
  /**
    * From T pick a set of properties K
    */
  type Pick[T, K /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typings.std.stdStrings.Pick with T
  type PointerEvent = Event
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typings.std.stdStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: String */, T] = StringDictionary[K]
  type SVGCircleElement = SVGElement
  type SVGClipPathElement = SVGElement
  type SVGDefsElement = SVGElement
  type SVGDescElement = SVGElement
  type SVGElement = Element
  type SVGEllipseElement = SVGElement
  type SVGFEBlendElement = SVGElement
  type SVGFEColorMatrixElement = SVGElement
  type SVGFEComponentTransferElement = SVGElement
  type SVGFECompositeElement = SVGElement
  type SVGFEConvolveMatrixElement = SVGElement
  type SVGFEDiffuseLightingElement = SVGElement
  type SVGFEDisplacementMapElement = SVGElement
  type SVGFEDistantLightElement = SVGElement
  type SVGFEDropShadowElement = SVGElement
  type SVGFEFloodElement = SVGElement
  type SVGFEFuncAElement = SVGElement
  type SVGFEFuncBElement = SVGElement
  type SVGFEFuncGElement = SVGElement
  type SVGFEFuncRElement = SVGElement
  type SVGFEGaussianBlurElement = SVGElement
  type SVGFEImageElement = SVGElement
  type SVGFEMergeElement = SVGElement
  type SVGFEMergeNodeElement = SVGElement
  type SVGFEMorphologyElement = SVGElement
  type SVGFEOffsetElement = SVGElement
  type SVGFEPointLightElement = SVGElement
  type SVGFESpecularLightingElement = SVGElement
  type SVGFESpotLightElement = SVGElement
  type SVGFETileElement = SVGElement
  type SVGFETurbulenceElement = SVGElement
  type SVGFilterElement = SVGElement
  type SVGForeignObjectElement = SVGElement
  type SVGGElement = SVGElement
  type SVGImageElement = SVGElement
  type SVGLineElement = SVGElement
  type SVGLinearGradientElement = SVGElement
  type SVGMarkerElement = SVGElement
  type SVGMaskElement = SVGElement
  type SVGMetadataElement = SVGElement
  type SVGPathElement = SVGElement
  type SVGPatternElement = SVGElement
  type SVGPolygonElement = SVGElement
  type SVGPolylineElement = SVGElement
  type SVGRadialGradientElement = SVGElement
  type SVGRectElement = SVGElement
  type SVGSVGElement = SVGElement
  type SVGStopElement = SVGElement
  type SVGSwitchElement = SVGElement
  type SVGSymbolElement = SVGElement
  type SVGTSpanElement = SVGElement
  type SVGTextElement = SVGElement
  type SVGTextPathElement = SVGElement
  type SVGUseElement = SVGElement
  type SVGViewElement = SVGElement
  type TouchEvent = Event
  type TransitionEvent = Event
  type UIEvent = Event
  type WheelEvent = Event
}
