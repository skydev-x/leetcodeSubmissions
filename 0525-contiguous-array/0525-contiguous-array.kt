class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val size = nums.size
        var maxLen = 0
        val map = mutableMapOf(0 to -1)
        var count = 0
        for(i in 0 until size){
            count += if(nums[i] == 1) 1 else -1
            if(map.containsKey(count)){
                maxLen = maxOf(maxLen,i - map[count]!!)
            } else {
                map[count] = i
            }
        }

        return maxLen
    }
}