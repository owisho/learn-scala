/**
 * 插入排序
 * 平均时间复杂度跟输入列表的长度平方成正比
 */
object Isort{
  def isort(xs:List[Int]):List[Int] = xs match {
    case List() => xs
    case y :: ys => insert(y, isort(ys))
  }

  private def insert(x:Int,xs:List[Int]):List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x<y) x :: xs else y :: insert(x,ys)
  }
}
