package com.knoldus

case class Numbers(number: String, isEven: Boolean)

object SessionFourSurpriseTest extends App {
  val surpriseTestObject = new SessionFourSurpriseTest
  println("Even numbers with partition method: " + surpriseTestObject.evenNumbers)
  println("Odd numbers with partition method: " + surpriseTestObject.oddNumbers)
  println("Even numbers with filter method: " + surpriseTestObject.caseEvenList)
  println("Odd numbers with filterNot method: " + surpriseTestObject.caseOddList)
  println("Only the first element of even numbers: " + surpriseTestObject.caseEvenList.map(firstElement =>
    firstElement.number))
}

class SessionFourSurpriseTest {
  // using various predefined methods of list class
  private val listOfCaseClass: List[Numbers] = List(Numbers("1", false), Numbers("2", true), Numbers("3", false),
    Numbers("4", true), Numbers("5", false))

  private val caseEvenList = listOfCaseClass.filter(elements => (elements.isEven == true))
  private val caseOddList = listOfCaseClass.filterNot(elements => (elements.isEven == true))

  private val (evenNumbers, oddNumbers) = listOfCaseClass.partition(elements => (elements.isEven == true))

}
