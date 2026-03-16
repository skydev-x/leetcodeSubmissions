class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size) 
        var l = 0
        var r = nums.size - 1
        var t = r
        while(l <= r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
               result[t--] = nums[l] * nums[l]
               l++
            } else {
               result[t--] = nums[r] * nums[r]
               r--
            }
        }
        return result
    }
}