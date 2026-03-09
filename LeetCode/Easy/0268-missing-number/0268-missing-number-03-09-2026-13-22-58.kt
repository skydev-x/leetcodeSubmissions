class Solution {
    fun missingNumber(nums: IntArray): Int {
        var s = 0
        val n = nums.size
        while(s < n){
            val v = nums[s]
            if(v < n && nums[s] != nums[v]){
                nums.swap(s,v)
            } else {
                s++
            }
        }
        for (index in nums.indices) {
            if (nums[index] != index) {
                return index
            }
        }

        return nums.size
    }

    fun IntArray.swap(i : Int, j : Int){
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }
}

// using xor trick
    // fun missingNumber(nums: IntArray): Int {
    //     var x = nums.size // add last number because i will be [0,n)
    //     for (i in nums.indices) {
    //         x = x xor i xor nums[i]
    //     }
    //     return x
    // }

// using math sum trick
    // fun missingNumber(nums: IntArray): Int {
    //     val n = nums.size
    //     var sum = n * (n + 1) / 2
    //     for(n in nums){
    //         sum -= n
    //     }
    //     return sum
    // }

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