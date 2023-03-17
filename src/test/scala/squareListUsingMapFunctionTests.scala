import SquaredList._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class squareListUsingMapFunctionTests extends AnyFlatSpec with Matchers {

  "squareListUsingPatternMatching" should "return an empty list for null input" in {
    squareListUsingMapFunction(null) shouldBe Nil
  }

  it should "return an empty list for an empty input list" in {
    squareListUsingMapFunction(Nil) shouldBe Nil
  }

  it should "return a list of squared elements for a non-empty input list" in {
    squareListUsingMapFunction(List(1, 2, 3, 4)) shouldBe List(1, 4, 9, 16)
  }
}
