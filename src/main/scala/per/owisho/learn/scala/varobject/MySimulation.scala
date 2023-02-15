package scala.per.owisho.learn.scala.varobject

class MySimulation extends CircuitSimulation {
  def InverterDelay: Int = 1

  def AndGateDelay: Int = 3

  def OrGateDelay: Int = 5

  def test(): Unit = {
    val input1, input2, sum, carry = new Wire
    probe("sum", sum)
    probe("carry", carry)
    halfAdder(input1, input2, sum, carry)
    input1 setSignal true
    input2 setSignal true
    run()
  }
}

object MySimulation extends App {
  val m = new MySimulation
  m.test()
}
