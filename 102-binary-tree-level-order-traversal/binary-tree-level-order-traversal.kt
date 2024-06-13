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
        val queue = ArrayDeque<TreeNode>()
        
        if (root == null) {
            return result
        }
        
        queue.addLast(root)
        
        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            val cur = mutableListOf<Int>()
            
            for (i in 0 until levelSize) {
                val node = queue.removeFirst()
                cur.add(node.`val`)
                
                if (node.left != null) {
                    queue.addLast(node.left)
                }
                if (node.right != null) {
                    queue.addLast(node.right)
                }
            }
            
            result.add(cur)
        }
        
        return result
    }
}
