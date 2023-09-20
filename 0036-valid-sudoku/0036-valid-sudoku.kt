class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowSets = Array(9) { mutableSetOf<Char>() }
        val colSets = Array(9) { mutableSetOf<Char>() }
        val squareSets = Array(9) { mutableSetOf<Char>() }

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val cell = board[i][j]

                if (cell == '.') {
                    continue
                }

                if (cell in rowSets[i]) {
                    return false
                } else {
                    rowSets[i].add(cell)
                }

                if (cell in colSets[j]) {
                    return false
                } else {
                    colSets[j].add(cell)
                }
                val squareIdx = i / 3 * 3 + j / 3
                if (cell in squareSets[squareIdx]) {
                    return false
                } else {
                    squareSets[squareIdx].add(cell)
                }
            }
        }

        return true
    }

}