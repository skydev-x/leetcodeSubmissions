class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val freq = mutableMapOf<Int,Int>()
        for(n in nums){
            freq[n] = freq.getOrPut(n) { 0 } + 1
        }
        val t = nums.size / 3
        return freq.filter { it.value > t }.map { it.key }
    }
}