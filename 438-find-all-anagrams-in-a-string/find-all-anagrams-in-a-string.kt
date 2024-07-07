class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return listOf<Int>()
        
        val result = mutableListOf<Int>()
        val freq = mutableMapOf<Char, Int>()
        val window = mutableMapOf<Char, Int>()

        for (c in p) {
            freq[c] = freq.getOrPut(c) { 0 } + 1
        }

        for (i in 0 until p.length) {
            window[s[i]] = window.getOrPut(s[i]) { 0 } + 1
        }

        for (end in p.length..s.length) {
            if (window == freq) {
                result.add(end - p.length)
            }

            if (end < s.length) {
                val startChar = s[end - p.length]
                window[startChar] = window[startChar]!! - 1
                if (window[startChar] == 0) {
                    window.remove(startChar)
                }

                val endChar = s[end]
                window[endChar] = window.getOrPut(endChar) { 0 } + 1
            }
        }

        return result
    }
}