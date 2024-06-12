/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        
        // Ensure p is the smaller or equal value node
        if (p!!.`val` > q!!.`val`) {
            return lowestCommonAncestor(root, q, p)
        }
        
        // p <= q
        return when {
            root.`val` < p.`val` -> {
                // Both p and q are in the right subtree
                lowestCommonAncestor(root.right, p, q)
            }
            root.`val` > q.`val` -> {
                // Both p and q are in the left subtree
                lowestCommonAncestor(root.left, p, q)
            }
            else -> {
                // root is the lowest common ancestor
                root
            }
        }
    }
}