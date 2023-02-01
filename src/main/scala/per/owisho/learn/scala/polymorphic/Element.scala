abstract class Element{
  def demo() = {
    println("Element's implementation invoked")
  }
}

class ArrayElement extends Element{
  override def demo() = {
    println("ArrayElement's implementation invoked")
  }
}

class LineElement extends ArrayElement{
  override def demo() = {
    println("LineElement's implementation invoked")
  }
}

class UniformElement extends Element

object ElementInvokeDemo{

  def invokeDemo(e:Element):Unit = {
    e.demo()
  }

  def main(args:Array[String]):Unit = {
    val e1 :Element = new ArrayElement()
    val e2 :Element = new LineElement()
    val e3 :Element = new UniformElement()
    
    invokeDemo(e1)
    invokeDemo(e2)
    invokeDemo(e3)

  }

}
