class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        var count1 = 0
        var count2 = 0
        var candidate1 = Int.MIN_VALUE
        var candidate2 = Int.MIN_VALUE

        for(i in 0 until nums.size){
            if(count1 == 0 && nums[i] != candidate2){
                candidate1 = nums[i]
                count1 = 1
            }
            else if(count2 == 0 && nums[i] != candidate1){
                candidate2 = nums[i]
                count2 = 1
            }
            else if(nums[i] == candidate1){
                count1++
            } else if(nums[i] == candidate2){
                count2++
            } else {
                count1--
                count2--
            }
        }

        val threshold = (nums.size / 3).toInt()
            count1 = 0
            count2 = 0
            for(i in 0 until nums.size){
                if(nums[i] == candidate1){
                    count1++
                }
                if(nums[i] == candidate2){
                    count2++
                }
            }

            val result = mutableListOf<Int>()
            if(count1 > threshold){
                result.add(candidate1)
            }
            if(count2 > threshold){
                result.add(candidate2)
            }

            return result.toList()
        

    }
}