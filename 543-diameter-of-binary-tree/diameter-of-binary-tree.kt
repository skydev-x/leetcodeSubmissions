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

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null){
            return 0
        }

        val ld = diameterOfBinaryTree(root.left)
        val rd = diameterOfBinaryTree(root.right)

        val lh = height(root.left)
        val rh = height(root.right)

        return maxOf((lh + rh ), maxOf(ld,rd))

    }

    fun height(root: TreeNode?): Int {
        if(root == null){
            return 0
        }
        val leftM = height(root.left)
        val rightM = height(root.right)

        return maxOf(leftM ,rightM ) + 1
    }

}