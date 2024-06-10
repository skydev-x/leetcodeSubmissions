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
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null) return (subRoot == null)
        return isSameTree(root,subRoot) || isSubtree(root.left,subRoot)
        || isSubtree(root.right,subRoot)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(q == null && p != null) return false
        if(p == null && q != null) return false
        if(p == null && q == null) return true

        return if(p?.`val` == q?.`val`){
            isSameTree(q?.left,p?.left) && isSameTree(q?.right,p?.right)
        } else false
    }
}