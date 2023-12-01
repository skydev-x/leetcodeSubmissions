class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val pre = IntArray(size)
        val post = IntArray(size)
        val result = IntArray(size)

        var prev = 1
        var i = 0
        while(i < nums.size) {
            pre[i] = nums[i] * prev
            prev = pre[i]
            i++
        }

        var j = size - 1
        post[j] = 1
        while(j > 0) {
            post[j-1] = post[j] * nums[j]
            j--
        }

        var k = 1
        result[0] = post[0]
        while(k < size){
            result[k] = post[k] * pre[k-1]
            k++
        }

        return result

    }


}