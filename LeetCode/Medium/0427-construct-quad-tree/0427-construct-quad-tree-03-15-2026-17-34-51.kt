/**
 * Definition for a QuadTree node.
 * class Node(var `val`: Boolean, var isLeaf: Boolean) {
 *     var topLeft: Node? = null
 *     var topRight: Node? = null
 *     var bottomLeft: Node? = null
 *     var bottomRight: Node? = null
 * }
 */

class Solution {
    fun construct(grid: Array<IntArray>): Node? {
        
        fun dfs(n : Int, r : Int, c : Int) : Node {
            var same = true
            for(i in 0 until n){
                for(j in 0 until n){
                    if(grid[r][c] != grid[r+i][c+j]){
                        same = false
                        break
                    }
                }
            }

            if(same) return Node(if(grid[r][c] == 1) true else false,true)

            val n1 = n / 2
            val tl = dfs(n1, r, c)
            val tr = dfs(n1, r, c + n1)
            val bl = dfs(n1, r + n1, c)
            val br = dfs(n1, r + n1, c + n1)

            return Node(false,false).apply{
                topLeft = tl
                topRight = tr
                bottomLeft = bl
                bottomRight = br
            }
        }

        return dfs(grid.size,0,0)
    }
}