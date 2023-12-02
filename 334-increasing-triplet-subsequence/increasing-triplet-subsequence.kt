class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        if(nums.size < 3){
            return false
        }
        val n = nums.size - 1
        var left = Int.MAX_VALUE
        var mid = Int.MAX_VALUE
        for(i in 0..n){
            if(nums[i] <= left){
                left = nums[i]
            } else {
                if(nums[i] > mid){
                    return true
                } else {
                    mid = nums[i]
                }
            }
        }
        return false
    }
}