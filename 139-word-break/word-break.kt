class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val n = s.length
        val dp = BooleanArray(n+1)
        dp[n] = true
        for (i in n-1 downTo 0) {
            dp[i] = wordDict.any { it.length + i <= n 
                && s.substring(i, i + it.length) == it
                && dp[it.length + i] == true}
        }
        return dp[0]
    }
}