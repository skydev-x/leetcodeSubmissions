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
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty() || inorder.isEmpty()) {
            return null
        }

        val root = TreeNode(preorder[0])
        val mid = inorder.indexOf(preorder[0])

        root.left = buildTree(preorder.sliceArray(1..mid), inorder.sliceArray(0 until mid))
        root.right = buildTree(preorder.sliceArray(mid + 1 until preorder.size), inorder.sliceArray(mid + 1 until inorder.size))

        return root
    }
}