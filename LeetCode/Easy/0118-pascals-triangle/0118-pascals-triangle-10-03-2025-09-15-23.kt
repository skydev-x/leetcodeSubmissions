class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val row1 = listOf(1)
        val row2 = listOf(1,1)
        val result : MutableList<List<Int>> = mutableListOf()
        result.add(row1)
        if(numRows == 1){
            return result.toList()
        }
        result.add(row2)
        if(numRows == 2){
            return result.toList()
        }



        for(i in 1..(numRows-2)){
            val newRow : MutableList<Int> = mutableListOf()
            newRow.add(1)
            for(j in 0..result[i].size - 2){
                newRow.add(result[i][j] + result[i][j+1])
            }
            newRow.add(1)
            result.add(newRow)
        }

        return result

        
    }
}