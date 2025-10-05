class Solution {
    fun sortColors(nums: IntArray): Unit {
        var zero = 0
        var two = nums.size - 1
        var cur = 0
        while(cur <= two){
            if(nums[cur] == 0){
                nums[cur] = nums[zero].also { nums[zero] = nums[cur] }
                zero++
                cur++
            } else if(nums[cur] == 1){
                cur++
            } else {
                nums[cur] = nums[two].also { nums[two] = nums[cur] }
                two--
            }
        }
    }
}