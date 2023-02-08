package scala.per.owisho.learn.scala.test
import org.scalatest.diagrams.Diagrams
import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite with Diagrams{
  test("An empty Set should have size 0") {
    assert(Set.empty.size === 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

  test("contain values"){
    assert(List(1,2,3).contains(4))
  }
}
