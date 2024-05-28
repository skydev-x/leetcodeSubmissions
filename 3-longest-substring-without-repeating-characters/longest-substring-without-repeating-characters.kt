class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        val seen = mutableSetOf<Char>()
        var l = 0
        var r = 0
        var res = 0

        while (r < s.length) {
            if (seen.contains(s[r])) {
                seen.remove(s[l])
                l++
            } else {
                seen.add(s[r])
                res = maxOf(res, r - l + 1)
                r++
            }
        }
        return res
    }
}