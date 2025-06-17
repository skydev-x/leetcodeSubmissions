class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if(p.length > s.length) return listOf()
        val fm = mutableMapOf<Char,Int>()
        val pm = mutableMapOf<Char,Int>()
        val res = mutableListOf<Int>()
        for(i in 0 until p.length){
            fm[s[i]] = fm.getOrPut(s[i]){0} + 1
            pm[p[i]] = pm.getOrPut(p[i]){0} + 1
        }
        var l = 0
        var r = p.length - 1
        while(r <= s.length -1){
            if(pm.keys.all {it in fm.keys && pm[it] == fm[it] }) {
                res.add(l)
            }
            l++
            r++
            if(r > s.length -1) break
            fm[s[r]] = fm.getOrPut(s[r]){0} + 1
            fm[s[l-1]] = fm.getOrPut(s[l-1]){0} - 1
        }
        return res
    }
}