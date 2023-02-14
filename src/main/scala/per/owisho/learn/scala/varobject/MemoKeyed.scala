package scala.per.owisho.learn.scala.varobject

import java.time.Duration

//因为Keyed中computeKey没有读取、也没有写入任何var（Keyed是纯函数式的）
//所以MemoKeyed子类虽然有var变量的cache，但是也是纯函数式的
class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None

  override def computeKey: Int = {
    if (!keyCache.isDefined) keyCache = Some(super.computeKey)
    keyCache.get
  }
}

class Keyed {
  //假设computeKey中，既不读取也不写入任何var
  def computeKey: Int = {
    Thread.sleep(Duration.ofSeconds(2))
    10
  }
}