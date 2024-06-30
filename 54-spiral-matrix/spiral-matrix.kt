class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var start = 0
        var end = matrix[0].size - 1
        var top = 0
        var bottom = matrix.size - 1

        val result = mutableListOf<Int>()

        while((start <= end) && (top <= bottom)){
            for(i in start..end){
                result.add(matrix[top][i])
            }
            top++
            for(i in top..bottom){
                result.add(matrix[i][end])
            }
            end--
            if (top <= bottom) {
                for(i in end downTo start){
                    result.add(matrix[bottom][i])
                }
                bottom--
            }

            if (start <= end) {
                for(i in bottom downTo top){
                    result.add(matrix[i][start])
                }
                start++
            }

        }

        return result

    }
}