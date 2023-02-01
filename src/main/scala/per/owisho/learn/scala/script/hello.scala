object HelloWorld{
  def main(args :Array[String]) = {
    args.foreach(arg=>println(arg))
    var i=0
    while(i<args.length){
      println(args(i))
      i+=1
    }
    if(args.length>0)
      println("Hello, "+args(0)+"!")
  }
}
