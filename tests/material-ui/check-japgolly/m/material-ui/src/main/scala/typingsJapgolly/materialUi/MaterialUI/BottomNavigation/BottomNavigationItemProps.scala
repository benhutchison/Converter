package typingsJapgolly.materialUi.MaterialUI.BottomNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomNavigationItemProps extends js.Object {
  var children: Double = js.native
  var className: js.UndefOr[String] = js.native
}

object BottomNavigationItemProps {
  @scala.inline
  def apply(children: Double, className: String = null): BottomNavigationItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationItemProps]
  }
  @scala.inline
  implicit sealed class Sugar (x: BottomNavigationItemProps) {
    @scala.inline
    def duplicate: BottomNavigationItemProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): BottomNavigationItemProps with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps with T]
    @scala.inline
    def withChildren(children: Double): BottomNavigationItemProps = js.Dynamic.global.Object.assign(js.Dynamic.literal(children = children.asInstanceOf[js.Any]), x).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps]
    @scala.inline
    def withClassName(className: String): BottomNavigationItemProps = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (className != null) obj.updateDynamic("className")(className.asInstanceOf[js.Any])
      obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps]
    }
  }
  
}

