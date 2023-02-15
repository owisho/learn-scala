//package scala.per.owisho.learn.scala.varobject
//class Wire
//
//def inverter(input: Wire, output: Wire)
//def andGate(a1: Wire, a2: Wire, output: Wire)
//def orGate(o1: Wire, o2: Wire, output: Wire)
//
////半加器
////s = (a+b)%2  个人理解c为低位值
////c = (a+b)/2  个人理解c为进位值
////代码实例中d、e是中间产物
//def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire) = {
//  val d, e = new Wire
//  orGate(a, b, d)
//  andGate(a, b, c)
//  inverter(c, e)
//  andGate(d, e, s)
//}
//
////全加器
////sum = (a+b+cin)%2
////cout = (a+b+cin)/2
//def fullAdder(a: Wire, b: Wire, cin: Wire, sum: Wire, cout: Wire) = {
//  val s, c1, c2 = new Wire
//  halfAdder(a, cin, s, c1)
//  halfAdder(b, s, sum, c2)
//  orGate(c1, c2, cout)
//}