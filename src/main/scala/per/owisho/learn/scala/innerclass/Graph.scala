package per.owisho.learn.scala.innerclass

class Graph {

  class Node{
    var connectedNodes: List[Node] = Nil
    def connectTo(node:Node) :Unit = {
      if(!connectedNodes.exists(node.eq)){
       connectedNodes = node::connectedNodes
      }
    }
  }
  var nodes:List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }

}

object Graph{
  def main(args: Array[String]): Unit = {
    val graph1:Graph = new Graph
    val node1: graph1.Node = graph1.newNode
    val node2: graph1.Node = graph1.newNode
    val node3: graph1.Node = graph1.newNode

    node1.connectTo(node2)
    node3.connectTo(node1)

    val graph2:Graph = new Graph
    val node4:graph2.Node = graph2.newNode
//    node4.connectTo(node3)  无法编译通过，因为内部类绑定到具体的对象
  }
}