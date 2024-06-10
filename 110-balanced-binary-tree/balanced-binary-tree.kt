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
    fun isBalanced(root: TreeNode?): Boolean {
        return checkBalance(root) != -1
    }

    private fun checkBalance(node: TreeNode?): Int {
        if (node == null) return 0

        val leftHeight = checkBalance(node.left)
        if (leftHeight == -1) return -1

        val rightHeight = checkBalance(node.right)
        if (rightHeight == -1) return -1

        return if (abs(leftHeight - rightHeight) <= 1) {
            maxOf(leftHeight, rightHeight) + 1
        } else {
            -1
        }
    }
}