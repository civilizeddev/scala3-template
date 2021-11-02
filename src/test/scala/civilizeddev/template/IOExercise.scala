package civilizeddev.template

import cats.effect.IO
import cats.effect.SyncIO
import munit.CatsEffectSuite

class IOExercise extends CatsEffectSuite {
  test("make sure IO computes the right result") {
    IO.pure(1).map(_ + 2).flatMap { result =>
      IO(assertEquals(result, 3))
    }
  }
}
