package typings.react.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentSpec[P, S]
  extends Mixin[P, S]
     with /* propertyName */ StringDictionary[js.Any] {
  def render(): ReactNode = js.native
}

object ComponentSpec {
  @scala.inline
  def apply[P, S](
    render: () => ReactNode,
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null,
    UNSAFE_componentWillMount: () => Unit = null,
    UNSAFE_componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit = null,
    UNSAFE_componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit = null,
    childContextTypes: ValidationMap[_] = null,
    componentDidCatch: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Error */ /* error */ js.Any, /* errorInfo */ ErrorInfo) => Unit = null,
    componentDidMount: () => Unit = null,
    componentDidUpdate: (P, S, /* snapshot */ js.UndefOr[js.Any]) => Unit = null,
    componentWillMount: () => Unit = null,
    componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit = null,
    componentWillUnmount: () => Unit = null,
    componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit = null,
    contextTypes: ValidationMap[_] = null,
    displayName: String = null,
    getDefaultProps: () => P = null,
    getInitialState: () => S = null,
    getSnapshotBeforeUpdate: (P, S) => js.Any | Null = null,
    mixins: js.Array[Mixin[P, S]] = null,
    propTypes: ValidationMap[_] = null,
    shouldComponentUpdate: (P, S, /* nextContext */ js.Any) => Boolean = null,
    statics: StringDictionary[js.Any] = null
  ): ComponentSpec[P, S] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(js.Any.fromFunction0(UNSAFE_componentWillMount))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2(UNSAFE_componentWillReceiveProps))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3(UNSAFE_componentWillUpdate))
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes.asInstanceOf[js.Any])
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (getDefaultProps != null) __obj.updateDynamic("getDefaultProps")(js.Any.fromFunction0(getDefaultProps))
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(js.Any.fromFunction0(getInitialState))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSpec[P, S]]
  }
  @scala.inline
  implicit sealed class Sugar[P, S] (x: ComponentSpec[P, S]) {
    @scala.inline
    def duplicate: ComponentSpec[P, S] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (ComponentSpec[P, S]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentSpec[P, S] with T]
    @scala.inline
    def withRender(render: () => ReactNode): ComponentSpec[P, S] = js.Dynamic.global.Object.assign(js.Dynamic.literal(render = js.Any.fromFunction0(render)), x).asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    @scala.inline
    def withStringDictionary(StringDictionary: /* propertyName */ StringDictionary[js.Any]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (StringDictionary != null) js.Dynamic.global.Object.assign(obj, StringDictionary)
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withUNSAFE_componentWillMount(UNSAFE_componentWillMount: () => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (UNSAFE_componentWillMount != null) obj.updateDynamic("UNSAFE_componentWillMount")(js.Any.fromFunction0(UNSAFE_componentWillMount))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withUNSAFE_componentWillReceiveProps(UNSAFE_componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (UNSAFE_componentWillReceiveProps != null) obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2(UNSAFE_componentWillReceiveProps))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withUNSAFE_componentWillUpdate(UNSAFE_componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (UNSAFE_componentWillUpdate != null) obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3(UNSAFE_componentWillUpdate))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withChildContextTypes(childContextTypes: ValidationMap[_]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (childContextTypes != null) obj.updateDynamic("childContextTypes")(childContextTypes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentDidCatch(
      componentDidCatch: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Error */ /* error */ js.Any, /* errorInfo */ ErrorInfo) => Unit
    ): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentDidCatch != null) obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentDidMount(componentDidMount: () => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentDidMount != null) obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentDidUpdate(componentDidUpdate: (P, S, /* snapshot */ js.UndefOr[js.Any]) => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentDidUpdate != null) obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentWillMount(componentWillMount: () => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentWillMount != null) obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentWillReceiveProps(componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentWillReceiveProps != null) obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentWillUnmount(componentWillUnmount: () => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentWillUnmount != null) obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withComponentWillUpdate(componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (componentWillUpdate != null) obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withContextTypes(contextTypes: ValidationMap[_]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (contextTypes != null) obj.updateDynamic("contextTypes")(contextTypes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withDisplayName(displayName: String): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (displayName != null) obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withGetDefaultProps(getDefaultProps: () => P): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getDefaultProps != null) obj.updateDynamic("getDefaultProps")(js.Any.fromFunction0(getDefaultProps))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withGetInitialState(getInitialState: () => S): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getInitialState != null) obj.updateDynamic("getInitialState")(js.Any.fromFunction0(getInitialState))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withGetSnapshotBeforeUpdate(getSnapshotBeforeUpdate: (P, S) => js.Any | Null): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getSnapshotBeforeUpdate != null) obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withMixins(mixins: js.Array[Mixin[P, S]]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mixins != null) obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withPropTypes(propTypes: ValidationMap[_]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (propTypes != null) obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withShouldComponentUpdate(shouldComponentUpdate: (P, S, /* nextContext */ js.Any) => Boolean): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (shouldComponentUpdate != null) obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
    @scala.inline
    def withStatics(statics: StringDictionary[js.Any]): ComponentSpec[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (statics != null) obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.react.mod.ComponentSpec[P, S]]
    }
  }
  
}

