class Solution {

    fun giveCookie(s : IntArray,target : Int) : Boolean {
        for(i in 0 until s.size){
            if(s[i] >= target){
                s[i] = 0
                return true
            }
        }
        return false
    }

    fun findContentChildren(g: IntArray, s: IntArray): Int {
        s.sort()
        val n = g.size
        var ch = 0
        var result = 0
        while(ch < n){
            if(giveCookie(s,g[ch])){
                result++
            } 
            ch++
        }
        return result
    }
}