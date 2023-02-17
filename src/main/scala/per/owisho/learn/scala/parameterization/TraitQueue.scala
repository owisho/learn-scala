package scala.per.owisho.learn.scala.parameterization

trait TraitQueue[T] {
  def head: T

  def tail: TraitQueue[T]

  def enqueue(x: T): TraitQueue[T]
}

object Queue {

  private class QueueImpl[T] private(private val heading: List[T],
                                     private val trailing: List[T]
                                    ) extends TraitQueue[T] {
    def mirror: QueueImpl[T] = {
      if (heading.isEmpty)
        new QueueImpl[T](trailing.reverse, Nil)
      else
        this
    }

    override def head: T = mirror.heading.head

    override def tail: TraitQueue[T] = {
      val q = mirror
      new QueueImpl[T](q.heading.tail, q.trailing)
    }

    override def enqueue(x: T): TraitQueue[T] = new QueueImpl[T](heading, x :: trailing)
  }
}
