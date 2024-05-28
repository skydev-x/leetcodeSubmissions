class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freq = IntArray(26) { 0 }
        var l = 0
        var r = 0
        var maxFreq = 0
        var res = 0

        while (r < s.length) {
            val temp = s[r] - 'A'
            freq[temp]++
            maxFreq = maxOf(maxFreq, freq[temp])

            if ((r - l + 1) - maxFreq > k) {
                freq[s[l] - 'A']--
                l++
            }
            
            res = maxOf(res, r - l + 1)
            r++
        }

        return res
    }
}