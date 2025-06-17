class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s2.length < s1.length) return false
        val windMap = mutableMapOf<Char,Int>()
        val pattern =  mutableMapOf<Char,Int>()
        for(i in 0 until s1.length){
            pattern[s1[i]] = pattern.getOrPut(s1[i]){0} + 1
            windMap[s2[i]] = windMap.getOrPut(s2[i]){0} + 1
        }
        if(pattern.keys.all { it in windMap.keys && pattern[it] == windMap[it] }) return true

        var l = 0
        var r = s1.length - 1
        while(r < s2.length -1){
            l++
            r++
            if(r > s2.length) break
            windMap[s2[l-1]] = windMap.getOrPut(s2[l-1]){0} - 1
            windMap[s2[r]] = windMap.getOrPut(s2[r]){0} + 1
            if(pattern.keys.all { it in windMap.keys && pattern[it] == windMap[it] }) return true

        }

        return false

    }
}