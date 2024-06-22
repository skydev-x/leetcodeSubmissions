class Solution {

    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        val cache = IntArray(n + 1)
        cache[1] = 1
        cache[2] = 2
        return util(cache, n)
    }

    fun util(cache: IntArray, n: Int): Int {
        if (cache[n] != 0) return cache[n]
        cache[n] = util(cache, n - 1) + util(cache, n - 2)
        return cache[n]
    }
}