/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec() {
	// Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        fun pre(root: TreeNode?): String {
            if (root == null) {
                return "N"
            }
            return "${root.`val`},${pre(root.left)},${pre(root.right)}"
        }
        return pre(root)
    }


    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val nodes = data.split(",").iterator()

        fun buildTree(): TreeNode? {
            if (!nodes.hasNext()) return null
            val value = nodes.next()
            if (value == "N") return null
            val node = TreeNode(value.toInt())
            node.left = buildTree()
            node.right = buildTree()
            return node
        }

        return buildTree()
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var ser = Codec()
 * var deser = Codec()
 * var data = ser.serialize(longUrl)
 * var ans = deser.deserialize(data)
 */