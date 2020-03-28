package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPropTypes extends js.Object {
  var any: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.any */ js.Any = js.native
  var array: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.array */ js.Any = js.native
  var arrayOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.arrayOf */ js.Any = js.native
  var bool: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.bool */ js.Any = js.native
  var element: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.element */ js.Any = js.native
  var exact: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.exact */ js.Any = js.native
  var func: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.func */ js.Any = js.native
  var instanceOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.instanceOf */ js.Any = js.native
  var node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.node */ js.Any = js.native
  var number: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.number */ js.Any = js.native
  var `object`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.object */ js.Any = js.native
  var objectOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.objectOf */ js.Any = js.native
  var oneOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOf */ js.Any = js.native
  var oneOfType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOfType */ js.Any = js.native
  var shape: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.shape */ js.Any = js.native
  var string: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.string */ js.Any = js.native
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.any */ js.Any,
    array: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.array */ js.Any,
    arrayOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.arrayOf */ js.Any,
    bool: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.bool */ js.Any,
    element: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.element */ js.Any,
    exact: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.exact */ js.Any,
    func: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.func */ js.Any,
    instanceOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.instanceOf */ js.Any,
    node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.node */ js.Any,
    number: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.number */ js.Any,
    `object`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.object */ js.Any,
    objectOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.objectOf */ js.Any,
    oneOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOf */ js.Any,
    oneOfType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOfType */ js.Any,
    shape: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.shape */ js.Any,
    string: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.string */ js.Any
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
  @scala.inline
  implicit sealed class Sugar (x: ReactPropTypes) {
    @scala.inline
    def duplicate: ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): ReactPropTypes with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ReactPropTypes with T]
    @scala.inline
    def withAny(any: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.any */ js.Any): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(any = any.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withArray(
      array: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.array */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(array = array.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withArrayOf(
      arrayOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.arrayOf */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(arrayOf = arrayOf.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withBool(
      bool: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.bool */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(bool = bool.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withElement(
      element: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.element */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(element = element.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withExact(
      exact: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.exact */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(exact = exact.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withFunc(
      func: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.func */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(func = func.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withInstanceOf(
      instanceOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.instanceOf */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(instanceOf = instanceOf.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withNode(
      node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.node */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(node = node.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withNumber(
      number: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.number */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(number = number.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withObject(
      `object`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.object */ js.Any
    ): ReactPropTypes = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ReactPropTypes]
    }
    @scala.inline
    def withObjectOf(
      objectOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.objectOf */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(objectOf = objectOf.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withOneOf(
      oneOf: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOf */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withOneOfType(
      oneOfType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.oneOfType */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(oneOfType = oneOfType.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withShape(
      shape: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.shape */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(shape = shape.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
    @scala.inline
    def withString(
      string: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PropTypes.string */ js.Any
    ): ReactPropTypes = js.Dynamic.global.Object.assign(js.Dynamic.literal(string = string.asInstanceOf[js.Any]), x).asInstanceOf[typings.react.mod.ReactPropTypes]
  }
  
}

