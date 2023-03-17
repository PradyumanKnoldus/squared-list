import SquaredList._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class squareListUsingPatternMatchingTests extends AnyFlatSpec with Matchers {

  "squareListUsingPatternMatching" should "return an empty list for null input" in {
    squareListUsingPatternMatching(null) shouldBe Nil
  }

  it should "return an empty list for an empty input list" in {
    squareListUsingPatternMatching(Nil) shouldBe Nil
  }

  it should "return a list of squared elements for a non-empty input list" in {
    squareListUsingPatternMatching(List(1, 2, 3, 4)) shouldBe List(1, 4, 9, 16)
  }
}
