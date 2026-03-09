class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        var sum = n * (n + 1) / 2
        for(n in nums){
            sum -= n
        }
        return sum
    }
}

// using extra space here
// using array
    // fun missingNumber(nums: IntArray): Int {
    //     val seen = BooleanArray(nums.size + 1)
    //     for(i in seen.indices){
    //         seen[i] = false
    //     }
    //     for(n in nums){
    //         seen[n] = true
    //     }
    //     for(i in seen.indices){
    //        if(seen[i] == false) return i
    //     }
    //     return -1
    // }
// using set
    // fun missingNumber(nums: IntArray): Int {
    //     val set = nums.toSet()
    //     for(i in 0..nums.size + 1){
    //         if(i !in set){
    //             return i
    //         }
    //     }
    //     return -1
    // }