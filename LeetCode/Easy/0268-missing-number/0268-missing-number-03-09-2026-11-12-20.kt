class Solution {
    fun missingNumber(nums: IntArray): Int {
        val set = nums.toSet()
        for(i in 0..nums.size + 1){
            if(i !in set){
                return i
            }
        }
        return -1
    }
}