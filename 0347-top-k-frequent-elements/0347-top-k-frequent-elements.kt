class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = mutableMapOf<Int,Int>()
        nums.forEach{
            freq.put(it,freq.getOrDefault(it,0)+1)
        }
        return freq.entries.sortedByDescending {
            it.value
        }.map {
            it.key
        }.take(k).toIntArray()   
    }
}