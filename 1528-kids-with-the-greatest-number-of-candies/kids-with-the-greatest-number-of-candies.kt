class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val iMax = findMax(candies)
        return candies.map {
            it + extraCandies >= iMax
        }.toList()
    }

    fun findMax(arr : IntArray) : Int {
        var max = -1
        for(i in arr){
            if(i > max){
                max = i
            }
        }
        return max
    }
}