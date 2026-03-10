/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) return result
        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)
        while (queue.isNotEmpty()) {
            val level = mutableListOf<Int>()
            repeat(queue.size) {
                val cur = queue.removeFirst()
                level.add(cur.`val`)
                cur.left?.let { queue.addLast(it) }
                cur.right?.let { queue.addLast(it) }
            }
            result.add(level)
        }
        return result
    }
}