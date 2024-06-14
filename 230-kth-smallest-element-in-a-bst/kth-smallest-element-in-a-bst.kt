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

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val flat = mutableListOf<Int>()
        util(root,flat)
        return flat[k-1]
    }

    private fun util(r : TreeNode?,list : MutableList<Int>) {
        if(r == null) return 
        util(r.left,list)
        list.add(r.`val`)
        util(r.right,list)
    }


}