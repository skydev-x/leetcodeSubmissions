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

 fun goodNodes(root: TreeNode?): Int {
        return util(root, Int.MIN_VALUE)
    }

    private fun util(node: TreeNode?, maxSoFar: Int): Int {
        if (node == null) return 0

        var good = 0
        if (node.`val` >= maxSoFar) {
            good = 1
        }

        val newMaxSoFar = maxOf(maxSoFar, node.`val`)
        good += util(node.left, newMaxSoFar)
        good += util(node.right, newMaxSoFar)

        return good
    }
}