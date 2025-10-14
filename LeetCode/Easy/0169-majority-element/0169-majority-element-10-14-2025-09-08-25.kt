class Solution {
    fun majorityElement(nums: IntArray): Int {
        val freq = mutableMapOf<Int,Int>()
        for(n in nums){
            freq[n] = freq.getOrPut(n) { 0 } + 1
        }
        return freq.maxBy { it.value }.key
    }
}