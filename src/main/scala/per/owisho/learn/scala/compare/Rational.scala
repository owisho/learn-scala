class Rational(n:Int,d:Int) extends Ordered[Rational]{
  val numer = n
  val denom = d
  def compare(that: Rational) = 
    this.numer * that.denom - that.numer * this.denom
}

object Rational{
  def main(args:Array[String]) = {
    val half = new Rational(1,2)
    val third = new Rational(1,3)
    println(half<third)
    println(third<half)
  }
}
