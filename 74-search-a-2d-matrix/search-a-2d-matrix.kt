class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return false

        var sv = 0
        var ev = matrix.size - 1

        while (sv <= ev) {
            val mid = sv + (ev - sv) / 2
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].size - 1]) {
                sv = mid
                break
            } else if (matrix[mid][0] > target) {
                ev = mid - 1
            } else {
                sv = mid + 1
            }
        }

        if (sv >= matrix.size) return false

        val row = matrix[sv]
        var s = 0
        var e = row.size - 1

        while (s <= e) {
            val mid = s + (e - s) / 2
            when {
                row[mid] < target -> s = mid + 1
                row[mid] > target -> e = mid - 1
                else -> return true
            }
        }

        return false
    }

}