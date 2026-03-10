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
        val queue = ArrayDeque<TreeNode?>()
        queue.addLast(root)
        while(queue.isNotEmpty()){
            val level = mutableListOf<Int>()
            val levelSize = queue.size
            repeat(levelSize){
                val cur = queue.first()
                if(cur != null){
                    level.add(cur.`val`)
                    queue.addLast(cur.left)
                    queue.addLast(cur.right)
                }
                queue.removeFirst()
            }
            if(level.isNotEmpty()){
                result.add(level)
            }
        }
        return result
    }
}