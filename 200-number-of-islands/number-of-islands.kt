class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val lands = mutableMapOf<Pair<Int,Int>,Boolean>()
        for(i in grid.indices){
            for(j in grid[0].indices){
                if(grid[i][j] == '1'){
                    lands[Pair(i,j)] = false
                }
            }
        }
        var result = 0
        val directions = listOf(
            Pair(0, -1),
            Pair(0, 1),
            Pair(1, 0),
            Pair(-1, 0)
        )
        
        fun dfs(point: Pair<Int,Int>) {
            if (!lands.containsKey(point) || lands[point] == true) return
            
            lands[point] = true
            
            for (dir in directions) {
                val newPoint = Pair(point.first + dir.first, point.second + dir.second)
                dfs(newPoint)
            }
        }

        for (land in lands.keys) {
            if (lands[land] == false) {
                dfs(land)
                result++
            }
        }

        return result

    }
}