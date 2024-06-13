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
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableMapOf<Int,Int>()
        util(root,0,result)
        return result.map { it.value }
    }

    fun util(node : TreeNode?,level : Int,result : MutableMap<Int,Int>) {
        if(node == null){
            return 
        }
        result[level] = node.`val`
        util(node.left,level + 1,result)
        util(node.right,level + 1,result)

    }
}