class Solution {
    fun minWindow(s: String, t: String): String {
        if (t.isEmpty() || s.isEmpty()) return ""

        val tt = mutableMapOf<Char, Int>()
        for (c in t) {
            tt[c] = tt.getOrPut(c) { 0 } + 1
        }

        val win = mutableMapOf<Char, Int>()
        var have = 0
        val need = tt.size
        var l = 0
        var res = ""
        var resLen = Int.MAX_VALUE

        for (r in s.indices) {
            val c = s[r]
            win[c] = win.getOrPut(c) { 0 } + 1

            if (tt.containsKey(c) && win[c] == tt[c]) {
                have++
            }

            while (have == need) {
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1
                    res = s.substring(l, r + 1)
                }

                win[s[l]] = win[s[l]]!! - 1
                if (tt.containsKey(s[l]) && win[s[l]]!! < tt[s[l]]!!) {
                    have--
                }
                l++
            }
        }

        return res
    }
}
