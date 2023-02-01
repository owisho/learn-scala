abstract class Element{
  def demo() = {
    println("Element's implementation invoked")
  }
}

//final class ArrayElement extends Element{
//if class is decorated by keyword final, it can not have sub class
class ArrayElement extends Element{
  //final override def demo() = {
  //if method is decorated by keyword final, it can not be override by sub class
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
