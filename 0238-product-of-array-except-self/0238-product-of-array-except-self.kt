class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var post = 1
        result[nums.size - 1] = 1
        for(j in nums.size - 2 downTo 0){
            result[j] = post * nums[j+1]
            post = result[j]
        }

        var pre = 1
        for(i in 0..nums.size-1){
            result[i] *= pre
            pre *= nums[i]
        }
  

        
 

        
        return result
        
    }
}