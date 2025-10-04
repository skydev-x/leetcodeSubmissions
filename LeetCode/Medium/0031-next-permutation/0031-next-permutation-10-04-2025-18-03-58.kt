class Solution {

    fun IntArray.reverseIn(start : Int,end : Int) {
        var s = start
        var e = end
        while(s < e) {
            val temp = this[s]
            this[s] = this[e]
            this[e] = temp
            s++ 
            e--
        }
    }

    fun nextPermutation(nums: IntArray): Unit {
        val n = nums.size - 1
        var firstDec = n
        var didFind = false

        for(i in n downTo 1) {
            if(nums[i] > nums[i-1]) {
                firstDec = i - 1
                didFind = true
                break
            }
        }
        println(nums.joinToString())
        println(firstDec)
        // last permutation -> cycle back
        if(!didFind) {
            nums.reverse()
            return
        }

        for(i in n downTo firstDec + 1) {
            if(nums[i] > nums[firstDec]){
                //swap
                val temp = nums[i]
                nums[i] = nums[firstDec]
                nums[firstDec] = temp
                println("swapped ${nums[i]} to $i with ${nums[firstDec]}")
                // reverse ahead of swapped point
                println("before reverse ${nums.joinToString()}")
                nums.reverseIn(firstDec+1,n)
                println("hit for $i -> ${nums.joinToString()}")
                break
            }

        }

    }
}