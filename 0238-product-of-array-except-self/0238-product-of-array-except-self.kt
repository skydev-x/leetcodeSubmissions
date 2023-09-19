class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        //build prefix 
        val prefix = IntArray(nums.size)
        prefix[0] = nums[0]
        for(i in 1..nums.size-1){
            prefix[i] = prefix[i-1].times(nums[i])
        }
        //build postfix
        val postfix = IntArray(nums.size)
        postfix[nums.size -1] = 1
        for(j in nums.size - 2 downTo 0){
            postfix[j] = postfix[j+1].times(nums[j+1])
        }
        //set result
        result[0] = postfix[0]
        for(i in 1..result.size-1){
            result[i] = prefix[i-1].times(postfix[i])
        }
        
        return result
        
    }
}