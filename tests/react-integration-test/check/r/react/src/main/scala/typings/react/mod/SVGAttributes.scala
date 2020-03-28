package typings.react.mod

import typings.react.reactStrings.`after-edge`
import typings.react.reactStrings.`before-edge`
import typings.react.reactStrings.`text-after-edge`
import typings.react.reactStrings.`text-before-edge`
import typings.react.reactStrings.alphabetic
import typings.react.reactStrings.auto
import typings.react.reactStrings.baseline
import typings.react.reactStrings.bevel
import typings.react.reactStrings.butt
import typings.react.reactStrings.central
import typings.react.reactStrings.evenodd
import typings.react.reactStrings.hanging
import typings.react.reactStrings.ideographic
import typings.react.reactStrings.inherit
import typings.react.reactStrings.initial
import typings.react.reactStrings.isolated
import typings.react.reactStrings.linearRGB
import typings.react.reactStrings.mathematical
import typings.react.reactStrings.medial
import typings.react.reactStrings.middle
import typings.react.reactStrings.miter
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.nonzero
import typings.react.reactStrings.replace
import typings.react.reactStrings.round
import typings.react.reactStrings.sRGB
import typings.react.reactStrings.square
import typings.react.reactStrings.sum
import typings.react.reactStrings.terminal
import typings.react.reactStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
@js.native
trait SVGAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  // SVG Specific attributes
  var accentHeight: js.UndefOr[Double | String] = js.native
  var accumulate: js.UndefOr[none | sum] = js.native
  var additive: js.UndefOr[replace | sum] = js.native
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  var allowReorder: js.UndefOr[no | yes] = js.native
  var alphabetic: js.UndefOr[Double | String] = js.native
  var amplitude: js.UndefOr[Double | String] = js.native
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  var ascent: js.UndefOr[Double | String] = js.native
  var attributeName: js.UndefOr[String] = js.native
  var attributeType: js.UndefOr[String] = js.native
  var autoReverse: js.UndefOr[Double | String] = js.native
  var azimuth: js.UndefOr[Double | String] = js.native
  var baseFrequency: js.UndefOr[Double | String] = js.native
  var baseProfile: js.UndefOr[Double | String] = js.native
  var baselineShift: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[Double | String] = js.native
  var begin: js.UndefOr[Double | String] = js.native
  var bias: js.UndefOr[Double | String] = js.native
  var by: js.UndefOr[Double | String] = js.native
  var calcMode: js.UndefOr[Double | String] = js.native
  var capHeight: js.UndefOr[Double | String] = js.native
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[String] = js.native
  var clip: js.UndefOr[Double | String] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  var clipRule: js.UndefOr[Double | String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  var colorProfile: js.UndefOr[Double | String] = js.native
  var colorRendering: js.UndefOr[Double | String] = js.native
  var contentScriptType: js.UndefOr[Double | String] = js.native
  var contentStyleType: js.UndefOr[Double | String] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var d: js.UndefOr[String] = js.native
  var decelerate: js.UndefOr[Double | String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  var direction: js.UndefOr[Double | String] = js.native
  var display: js.UndefOr[Double | String] = js.native
  var divisor: js.UndefOr[Double | String] = js.native
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  var dur: js.UndefOr[Double | String] = js.native
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
  var edgeMode: js.UndefOr[Double | String] = js.native
  var elevation: js.UndefOr[Double | String] = js.native
  var enableBackground: js.UndefOr[Double | String] = js.native
  var end: js.UndefOr[Double | String] = js.native
  var exponent: js.UndefOr[Double | String] = js.native
  var externalResourcesRequired: js.UndefOr[Double | String] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double | String] = js.native
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterRes: js.UndefOr[Double | String] = js.native
  var filterUnits: js.UndefOr[Double | String] = js.native
  var floodColor: js.UndefOr[Double | String] = js.native
  var floodOpacity: js.UndefOr[Double | String] = js.native
  var focusable: js.UndefOr[Double | String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  var fontStretch: js.UndefOr[Double | String] = js.native
  var fontStyle: js.UndefOr[Double | String] = js.native
  var fontVariant: js.UndefOr[Double | String] = js.native
  var fontWeight: js.UndefOr[Double | String] = js.native
  var format: js.UndefOr[Double | String] = js.native
  var from: js.UndefOr[Double | String] = js.native
  var fx: js.UndefOr[Double | String] = js.native
  var fy: js.UndefOr[Double | String] = js.native
  var g1: js.UndefOr[Double | String] = js.native
  var g2: js.UndefOr[Double | String] = js.native
  var glyphName: js.UndefOr[Double | String] = js.native
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  var glyphRef: js.UndefOr[Double | String] = js.native
  var gradientTransform: js.UndefOr[String] = js.native
  var gradientUnits: js.UndefOr[String] = js.native
  var hanging: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var horizAdvX: js.UndefOr[Double | String] = js.native
  var horizOriginX: js.UndefOr[Double | String] = js.native
  var href: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ideographic: js.UndefOr[Double | String] = js.native
  var imageRendering: js.UndefOr[Double | String] = js.native
  var in: js.UndefOr[String] = js.native
  var in2: js.UndefOr[Double | String] = js.native
  var intercept: js.UndefOr[Double | String] = js.native
  var k: js.UndefOr[Double | String] = js.native
  var k1: js.UndefOr[Double | String] = js.native
  var k2: js.UndefOr[Double | String] = js.native
  var k3: js.UndefOr[Double | String] = js.native
  var k4: js.UndefOr[Double | String] = js.native
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  var kerning: js.UndefOr[Double | String] = js.native
  var keyPoints: js.UndefOr[Double | String] = js.native
  var keySplines: js.UndefOr[Double | String] = js.native
  var keyTimes: js.UndefOr[Double | String] = js.native
  var lang: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  var letterSpacing: js.UndefOr[Double | String] = js.native
  var lightingColor: js.UndefOr[Double | String] = js.native
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  var local: js.UndefOr[Double | String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[Double | String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var markerUnits: js.UndefOr[Double | String] = js.native
  var markerWidth: js.UndefOr[Double | String] = js.native
  var mask: js.UndefOr[String] = js.native
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  var maskUnits: js.UndefOr[Double | String] = js.native
  var mathematical: js.UndefOr[Double | String] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var media: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var mode: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var numOctaves: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var opacity: js.UndefOr[Double | String] = js.native
  var operator: js.UndefOr[Double | String] = js.native
  var order: js.UndefOr[Double | String] = js.native
  var orient: js.UndefOr[Double | String] = js.native
  var orientation: js.UndefOr[Double | String] = js.native
  var origin: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[Double | String] = js.native
  var overlinePosition: js.UndefOr[Double | String] = js.native
  var overlineThickness: js.UndefOr[Double | String] = js.native
  var paintOrder: js.UndefOr[Double | String] = js.native
  var panose1: js.UndefOr[Double | String] = js.native
  var pathLength: js.UndefOr[Double | String] = js.native
  var patternContentUnits: js.UndefOr[String] = js.native
  var patternTransform: js.UndefOr[Double | String] = js.native
  var patternUnits: js.UndefOr[String] = js.native
  var pointerEvents: js.UndefOr[Double | String] = js.native
  var points: js.UndefOr[String] = js.native
  var pointsAtX: js.UndefOr[Double | String] = js.native
  var pointsAtY: js.UndefOr[Double | String] = js.native
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  var preserveAlpha: js.UndefOr[Double | String] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  var r: js.UndefOr[Double | String] = js.native
  var radius: js.UndefOr[Double | String] = js.native
  var refX: js.UndefOr[Double | String] = js.native
  var refY: js.UndefOr[Double | String] = js.native
  var renderingIntent: js.UndefOr[Double | String] = js.native
  var repeatCount: js.UndefOr[Double | String] = js.native
  var repeatDur: js.UndefOr[Double | String] = js.native
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  var restart: js.UndefOr[Double | String] = js.native
  var result: js.UndefOr[String] = js.native
  // Other HTML properties supported by SVG elements in browsers
  var role: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[Double | String] = js.native
  var rx: js.UndefOr[Double | String] = js.native
  var ry: js.UndefOr[Double | String] = js.native
  var scale: js.UndefOr[Double | String] = js.native
  var seed: js.UndefOr[Double | String] = js.native
  var shapeRendering: js.UndefOr[Double | String] = js.native
  var slope: js.UndefOr[Double | String] = js.native
  var spacing: js.UndefOr[Double | String] = js.native
  var specularConstant: js.UndefOr[Double | String] = js.native
  var specularExponent: js.UndefOr[Double | String] = js.native
  var speed: js.UndefOr[Double | String] = js.native
  var spreadMethod: js.UndefOr[String] = js.native
  var startOffset: js.UndefOr[Double | String] = js.native
  var stdDeviation: js.UndefOr[Double | String] = js.native
  var stemh: js.UndefOr[Double | String] = js.native
  var stemv: js.UndefOr[Double | String] = js.native
  var stitchTiles: js.UndefOr[Double | String] = js.native
  var stopColor: js.UndefOr[String] = js.native
  var stopOpacity: js.UndefOr[Double | String] = js.native
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  var string: js.UndefOr[Double | String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  var strokeWidth: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var surfaceScale: js.UndefOr[Double | String] = js.native
  var systemLanguage: js.UndefOr[Double | String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tableValues: js.UndefOr[Double | String] = js.native
  var target: js.UndefOr[String] = js.native
  var targetX: js.UndefOr[Double | String] = js.native
  var targetY: js.UndefOr[Double | String] = js.native
  var textAnchor: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[Double | String] = js.native
  var textLength: js.UndefOr[Double | String] = js.native
  var textRendering: js.UndefOr[Double | String] = js.native
  var to: js.UndefOr[Double | String] = js.native
  var transform: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var u1: js.UndefOr[Double | String] = js.native
  var u2: js.UndefOr[Double | String] = js.native
  var underlinePosition: js.UndefOr[Double | String] = js.native
  var underlineThickness: js.UndefOr[Double | String] = js.native
  var unicode: js.UndefOr[Double | String] = js.native
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  var unicodeRange: js.UndefOr[Double | String] = js.native
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  var vHanging: js.UndefOr[Double | String] = js.native
  var vIdeographic: js.UndefOr[Double | String] = js.native
  var vMathematical: js.UndefOr[Double | String] = js.native
  var values: js.UndefOr[String] = js.native
  var vectorEffect: js.UndefOr[Double | String] = js.native
  var version: js.UndefOr[String] = js.native
  var vertAdvY: js.UndefOr[Double | String] = js.native
  var vertOriginX: js.UndefOr[Double | String] = js.native
  var vertOriginY: js.UndefOr[Double | String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var viewTarget: js.UndefOr[Double | String] = js.native
  var visibility: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var widths: js.UndefOr[Double | String] = js.native
  var wordSpacing: js.UndefOr[Double | String] = js.native
  var writingMode: js.UndefOr[Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var x1: js.UndefOr[Double | String] = js.native
  var x2: js.UndefOr[Double | String] = js.native
  var xChannelSelector: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double | String] = js.native
  var xlinkActuate: js.UndefOr[String] = js.native
  var xlinkArcrole: js.UndefOr[String] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
  var xlinkRole: js.UndefOr[String] = js.native
  var xlinkShow: js.UndefOr[String] = js.native
  var xlinkTitle: js.UndefOr[String] = js.native
  var xlinkType: js.UndefOr[String] = js.native
  var xmlBase: js.UndefOr[String] = js.native
  var xmlLang: js.UndefOr[String] = js.native
  var xmlSpace: js.UndefOr[String] = js.native
  var xmlns: js.UndefOr[String] = js.native
  var xmlnsXlink: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double | String] = js.native
  var y1: js.UndefOr[Double | String] = js.native
  var y2: js.UndefOr[Double | String] = js.native
  var yChannelSelector: js.UndefOr[String] = js.native
  var z: js.UndefOr[Double | String] = js.native
  var zoomAndPan: js.UndefOr[String] = js.native
}

object SVGAttributes {
  @scala.inline
  def apply[T](
    AriaAttributes: AriaAttributes = null,
    DOMAttributes: DOMAttributes[T] = null,
    accentHeight: Double | String = null,
    accumulate: none | sum = null,
    additive: replace | sum = null,
    alignmentBaseline: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = null,
    allowReorder: no | yes = null,
    alphabetic: Double | String = null,
    amplitude: Double | String = null,
    arabicForm: initial | medial | terminal | isolated = null,
    ascent: Double | String = null,
    attributeName: String = null,
    attributeType: String = null,
    autoReverse: Double | String = null,
    azimuth: Double | String = null,
    baseFrequency: Double | String = null,
    baseProfile: Double | String = null,
    baselineShift: Double | String = null,
    bbox: Double | String = null,
    begin: Double | String = null,
    bias: Double | String = null,
    by: Double | String = null,
    calcMode: Double | String = null,
    capHeight: Double | String = null,
    className: String = null,
    clip: Double | String = null,
    clipPath: String = null,
    clipPathUnits: Double | String = null,
    clipRule: Double | String = null,
    color: String = null,
    colorInterpolation: Double | String = null,
    colorInterpolationFilters: auto | sRGB | linearRGB | inherit = null,
    colorProfile: Double | String = null,
    colorRendering: Double | String = null,
    contentScriptType: Double | String = null,
    contentStyleType: Double | String = null,
    cursor: Double | String = null,
    cx: Double | String = null,
    cy: Double | String = null,
    d: String = null,
    decelerate: Double | String = null,
    descent: Double | String = null,
    diffuseConstant: Double | String = null,
    direction: Double | String = null,
    display: Double | String = null,
    divisor: Double | String = null,
    dominantBaseline: Double | String = null,
    dur: Double | String = null,
    dx: Double | String = null,
    dy: Double | String = null,
    edgeMode: Double | String = null,
    elevation: Double | String = null,
    enableBackground: Double | String = null,
    end: Double | String = null,
    exponent: Double | String = null,
    externalResourcesRequired: Double | String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: nonzero | evenodd | inherit = null,
    filter: String = null,
    filterRes: Double | String = null,
    filterUnits: Double | String = null,
    floodColor: Double | String = null,
    floodOpacity: Double | String = null,
    focusable: Double | String = null,
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: Double | String = null,
    fontStyle: Double | String = null,
    fontVariant: Double | String = null,
    fontWeight: Double | String = null,
    format: Double | String = null,
    from: Double | String = null,
    fx: Double | String = null,
    fy: Double | String = null,
    g1: Double | String = null,
    g2: Double | String = null,
    glyphName: Double | String = null,
    glyphOrientationHorizontal: Double | String = null,
    glyphOrientationVertical: Double | String = null,
    glyphRef: Double | String = null,
    gradientTransform: String = null,
    gradientUnits: String = null,
    hanging: Double | String = null,
    height: Double | String = null,
    horizAdvX: Double | String = null,
    horizOriginX: Double | String = null,
    href: String = null,
    id: String = null,
    ideographic: Double | String = null,
    imageRendering: Double | String = null,
    in: String = null,
    in2: Double | String = null,
    intercept: Double | String = null,
    k: Double | String = null,
    k1: Double | String = null,
    k2: Double | String = null,
    k3: Double | String = null,
    k4: Double | String = null,
    kernelMatrix: Double | String = null,
    kernelUnitLength: Double | String = null,
    kerning: Double | String = null,
    keyPoints: Double | String = null,
    keySplines: Double | String = null,
    keyTimes: Double | String = null,
    lang: String = null,
    lengthAdjust: Double | String = null,
    letterSpacing: Double | String = null,
    lightingColor: Double | String = null,
    limitingConeAngle: Double | String = null,
    local: Double | String = null,
    markerEnd: String = null,
    markerHeight: Double | String = null,
    markerMid: String = null,
    markerStart: String = null,
    markerUnits: Double | String = null,
    markerWidth: Double | String = null,
    mask: String = null,
    maskContentUnits: Double | String = null,
    maskUnits: Double | String = null,
    mathematical: Double | String = null,
    max: Double | String = null,
    media: String = null,
    method: String = null,
    min: Double | String = null,
    mode: Double | String = null,
    name: String = null,
    numOctaves: Double | String = null,
    offset: Double | String = null,
    opacity: Double | String = null,
    operator: Double | String = null,
    order: Double | String = null,
    orient: Double | String = null,
    orientation: Double | String = null,
    origin: Double | String = null,
    overflow: Double | String = null,
    overlinePosition: Double | String = null,
    overlineThickness: Double | String = null,
    paintOrder: Double | String = null,
    panose1: Double | String = null,
    pathLength: Double | String = null,
    patternContentUnits: String = null,
    patternTransform: Double | String = null,
    patternUnits: String = null,
    pointerEvents: Double | String = null,
    points: String = null,
    pointsAtX: Double | String = null,
    pointsAtY: Double | String = null,
    pointsAtZ: Double | String = null,
    preserveAlpha: Double | String = null,
    preserveAspectRatio: String = null,
    primitiveUnits: Double | String = null,
    r: Double | String = null,
    radius: Double | String = null,
    refX: Double | String = null,
    refY: Double | String = null,
    renderingIntent: Double | String = null,
    repeatCount: Double | String = null,
    repeatDur: Double | String = null,
    requiredExtensions: Double | String = null,
    requiredFeatures: Double | String = null,
    restart: Double | String = null,
    result: String = null,
    role: String = null,
    rotate: Double | String = null,
    rx: Double | String = null,
    ry: Double | String = null,
    scale: Double | String = null,
    seed: Double | String = null,
    shapeRendering: Double | String = null,
    slope: Double | String = null,
    spacing: Double | String = null,
    specularConstant: Double | String = null,
    specularExponent: Double | String = null,
    speed: Double | String = null,
    spreadMethod: String = null,
    startOffset: Double | String = null,
    stdDeviation: Double | String = null,
    stemh: Double | String = null,
    stemv: Double | String = null,
    stitchTiles: Double | String = null,
    stopColor: String = null,
    stopOpacity: Double | String = null,
    strikethroughPosition: Double | String = null,
    strikethroughThickness: Double | String = null,
    string: Double | String = null,
    stroke: String = null,
    strokeDasharray: String | Double = null,
    strokeDashoffset: String | Double = null,
    strokeLinecap: butt | round | square | inherit = null,
    strokeLinejoin: miter | round | bevel | inherit = null,
    strokeMiterlimit: Double | String = null,
    strokeOpacity: Double | String = null,
    strokeWidth: Double | String = null,
    style: CSSProperties = null,
    surfaceScale: Double | String = null,
    systemLanguage: Double | String = null,
    tabIndex: Int | Double = null,
    tableValues: Double | String = null,
    target: String = null,
    targetX: Double | String = null,
    targetY: Double | String = null,
    textAnchor: String = null,
    textDecoration: Double | String = null,
    textLength: Double | String = null,
    textRendering: Double | String = null,
    to: Double | String = null,
    transform: String = null,
    `type`: String = null,
    u1: Double | String = null,
    u2: Double | String = null,
    underlinePosition: Double | String = null,
    underlineThickness: Double | String = null,
    unicode: Double | String = null,
    unicodeBidi: Double | String = null,
    unicodeRange: Double | String = null,
    unitsPerEm: Double | String = null,
    vAlphabetic: Double | String = null,
    vHanging: Double | String = null,
    vIdeographic: Double | String = null,
    vMathematical: Double | String = null,
    values: String = null,
    vectorEffect: Double | String = null,
    version: String = null,
    vertAdvY: Double | String = null,
    vertOriginX: Double | String = null,
    vertOriginY: Double | String = null,
    viewBox: String = null,
    viewTarget: Double | String = null,
    visibility: Double | String = null,
    width: Double | String = null,
    widths: Double | String = null,
    wordSpacing: Double | String = null,
    writingMode: Double | String = null,
    x: Double | String = null,
    x1: Double | String = null,
    x2: Double | String = null,
    xChannelSelector: String = null,
    xHeight: Double | String = null,
    xlinkActuate: String = null,
    xlinkArcrole: String = null,
    xlinkHref: String = null,
    xlinkRole: String = null,
    xlinkShow: String = null,
    xlinkTitle: String = null,
    xlinkType: String = null,
    xmlBase: String = null,
    xmlLang: String = null,
    xmlSpace: String = null,
    xmlns: String = null,
    xmlnsXlink: String = null,
    y: Double | String = null,
    y1: Double | String = null
  ): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (AriaAttributes != null) js.Dynamic.global.Object.assign(__obj, AriaAttributes)
    if (DOMAttributes != null) js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    if (accentHeight != null) __obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
    if (accumulate != null) __obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (allowReorder != null) __obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
    if (alphabetic != null) __obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
    if (amplitude != null) __obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
    if (arabicForm != null) __obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeType != null) __obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
    if (autoReverse != null) __obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
    if (azimuth != null) __obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
    if (baseFrequency != null) __obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
    if (baseProfile != null) __obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (calcMode != null) __obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipPathUnits != null) __obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (contentScriptType != null) __obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
    if (contentStyleType != null) __obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (decelerate != null) __obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (diffuseConstant != null) __obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dur != null) __obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (edgeMode != null) __obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (externalResourcesRequired != null) __obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterRes != null) __obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
    if (filterUnits != null) __obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (g1 != null) __obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
    if (g2 != null) __obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
    if (glyphName != null) __obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (glyphRef != null) __obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (hanging != null) __obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizAdvX != null) __obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
    if (horizOriginX != null) __obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ideographic != null) __obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (in2 != null) __obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (k1 != null) __obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
    if (k2 != null) __obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
    if (k3 != null) __obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
    if (k4 != null) __obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
    if (kernelMatrix != null) __obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
    if (kernelUnitLength != null) __obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (keyPoints != null) __obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
    if (keySplines != null) __obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
    if (keyTimes != null) __obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (limitingConeAngle != null) __obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskContentUnits != null) __obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
    if (maskUnits != null) __obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
    if (mathematical != null) __obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numOctaves != null) __obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overlinePosition != null) __obj.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
    if (overlineThickness != null) __obj.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
    if (paintOrder != null) __obj.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
    if (panose1 != null) __obj.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
    if (pathLength != null) __obj.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (pointsAtX != null) __obj.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
    if (pointsAtY != null) __obj.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
    if (pointsAtZ != null) __obj.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
    if (preserveAlpha != null) __obj.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (primitiveUnits != null) __obj.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (renderingIntent != null) __obj.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
    if (repeatCount != null) __obj.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
    if (repeatDur != null) __obj.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
    if (requiredExtensions != null) __obj.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
    if (requiredFeatures != null) __obj.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (slope != null) __obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (specularConstant != null) __obj.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
    if (specularExponent != null) __obj.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (spreadMethod != null) __obj.updateDynamic("spreadMethod")(spreadMethod.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (stdDeviation != null) __obj.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
    if (stemh != null) __obj.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
    if (stemv != null) __obj.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
    if (stitchTiles != null) __obj.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (strikethroughPosition != null) __obj.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
    if (strikethroughThickness != null) __obj.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (surfaceScale != null) __obj.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
    if (systemLanguage != null) __obj.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableValues != null) __obj.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetX != null) __obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
    if (targetY != null) __obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textLength != null) __obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
    if (textRendering != null) __obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (u1 != null) __obj.updateDynamic("u1")(u1.asInstanceOf[js.Any])
    if (u2 != null) __obj.updateDynamic("u2")(u2.asInstanceOf[js.Any])
    if (underlinePosition != null) __obj.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
    if (underlineThickness != null) __obj.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
    if (unicode != null) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (unicodeBidi != null) __obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    if (unitsPerEm != null) __obj.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
    if (vAlphabetic != null) __obj.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
    if (vHanging != null) __obj.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
    if (vIdeographic != null) __obj.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
    if (vMathematical != null) __obj.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vertAdvY != null) __obj.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
    if (vertOriginX != null) __obj.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
    if (vertOriginY != null) __obj.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (viewTarget != null) __obj.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (writingMode != null) __obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xChannelSelector != null) __obj.updateDynamic("xChannelSelector")(xChannelSelector.asInstanceOf[js.Any])
    if (xHeight != null) __obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
    if (xlinkActuate != null) __obj.updateDynamic("xlinkActuate")(xlinkActuate.asInstanceOf[js.Any])
    if (xlinkArcrole != null) __obj.updateDynamic("xlinkArcrole")(xlinkArcrole.asInstanceOf[js.Any])
    if (xlinkHref != null) __obj.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
    if (xlinkRole != null) __obj.updateDynamic("xlinkRole")(xlinkRole.asInstanceOf[js.Any])
    if (xlinkShow != null) __obj.updateDynamic("xlinkShow")(xlinkShow.asInstanceOf[js.Any])
    if (xlinkTitle != null) __obj.updateDynamic("xlinkTitle")(xlinkTitle.asInstanceOf[js.Any])
    if (xlinkType != null) __obj.updateDynamic("xlinkType")(xlinkType.asInstanceOf[js.Any])
    if (xmlBase != null) __obj.updateDynamic("xmlBase")(xmlBase.asInstanceOf[js.Any])
    if (xmlLang != null) __obj.updateDynamic("xmlLang")(xmlLang.asInstanceOf[js.Any])
    if (xmlSpace != null) __obj.updateDynamic("xmlSpace")(xmlSpace.asInstanceOf[js.Any])
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    if (xmlnsXlink != null) __obj.updateDynamic("xmlnsXlink")(xmlnsXlink.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  @scala.inline
  implicit sealed class Sugar[T] (x: SVGAttributes[T]) {
    @scala.inline
    def duplicate: SVGAttributes[T] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.SVGAttributes[T]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SVGAttributes[T] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.SVGAttributes[T] with T]
    @scala.inline
    def withAriaAttributes(AriaAttributes: AriaAttributes): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (AriaAttributes != null) js.Dynamic.global.Object.assign(obj, AriaAttributes)
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDOMAttributes(DOMAttributes: DOMAttributes[T]): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (DOMAttributes != null) js.Dynamic.global.Object.assign(obj, DOMAttributes)
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAccentHeightString(accentHeight: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accentHeight != null) obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAccentHeightDouble(accentHeight: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accentHeight != null) obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAccumulateNone(accumulate: none): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accumulate != null) obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAccumulateSum(accumulate: sum): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (accumulate != null) obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAdditiveReplace(additive: replace): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (additive != null) obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAdditiveSum(additive: sum): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (additive != null) obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineAuto(alignmentBaseline: auto): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineAlphabetic(alignmentBaseline: alphabetic): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineBaseline(alignmentBaseline: baseline): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineCentral(alignmentBaseline: central): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineMiddle(alignmentBaseline: middle): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def `withAlignmentBaselineText-after-edge`(alignmentBaseline: `text-after-edge`): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineInherit(alignmentBaseline: inherit): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def `withAlignmentBaselineAfter-edge`(alignmentBaseline: `after-edge`): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineHanging(alignmentBaseline: hanging): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineMathematical(alignmentBaseline: mathematical): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def `withAlignmentBaselineText-before-edge`(alignmentBaseline: `text-before-edge`): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlignmentBaselineIdeographic(alignmentBaseline: ideographic): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def `withAlignmentBaselineBefore-edge`(alignmentBaseline: `before-edge`): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alignmentBaseline != null) obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAllowReorderYes(allowReorder: yes): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (allowReorder != null) obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAllowReorderNo(allowReorder: no): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (allowReorder != null) obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlphabeticString(alphabetic: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alphabetic != null) obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAlphabeticDouble(alphabetic: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (alphabetic != null) obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAmplitudeString(amplitude: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (amplitude != null) obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAmplitudeDouble(amplitude: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (amplitude != null) obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withArabicFormInitial(arabicForm: initial): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (arabicForm != null) obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withArabicFormMedial(arabicForm: medial): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (arabicForm != null) obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withArabicFormIsolated(arabicForm: isolated): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (arabicForm != null) obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withArabicFormTerminal(arabicForm: terminal): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (arabicForm != null) obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAscentString(ascent: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ascent != null) obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAscentDouble(ascent: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ascent != null) obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAttributeName(attributeName: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attributeName != null) obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAttributeType(attributeType: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (attributeType != null) obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAutoReverseString(autoReverse: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoReverse != null) obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAutoReverseDouble(autoReverse: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (autoReverse != null) obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAzimuthString(azimuth: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (azimuth != null) obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withAzimuthDouble(azimuth: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (azimuth != null) obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaseFrequencyString(baseFrequency: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baseFrequency != null) obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaseFrequencyDouble(baseFrequency: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baseFrequency != null) obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaseProfileString(baseProfile: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baseProfile != null) obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaseProfileDouble(baseProfile: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baseProfile != null) obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaselineShiftString(baselineShift: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baselineShift != null) obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBaselineShiftDouble(baselineShift: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (baselineShift != null) obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBboxString(bbox: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bbox != null) obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBboxDouble(bbox: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bbox != null) obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBeginString(begin: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (begin != null) obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBeginDouble(begin: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (begin != null) obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBiasString(bias: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bias != null) obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withBiasDouble(bias: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (bias != null) obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withByString(by: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (by != null) obj.updateDynamic("by")(by.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withByDouble(by: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (by != null) obj.updateDynamic("by")(by.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCalcModeString(calcMode: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (calcMode != null) obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCalcModeDouble(calcMode: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (calcMode != null) obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCapHeightString(capHeight: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (capHeight != null) obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCapHeightDouble(capHeight: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (capHeight != null) obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClassName(className: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipString(clip: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clip != null) obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipDouble(clip: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clip != null) obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipPath(clipPath: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clipPath != null) obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipPathUnitsString(clipPathUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clipPathUnits != null) obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipPathUnitsDouble(clipPathUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clipPathUnits != null) obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipRuleString(clipRule: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clipRule != null) obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withClipRuleDouble(clipRule: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (clipRule != null) obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColor(color: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (color != null) obj.updateDynamic("color")(color.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationString(colorInterpolation: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolation != null) obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationDouble(colorInterpolation: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolation != null) obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersInherit(colorInterpolationFilters: inherit): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolationFilters != null) obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersAuto(colorInterpolationFilters: auto): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolationFilters != null) obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersSRGB(colorInterpolationFilters: sRGB): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolationFilters != null) obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersLinearRGB(colorInterpolationFilters: linearRGB): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorInterpolationFilters != null) obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorProfileString(colorProfile: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorProfile != null) obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorProfileDouble(colorProfile: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorProfile != null) obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorRenderingString(colorRendering: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorRendering != null) obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withColorRenderingDouble(colorRendering: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (colorRendering != null) obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withContentScriptTypeString(contentScriptType: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contentScriptType != null) obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withContentScriptTypeDouble(contentScriptType: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contentScriptType != null) obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withContentStyleTypeString(contentStyleType: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contentStyleType != null) obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withContentStyleTypeDouble(contentStyleType: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contentStyleType != null) obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCursorString(cursor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cursor != null) obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCursorDouble(cursor: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cursor != null) obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCxString(cx: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cx != null) obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCxDouble(cx: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cx != null) obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCyString(cy: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cy != null) obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withCyDouble(cy: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (cy != null) obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withD(d: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (d != null) obj.updateDynamic("d")(d.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDecelerateString(decelerate: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (decelerate != null) obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDecelerateDouble(decelerate: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (decelerate != null) obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDescentString(descent: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (descent != null) obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDescentDouble(descent: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (descent != null) obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDiffuseConstantString(diffuseConstant: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (diffuseConstant != null) obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDiffuseConstantDouble(diffuseConstant: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (diffuseConstant != null) obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDirectionString(direction: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (direction != null) obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDirectionDouble(direction: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (direction != null) obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDisplayString(display: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (display != null) obj.updateDynamic("display")(display.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDisplayDouble(display: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (display != null) obj.updateDynamic("display")(display.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDivisorString(divisor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (divisor != null) obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDivisorDouble(divisor: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (divisor != null) obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDominantBaselineString(dominantBaseline: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dominantBaseline != null) obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDominantBaselineDouble(dominantBaseline: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dominantBaseline != null) obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDurString(dur: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dur != null) obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDurDouble(dur: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dur != null) obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDxString(dx: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dx != null) obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDxDouble(dx: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dx != null) obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDyString(dy: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dy != null) obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withDyDouble(dy: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (dy != null) obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEdgeModeString(edgeMode: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (edgeMode != null) obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEdgeModeDouble(edgeMode: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (edgeMode != null) obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withElevationString(elevation: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (elevation != null) obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withElevationDouble(elevation: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (elevation != null) obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEnableBackgroundString(enableBackground: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (enableBackground != null) obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEnableBackgroundDouble(enableBackground: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (enableBackground != null) obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEndString(end: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (end != null) obj.updateDynamic("end")(end.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withEndDouble(end: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (end != null) obj.updateDynamic("end")(end.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withExponentString(exponent: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (exponent != null) obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withExponentDouble(exponent: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (exponent != null) obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withExternalResourcesRequiredString(externalResourcesRequired: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (externalResourcesRequired != null) obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withExternalResourcesRequiredDouble(externalResourcesRequired: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (externalResourcesRequired != null) obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFill(fill: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fill != null) obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFillOpacityString(fillOpacity: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fillOpacity != null) obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFillOpacityDouble(fillOpacity: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fillOpacity != null) obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFillRuleInherit(fillRule: inherit): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fillRule != null) obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFillRuleNonzero(fillRule: nonzero): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fillRule != null) obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFillRuleEvenodd(fillRule: evenodd): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fillRule != null) obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFilter(filter: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filter != null) obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFilterResString(filterRes: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filterRes != null) obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFilterResDouble(filterRes: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filterRes != null) obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFilterUnitsString(filterUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filterUnits != null) obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFilterUnitsDouble(filterUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filterUnits != null) obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFloodColorString(floodColor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floodColor != null) obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFloodColorDouble(floodColor: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floodColor != null) obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFloodOpacityString(floodOpacity: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floodOpacity != null) obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFloodOpacityDouble(floodOpacity: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (floodOpacity != null) obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFocusableString(focusable: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (focusable != null) obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFocusableDouble(focusable: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (focusable != null) obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontFamily(fontFamily: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontFamily != null) obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontSizeString(fontSize: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontSize != null) obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontSizeDouble(fontSize: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontSize != null) obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontSizeAdjustString(fontSizeAdjust: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontSizeAdjust != null) obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontSizeAdjustDouble(fontSizeAdjust: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontSizeAdjust != null) obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontStretchString(fontStretch: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontStretch != null) obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontStretchDouble(fontStretch: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontStretch != null) obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontStyleString(fontStyle: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontStyle != null) obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontStyleDouble(fontStyle: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontStyle != null) obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontVariantString(fontVariant: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontVariant != null) obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontVariantDouble(fontVariant: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontVariant != null) obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontWeightString(fontWeight: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontWeight != null) obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFontWeightDouble(fontWeight: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fontWeight != null) obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFormatString(format: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (format != null) obj.updateDynamic("format")(format.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFormatDouble(format: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (format != null) obj.updateDynamic("format")(format.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFromString(from: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (from != null) obj.updateDynamic("from")(from.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFromDouble(from: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (from != null) obj.updateDynamic("from")(from.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFxString(fx: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fx != null) obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFxDouble(fx: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fx != null) obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFyString(fy: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fy != null) obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withFyDouble(fy: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (fy != null) obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withG1String(g1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (g1 != null) obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withG1Double(g1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (g1 != null) obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withG2String(g2: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (g2 != null) obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withG2Double(g2: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (g2 != null) obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphNameString(glyphName: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphName != null) obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphNameDouble(glyphName: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphName != null) obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphOrientationHorizontalString(glyphOrientationHorizontal: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphOrientationHorizontal != null) obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphOrientationHorizontalDouble(glyphOrientationHorizontal: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphOrientationHorizontal != null) obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphOrientationVerticalString(glyphOrientationVertical: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphOrientationVertical != null) obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphOrientationVerticalDouble(glyphOrientationVertical: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphOrientationVertical != null) obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphRefString(glyphRef: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphRef != null) obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGlyphRefDouble(glyphRef: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (glyphRef != null) obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGradientTransform(gradientTransform: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (gradientTransform != null) obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withGradientUnits(gradientUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (gradientUnits != null) obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHangingString(hanging: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (hanging != null) obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHangingDouble(hanging: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (hanging != null) obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHeightString(height: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHeightDouble(height: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (height != null) obj.updateDynamic("height")(height.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHorizAdvXString(horizAdvX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (horizAdvX != null) obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHorizAdvXDouble(horizAdvX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (horizAdvX != null) obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHorizOriginXString(horizOriginX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (horizOriginX != null) obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHorizOriginXDouble(horizOriginX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (horizOriginX != null) obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withHref(href: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (href != null) obj.updateDynamic("href")(href.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withId(id: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (id != null) obj.updateDynamic("id")(id.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withIdeographicString(ideographic: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ideographic != null) obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withIdeographicDouble(ideographic: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ideographic != null) obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withImageRenderingString(imageRendering: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (imageRendering != null) obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withImageRenderingDouble(imageRendering: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (imageRendering != null) obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withIn(in: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (in != null) obj.updateDynamic("in")(in.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withIn2String(in2: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (in2 != null) obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withIn2Double(in2: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (in2 != null) obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withInterceptString(intercept: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (intercept != null) obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withInterceptDouble(intercept: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (intercept != null) obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKString(k: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k != null) obj.updateDynamic("k")(k.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKDouble(k: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k != null) obj.updateDynamic("k")(k.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK1String(k1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k1 != null) obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK1Double(k1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k1 != null) obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK2String(k2: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k2 != null) obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK2Double(k2: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k2 != null) obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK3String(k3: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k3 != null) obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK3Double(k3: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k3 != null) obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK4String(k4: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k4 != null) obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withK4Double(k4: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (k4 != null) obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKernelMatrixString(kernelMatrix: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kernelMatrix != null) obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKernelMatrixDouble(kernelMatrix: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kernelMatrix != null) obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKernelUnitLengthString(kernelUnitLength: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kernelUnitLength != null) obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKernelUnitLengthDouble(kernelUnitLength: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kernelUnitLength != null) obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKerningString(kerning: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kerning != null) obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKerningDouble(kerning: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (kerning != null) obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeyPointsString(keyPoints: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keyPoints != null) obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeyPointsDouble(keyPoints: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keyPoints != null) obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeySplinesString(keySplines: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keySplines != null) obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeySplinesDouble(keySplines: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keySplines != null) obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeyTimesString(keyTimes: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keyTimes != null) obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withKeyTimesDouble(keyTimes: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (keyTimes != null) obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLang(lang: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lang != null) obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLengthAdjustString(lengthAdjust: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lengthAdjust != null) obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLengthAdjustDouble(lengthAdjust: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lengthAdjust != null) obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLetterSpacingString(letterSpacing: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (letterSpacing != null) obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLetterSpacingDouble(letterSpacing: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (letterSpacing != null) obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLightingColorString(lightingColor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lightingColor != null) obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLightingColorDouble(lightingColor: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (lightingColor != null) obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLimitingConeAngleString(limitingConeAngle: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (limitingConeAngle != null) obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLimitingConeAngleDouble(limitingConeAngle: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (limitingConeAngle != null) obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLocalString(local: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (local != null) obj.updateDynamic("local")(local.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withLocalDouble(local: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (local != null) obj.updateDynamic("local")(local.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerEnd(markerEnd: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerEnd != null) obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerHeightString(markerHeight: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerHeight != null) obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerHeightDouble(markerHeight: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerHeight != null) obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerMid(markerMid: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerMid != null) obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerStart(markerStart: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerStart != null) obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerUnitsString(markerUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerUnits != null) obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerUnitsDouble(markerUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerUnits != null) obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerWidthString(markerWidth: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerWidth != null) obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMarkerWidthDouble(markerWidth: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (markerWidth != null) obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMask(mask: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mask != null) obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaskContentUnitsString(maskContentUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maskContentUnits != null) obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaskContentUnitsDouble(maskContentUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maskContentUnits != null) obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaskUnitsString(maskUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maskUnits != null) obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaskUnitsDouble(maskUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (maskUnits != null) obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMathematicalString(mathematical: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mathematical != null) obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMathematicalDouble(mathematical: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mathematical != null) obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaxString(max: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (max != null) obj.updateDynamic("max")(max.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMaxDouble(max: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (max != null) obj.updateDynamic("max")(max.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMedia(media: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (media != null) obj.updateDynamic("media")(media.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMethod(method: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (method != null) obj.updateDynamic("method")(method.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMinString(min: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (min != null) obj.updateDynamic("min")(min.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withMinDouble(min: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (min != null) obj.updateDynamic("min")(min.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withModeString(mode: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mode != null) obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withModeDouble(mode: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mode != null) obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withName(name: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withNumOctavesString(numOctaves: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (numOctaves != null) obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withNumOctavesDouble(numOctaves: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (numOctaves != null) obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOffsetString(offset: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (offset != null) obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOffsetDouble(offset: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (offset != null) obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOpacityString(opacity: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (opacity != null) obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOpacityDouble(opacity: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (opacity != null) obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOperatorString(operator: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (operator != null) obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOperatorDouble(operator: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (operator != null) obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrderString(order: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (order != null) obj.updateDynamic("order")(order.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrderDouble(order: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (order != null) obj.updateDynamic("order")(order.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrientString(orient: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (orient != null) obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrientDouble(orient: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (orient != null) obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrientationString(orientation: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (orientation != null) obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOrientationDouble(orientation: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (orientation != null) obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOriginString(origin: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (origin != null) obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOriginDouble(origin: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (origin != null) obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverflowString(overflow: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overflow != null) obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverflowDouble(overflow: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overflow != null) obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverlinePositionString(overlinePosition: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overlinePosition != null) obj.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverlinePositionDouble(overlinePosition: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overlinePosition != null) obj.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverlineThicknessString(overlineThickness: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overlineThickness != null) obj.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withOverlineThicknessDouble(overlineThickness: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (overlineThickness != null) obj.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPaintOrderString(paintOrder: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (paintOrder != null) obj.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPaintOrderDouble(paintOrder: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (paintOrder != null) obj.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPanose1String(panose1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panose1 != null) obj.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPanose1Double(panose1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (panose1 != null) obj.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPathLengthString(pathLength: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pathLength != null) obj.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPathLengthDouble(pathLength: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pathLength != null) obj.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPatternContentUnits(patternContentUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (patternContentUnits != null) obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPatternTransformString(patternTransform: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (patternTransform != null) obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPatternTransformDouble(patternTransform: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (patternTransform != null) obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPatternUnits(patternUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (patternUnits != null) obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointerEventsString(pointerEvents: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointerEvents != null) obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointerEventsDouble(pointerEvents: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointerEvents != null) obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPoints(points: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (points != null) obj.updateDynamic("points")(points.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtXString(pointsAtX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtX != null) obj.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtXDouble(pointsAtX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtX != null) obj.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtYString(pointsAtY: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtY != null) obj.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtYDouble(pointsAtY: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtY != null) obj.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtZString(pointsAtZ: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtZ != null) obj.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPointsAtZDouble(pointsAtZ: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (pointsAtZ != null) obj.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPreserveAlphaString(preserveAlpha: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (preserveAlpha != null) obj.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPreserveAlphaDouble(preserveAlpha: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (preserveAlpha != null) obj.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPreserveAspectRatio(preserveAspectRatio: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (preserveAspectRatio != null) obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPrimitiveUnitsString(primitiveUnits: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (primitiveUnits != null) obj.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withPrimitiveUnitsDouble(primitiveUnits: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (primitiveUnits != null) obj.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRString(r: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (r != null) obj.updateDynamic("r")(r.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRDouble(r: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (r != null) obj.updateDynamic("r")(r.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRadiusString(radius: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radius != null) obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRadiusDouble(radius: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (radius != null) obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRefXString(refX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (refX != null) obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRefXDouble(refX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (refX != null) obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRefYString(refY: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (refY != null) obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRefYDouble(refY: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (refY != null) obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRenderingIntentString(renderingIntent: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (renderingIntent != null) obj.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRenderingIntentDouble(renderingIntent: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (renderingIntent != null) obj.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRepeatCountString(repeatCount: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (repeatCount != null) obj.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRepeatCountDouble(repeatCount: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (repeatCount != null) obj.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRepeatDurString(repeatDur: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (repeatDur != null) obj.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRepeatDurDouble(repeatDur: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (repeatDur != null) obj.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRequiredExtensionsString(requiredExtensions: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (requiredExtensions != null) obj.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRequiredExtensionsDouble(requiredExtensions: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (requiredExtensions != null) obj.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRequiredFeaturesString(requiredFeatures: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (requiredFeatures != null) obj.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRequiredFeaturesDouble(requiredFeatures: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (requiredFeatures != null) obj.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRestartString(restart: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (restart != null) obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRestartDouble(restart: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (restart != null) obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withResult(result: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (result != null) obj.updateDynamic("result")(result.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRole(role: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (role != null) obj.updateDynamic("role")(role.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRotateString(rotate: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (rotate != null) obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRotateDouble(rotate: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (rotate != null) obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRxString(rx: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (rx != null) obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRxDouble(rx: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (rx != null) obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRyString(ry: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ry != null) obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withRyDouble(ry: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (ry != null) obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withScaleString(scale: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (scale != null) obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withScaleDouble(scale: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (scale != null) obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSeedString(seed: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (seed != null) obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSeedDouble(seed: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (seed != null) obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withShapeRenderingString(shapeRendering: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (shapeRendering != null) obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withShapeRenderingDouble(shapeRendering: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (shapeRendering != null) obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSlopeString(slope: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slope != null) obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSlopeDouble(slope: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (slope != null) obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpacingString(spacing: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (spacing != null) obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpacingDouble(spacing: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (spacing != null) obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpecularConstantString(specularConstant: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (specularConstant != null) obj.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpecularConstantDouble(specularConstant: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (specularConstant != null) obj.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpecularExponentString(specularExponent: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (specularExponent != null) obj.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpecularExponentDouble(specularExponent: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (specularExponent != null) obj.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpeedString(speed: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (speed != null) obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpeedDouble(speed: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (speed != null) obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSpreadMethod(spreadMethod: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (spreadMethod != null) obj.updateDynamic("spreadMethod")(spreadMethod.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStartOffsetString(startOffset: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (startOffset != null) obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStartOffsetDouble(startOffset: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (startOffset != null) obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStdDeviationString(stdDeviation: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stdDeviation != null) obj.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStdDeviationDouble(stdDeviation: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stdDeviation != null) obj.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStemhString(stemh: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stemh != null) obj.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStemhDouble(stemh: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stemh != null) obj.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStemvString(stemv: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stemv != null) obj.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStemvDouble(stemv: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stemv != null) obj.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStitchTilesString(stitchTiles: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stitchTiles != null) obj.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStitchTilesDouble(stitchTiles: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stitchTiles != null) obj.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStopColor(stopColor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stopColor != null) obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStopOpacityString(stopOpacity: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stopOpacity != null) obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStopOpacityDouble(stopOpacity: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stopOpacity != null) obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrikethroughPositionString(strikethroughPosition: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strikethroughPosition != null) obj.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrikethroughPositionDouble(strikethroughPosition: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strikethroughPosition != null) obj.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrikethroughThicknessString(strikethroughThickness: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strikethroughThickness != null) obj.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrikethroughThicknessDouble(strikethroughThickness: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strikethroughThickness != null) obj.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStringString(string: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (string != null) obj.updateDynamic("string")(string.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStringDouble(string: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (string != null) obj.updateDynamic("string")(string.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStroke(stroke: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (stroke != null) obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeDasharrayString(strokeDasharray: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeDasharray != null) obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeDasharrayDouble(strokeDasharray: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeDasharray != null) obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeDashoffsetString(strokeDashoffset: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeDashoffset != null) obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeDashoffsetDouble(strokeDashoffset: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeDashoffset != null) obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinecapSquare(strokeLinecap: square): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinecap != null) obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinecapInherit(strokeLinecap: inherit): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinecap != null) obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinecapRound(strokeLinecap: round): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinecap != null) obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinecapButt(strokeLinecap: butt): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinecap != null) obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinejoinInherit(strokeLinejoin: inherit): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinejoin != null) obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinejoinRound(strokeLinejoin: round): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinejoin != null) obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinejoinBevel(strokeLinejoin: bevel): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinejoin != null) obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeLinejoinMiter(strokeLinejoin: miter): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeLinejoin != null) obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeMiterlimitString(strokeMiterlimit: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeMiterlimit != null) obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeMiterlimitDouble(strokeMiterlimit: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeMiterlimit != null) obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeOpacityString(strokeOpacity: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeOpacity != null) obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeOpacityDouble(strokeOpacity: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeOpacity != null) obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeWidthString(strokeWidth: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeWidth != null) obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStrokeWidthDouble(strokeWidth: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (strokeWidth != null) obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withStyle(style: CSSProperties): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (style != null) obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSurfaceScaleString(surfaceScale: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (surfaceScale != null) obj.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSurfaceScaleDouble(surfaceScale: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (surfaceScale != null) obj.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSystemLanguageString(systemLanguage: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (systemLanguage != null) obj.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withSystemLanguageDouble(systemLanguage: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (systemLanguage != null) obj.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTabIndexInt(tabIndex: Int): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tabIndex != null) obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTableValuesString(tableValues: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tableValues != null) obj.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTableValuesDouble(tableValues: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (tableValues != null) obj.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTarget(target: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (target != null) obj.updateDynamic("target")(target.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTargetXString(targetX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (targetX != null) obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTargetXDouble(targetX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (targetX != null) obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTargetYString(targetY: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (targetY != null) obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTargetYDouble(targetY: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (targetY != null) obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextAnchor(textAnchor: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textAnchor != null) obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextDecorationString(textDecoration: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textDecoration != null) obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextDecorationDouble(textDecoration: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textDecoration != null) obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextLengthString(textLength: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textLength != null) obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextLengthDouble(textLength: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textLength != null) obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextRenderingString(textRendering: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textRendering != null) obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTextRenderingDouble(textRendering: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (textRendering != null) obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withToString(to: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (to != null) obj.updateDynamic("to")(to.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withToDouble(to: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (to != null) obj.updateDynamic("to")(to.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withTransform(transform: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (transform != null) obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withType(`type`: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`type` != null) obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withU1String(u1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (u1 != null) obj.updateDynamic("u1")(u1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withU1Double(u1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (u1 != null) obj.updateDynamic("u1")(u1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withU2String(u2: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (u2 != null) obj.updateDynamic("u2")(u2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withU2Double(u2: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (u2 != null) obj.updateDynamic("u2")(u2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnderlinePositionString(underlinePosition: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (underlinePosition != null) obj.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnderlinePositionDouble(underlinePosition: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (underlinePosition != null) obj.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnderlineThicknessString(underlineThickness: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (underlineThickness != null) obj.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnderlineThicknessDouble(underlineThickness: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (underlineThickness != null) obj.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeString(unicode: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicode != null) obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeDouble(unicode: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicode != null) obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeBidiString(unicodeBidi: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicodeBidi != null) obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeBidiDouble(unicodeBidi: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicodeBidi != null) obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeRangeString(unicodeRange: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicodeRange != null) obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnicodeRangeDouble(unicodeRange: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unicodeRange != null) obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnitsPerEmString(unitsPerEm: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unitsPerEm != null) obj.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withUnitsPerEmDouble(unitsPerEm: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (unitsPerEm != null) obj.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVAlphabeticString(vAlphabetic: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vAlphabetic != null) obj.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVAlphabeticDouble(vAlphabetic: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vAlphabetic != null) obj.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVHangingString(vHanging: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vHanging != null) obj.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVHangingDouble(vHanging: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vHanging != null) obj.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVIdeographicString(vIdeographic: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vIdeographic != null) obj.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVIdeographicDouble(vIdeographic: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vIdeographic != null) obj.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVMathematicalString(vMathematical: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vMathematical != null) obj.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVMathematicalDouble(vMathematical: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vMathematical != null) obj.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withValues(values: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (values != null) obj.updateDynamic("values")(values.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVectorEffectString(vectorEffect: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vectorEffect != null) obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVectorEffectDouble(vectorEffect: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vectorEffect != null) obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVersion(version: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (version != null) obj.updateDynamic("version")(version.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertAdvYString(vertAdvY: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertAdvY != null) obj.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertAdvYDouble(vertAdvY: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertAdvY != null) obj.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertOriginXString(vertOriginX: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertOriginX != null) obj.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertOriginXDouble(vertOriginX: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertOriginX != null) obj.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertOriginYString(vertOriginY: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertOriginY != null) obj.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVertOriginYDouble(vertOriginY: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (vertOriginY != null) obj.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withViewBox(viewBox: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (viewBox != null) obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withViewTargetString(viewTarget: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (viewTarget != null) obj.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withViewTargetDouble(viewTarget: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (viewTarget != null) obj.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVisibilityString(visibility: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (visibility != null) obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withVisibilityDouble(visibility: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (visibility != null) obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWidthString(width: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (width != null) obj.updateDynamic("width")(width.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWidthDouble(width: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (width != null) obj.updateDynamic("width")(width.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWidthsString(widths: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (widths != null) obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWidthsDouble(widths: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (widths != null) obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWordSpacingString(wordSpacing: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (wordSpacing != null) obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWordSpacingDouble(wordSpacing: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (wordSpacing != null) obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWritingModeString(writingMode: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (writingMode != null) obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withWritingModeDouble(writingMode: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (writingMode != null) obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXString(x: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x != null) obj.updateDynamic("x")(x.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXDouble(x: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x != null) obj.updateDynamic("x")(x.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withX1String(x1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x1 != null) obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withX1Double(x1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x1 != null) obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withX2String(x2: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x2 != null) obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withX2Double(x2: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (x2 != null) obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXChannelSelector(xChannelSelector: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xChannelSelector != null) obj.updateDynamic("xChannelSelector")(xChannelSelector.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXHeightString(xHeight: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xHeight != null) obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXHeightDouble(xHeight: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xHeight != null) obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkActuate(xlinkActuate: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkActuate != null) obj.updateDynamic("xlinkActuate")(xlinkActuate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkArcrole(xlinkArcrole: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkArcrole != null) obj.updateDynamic("xlinkArcrole")(xlinkArcrole.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkHref(xlinkHref: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkHref != null) obj.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkRole(xlinkRole: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkRole != null) obj.updateDynamic("xlinkRole")(xlinkRole.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkShow(xlinkShow: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkShow != null) obj.updateDynamic("xlinkShow")(xlinkShow.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkTitle(xlinkTitle: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkTitle != null) obj.updateDynamic("xlinkTitle")(xlinkTitle.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXlinkType(xlinkType: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xlinkType != null) obj.updateDynamic("xlinkType")(xlinkType.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXmlBase(xmlBase: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xmlBase != null) obj.updateDynamic("xmlBase")(xmlBase.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXmlLang(xmlLang: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xmlLang != null) obj.updateDynamic("xmlLang")(xmlLang.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXmlSpace(xmlSpace: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xmlSpace != null) obj.updateDynamic("xmlSpace")(xmlSpace.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXmlns(xmlns: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xmlns != null) obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withXmlnsXlink(xmlnsXlink: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (xmlnsXlink != null) obj.updateDynamic("xmlnsXlink")(xmlnsXlink.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withYString(y: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (y != null) obj.updateDynamic("y")(y.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withYDouble(y: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (y != null) obj.updateDynamic("y")(y.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withY1String(y1: String): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (y1 != null) obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
    @scala.inline
    def withY1Double(y1: Double): SVGAttributes[T] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (y1 != null) obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.SVGAttributes[T]]
    }
  }
  
}

