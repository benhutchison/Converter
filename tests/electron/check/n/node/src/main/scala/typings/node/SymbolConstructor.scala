package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolConstructor extends js.Object {
  val asyncIterator: js.Symbol = js.native
  val iterator: js.Symbol = js.native
}

object SymbolConstructor {
  @scala.inline
  def apply(asyncIterator: js.Symbol, iterator: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(asyncIterator = asyncIterator.asInstanceOf[js.Any], iterator = iterator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SymbolConstructor]
  }
  @scala.inline
  implicit sealed class Sugar (x: SymbolConstructor) {
    @scala.inline
    def duplicate: SymbolConstructor = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.node.SymbolConstructor]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): SymbolConstructor with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.node.SymbolConstructor with T]
    @scala.inline
    def withAsyncIterator(asyncIterator: js.Symbol): SymbolConstructor = js.Dynamic.global.Object.assign(js.Dynamic.literal(asyncIterator = asyncIterator.asInstanceOf[js.Any]), x).asInstanceOf[typings.node.SymbolConstructor]
    @scala.inline
    def withIterator(iterator: js.Symbol): SymbolConstructor = js.Dynamic.global.Object.assign(js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any]), x).asInstanceOf[typings.node.SymbolConstructor]
  }
  
}

