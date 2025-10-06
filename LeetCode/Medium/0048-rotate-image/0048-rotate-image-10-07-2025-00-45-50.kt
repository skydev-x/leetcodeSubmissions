class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val rows = matrix.lastIndex
        val cols = matrix[0].lastIndex
        for(i in 0..rows){
            for(j in i+1..cols){                
                matrix[i][j] = matrix[j][i].also {
                    matrix[j][i] = matrix[i][j]
                }               
            }
        }
        for(i in 0..rows) {matrix[i].reverse()}
    }
}