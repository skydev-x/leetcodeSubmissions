/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    fun cloneGraph(node: Node?): Node? {
      if (node == null) return null
        
        val oldToNew = mutableMapOf<Node, Node>() 
           
        fun clone(node: Node?): Node? {
            if (node == null) return null
            if (node in oldToNew) return oldToNew[node]

            val copy = Node(node.`val`)
            oldToNew[node] = copy
            
            node.neighbors.forEach {
               copy.neighbors.add(clone(it))
            }
            return copy
        }
        
        return clone(node)
    }
}