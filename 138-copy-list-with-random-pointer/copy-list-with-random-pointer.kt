/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        
        if (node == null) return null

        val ranset = mutableMapOf<Node?,Node?>()

        var cur = node
        while(cur != null){
            val temp = Node(cur.`val`)
            ranset[cur] = temp
            cur = cur.next
        }
        
        cur = node
        while (cur != null) {
            ranset[cur]?.next = ranset[cur.next]
            ranset[cur]?.random = ranset[cur.random]
            cur = cur.next
        }


        return ranset[node]

    }


}