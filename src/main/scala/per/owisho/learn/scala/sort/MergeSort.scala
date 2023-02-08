object MergeSort {
  def merge[T](less:(T,T)=>Boolean)(xs:List[T],ys:List[T]) :List[T] = 
    (xs,ys) match {
      case (Nil,_) => ys
      case (_,Nil) => xs
      case (x :: xs1, y :: ys1) => 
        if(less(x,y)) x :: merge(less)(xs1,ys) else y :: merge(less)(xs,ys1)
    }
  
  def msort[T](less:(T,T)=>Boolean)(xs:List[T]):List[T] = {
    val n = xs.length/2
    if (n==0) xs
    else{
      val (xs1,xs2) = xs splitAt n
      merge(less)(msort(less)(xs1),msort(less)(xs2))
    }
  }
}
