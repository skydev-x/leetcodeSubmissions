class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val rows = matrix.size - 1
        val cols = matrix[0].size -1 
        for(i in 0..rows){
            for(j in i+1..cols){
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        for(i in 0..rows) {
            matrix[i].reverse()
        }
    }
}