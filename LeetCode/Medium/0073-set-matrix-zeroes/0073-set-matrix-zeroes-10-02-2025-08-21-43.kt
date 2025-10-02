class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val m = matrix.size
        val n = matrix[0].size
        var zeroRow = false
        var zeroCol = false

        for(i in 0 until m) {
            if(matrix[i][0] == 0){
                zeroCol = true
            }
        }

        for(j in 0 until n) {
            if(matrix[0][j] == 0) {
                zeroRow = true
            }
        }
        
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0
                    matrix[i][0] = 0
                }
            }
        }
        
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0
                }
            }
        }

        if(zeroCol) {
            for(i in 0 until m) {
                matrix[i][0] = 0
            }
        }


        if(zeroRow) {
            for(i in 0 until n) {
                matrix[0][i] = 0
            }
        }

    }


}