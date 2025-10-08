class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        while(true) {
            slow = nums[slow]
            fast = nums[nums[fast]]
            if(slow == fast){
                break
            }
        }
        slow = 0
        while(slow != fast){
            slow = nums[slow]
            fast = nums[fast]
        }
        return slow
    }
}