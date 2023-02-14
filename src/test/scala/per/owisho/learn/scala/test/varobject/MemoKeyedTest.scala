package scala.per.owisho.learn.scala.test.varobject

import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalTime
import scala.per.owisho.learn.scala.varobject.{Keyed, MemoKeyed}

class MemoKeyedTest extends AnyFunSuite {

  test("test same result") {
    val keyed = new Keyed
    val memoKeyed = new MemoKeyed
    assertResult(keyed.computeKey)(memoKeyed.computeKey)
  }

  test("test time cost") {
    val keyed = new Keyed
    val memoKeyed = new MemoKeyed
    val c1 = timeCost(keyed.computeKey)
    timeCost(memoKeyed.computeKey)
    val c3 = timeCost(memoKeyed.computeKey)
    println(c1)
    println(c3)
    assert(c3 <= c1)
  }

  private def timeCost(f: => Unit): Long = {
    val s1 = System.currentTimeMillis()
    f
    val e1 = System.currentTimeMillis()
    e1 - s1
  }
}
