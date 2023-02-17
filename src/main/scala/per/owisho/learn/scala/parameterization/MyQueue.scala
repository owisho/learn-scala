package scala.per.owisho.learn.scala.parameterization

class MyQueue[T] private(private val leading: List[T], private val trailing: List[T]) {

}

object MyQueue {
  def apply[T](xs: T*): MyQueue[T] = new MyQueue(xs.toList, Nil)
}
