abstract class Element{
  def contents:Array[String]
  def height = contents.length
  def width = if (contents.length==0) 0 else contents(0).length
  def above(that:Element):Element = new ArrayElement(this.contents ++ that.contents)
  /*
   * def beside(that:Element):Element = {
    val contents = new Array[String](this.contents.length)
    for (i <- 0 until this.contents.length)
      contents(i) = this.contents(i)+that.contents(i)
    new ArrayElement(contents)
  }*/
  def beside(that:Element):Element = {
    new ArrayElement(
      for (
        (line1,line2) <- this.contents zip that.contents
      ) yield line1+line2
    )
  }
  
  override def toString = contents mkString "\n"
}

class ArrayElement(val contents:Array[String]) extends Element

class LineElement(s:String) extends Element{
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(ch:Char,width:Int,height:Int) extends Element{
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}

object ElementDemo{
  def main(args:Array[String]):Unit = {
    val arr1 = Array(1,2,3)
    val arr2 = Array("a","b")
    (arr1 zip arr2).foreach(println)
    println("build success")
  }
}
