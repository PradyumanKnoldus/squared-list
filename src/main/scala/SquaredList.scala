object SquaredList extends App {

  // To square the elements of an Integer List using Pattern Matching
  def squareListUsingPatternMatching(inputList: List[Int]): List[Int] = {
    if (inputList == null) {
      Nil
    } else {
      inputList match {
        case Nil => Nil
        case firstElement :: remainingList => (firstElement * firstElement) :: squareListUsingPatternMatching(remainingList)
      }
    }
  }

  // To square the elements of an Integer List using Map Function
  def squareListUsingMapFunction(inputList: List[Int]): List[Int] = {
    if (inputList == null) {
      Nil
    } else {
      inputList.map(element => element * element)
    }
  }

                             // To Show Exception Handling
  //----------------------------------------------------------------------------------


  def squareListWithExceptionHandling(inputList: List[Int]): List[Int] = {
    try {
      inputList.map(element => element * element)
    } catch {
      case _: NullPointerException => {
        println("List is Empty!")
        Nil
      }
    }
  }

  //----------------------------------------------------------------------------------

}
