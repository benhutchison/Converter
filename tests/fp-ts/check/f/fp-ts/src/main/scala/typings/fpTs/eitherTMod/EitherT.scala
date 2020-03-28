package typings.fpTs.eitherTMod

import typings.fpTs.eitherMod.Either
import typings.fpTs.eitherMod.URI
import typings.fpTs.hktMod.HKT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EitherT[F] extends Foo[F, URI] {
  def chain[L, A, B](f: js.Function1[/* a */ A, HKT[F, Either[L, B]]], fa: HKT[F, Either[L, A]]): HKT[F, Either[L, B]] = js.native
}

object EitherT {
  @scala.inline
  def apply[F](
    chain: (js.Function1[js.Any, HKT[F, Either[js.Any, js.Any]]], HKT[F, Either[js.Any, js.Any]]) => HKT[F, Either[js.Any, js.Any]]
  ): EitherT[F] = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction2(chain))
  
    __obj.asInstanceOf[EitherT[F]]
  }
  @scala.inline
  implicit sealed class Sugar[F] (x: EitherT[F]) {
    @scala.inline
    def duplicate: EitherT[F] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.fpTs.eitherTMod.EitherT[F]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): EitherT[F] with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.fpTs.eitherTMod.EitherT[F] with T]
    @scala.inline
    def withChain(
      chain: (js.Function1[js.Any, HKT[F, Either[js.Any, js.Any]]], HKT[F, Either[js.Any, js.Any]]) => HKT[F, Either[js.Any, js.Any]]
    ): EitherT[F] = js.Dynamic.global.Object.assign(js.Dynamic.literal(chain = js.Any.fromFunction2(chain)), x).asInstanceOf[typings.fpTs.eitherTMod.EitherT[F]]
  }
  
}

