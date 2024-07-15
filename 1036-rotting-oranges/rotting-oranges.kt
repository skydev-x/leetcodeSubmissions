class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        var fresh = 0
        val queue = ArrayDeque<Pair<Int,Int>>()
        var time = 0
        for(i in grid.indices){
            for(j in grid[0].indices){
                if(grid[i][j] == 1){
                    fresh++
                } 
                if(grid[i][j] == 2){
                    queue.addFirst(Pair(i,j))
                }
            }
        }

        if(fresh == 0) return 0

        val direction = listOf(
            Pair(1,0),Pair(-1,0),Pair(0,1),Pair(0,-1)
        )


        while(queue.isNotEmpty()){
            for(i in 0 until queue.size){
                val cur = queue.removeLast()
                for(d in direction){ 
                    val row = cur.first + d.first
                    val col = cur.second + d.second
                    if(row < 0 || row >= grid.size || col < 0 || col >= grid[0].size || grid[row][col] != 1){
                        continue
                    }
                    if (grid[row][col] == 1){
                        grid[row][col] = 2
                        fresh--
                        queue.addFirst(Pair(row,col))
                    } 
                }
            }
            time++
            if(fresh == 0) return time
        }



        return -1


    }
}