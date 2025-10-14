class Solution {
    fun majorityElement(nums: IntArray): Int {
      var res = nums[0]
      var count = 0
      for(n in nums){
        if(n == res){
          count++
        } else {
          if(count == 0){
            res = n
            count++
          } else {
            count--
          }
        }
      }


      return res

    }
}