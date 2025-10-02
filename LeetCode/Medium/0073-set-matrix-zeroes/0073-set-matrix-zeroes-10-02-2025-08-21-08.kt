class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
val m = matrix.size
        val n = matrix[0].size
        val zeroRows = BooleanArray(m)
        val zeroCols = BooleanArray(n)
        
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true
                    zeroCols[j] = true
                }
            }
        }
        
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0
                }
            }
        }

    }


}