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
    fun isValidBST(root: TreeNode?): Boolean {
        return util(root)
    }

    fun util(n : TreeNode?,max : Long = Long.MAX_VALUE,min : Long = Long.MIN_VALUE) : Boolean {
        if(n == null){
            return true
        }
        if(!(n.`val` > min && n.`val` < max)) return false
        return util(n.left,(n.`val`).toLong(),min.toLong()) && util(n.right,max.toLong(),(n.`val`).toLong())
    }
}