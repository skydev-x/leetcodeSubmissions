class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        while(true){
            slow = nums[slow]
            fast = nums[nums[fast]]
            if(slow == fast){
                break
            }
        }

        var temp = 0
        while(true){
            temp = nums[temp]
            slow = nums[slow]
            if(temp == slow){
                break
            }
        }

        return temp
    }
}