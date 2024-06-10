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

    var maxDiameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        calculateHeight(root)
        return maxDiameter
    }

    private fun calculateHeight(node: TreeNode?): Int {
        if (node == null) return 0

        val leftHeight = calculateHeight(node.left)
        val rightHeight = calculateHeight(node.right)

        maxDiameter = maxOf(maxDiameter, leftHeight + rightHeight)

        return maxOf(leftHeight, rightHeight) + 1
    }
}