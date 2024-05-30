class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val sign = mutableMapOf<Char, Int>()
        for (c in s1) {
            sign[c] = sign.getOrDefault(c, 0) + 1
        }

        val window = mutableMapOf<Char, Int>()
        for (i in s2.indices) {
            val char = s2[i]
            window[char] = window.getOrDefault(char, 0) + 1

            if (i >= s1.length) {
                val leftChar = s2[i - s1.length]
                if (window[leftChar] == 1) {
                    window.remove(leftChar)
                } else {
                    window[leftChar] = window[leftChar]!! - 1
                }
            }

            if (window == sign) return true
        }

        return false
    }
}