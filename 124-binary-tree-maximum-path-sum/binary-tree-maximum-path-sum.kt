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

    var max = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
       util(root)
       return max
    }

    fun util(root : TreeNode?) : Int {
        if(root == null) return 0
        val l = maxOf(0,util(root.left))
        val r = maxOf(0,util(root.right))
        max = maxOf(max, root.`val` + l + r)
        return root.`val` + maxOf(l,r)
    }
}