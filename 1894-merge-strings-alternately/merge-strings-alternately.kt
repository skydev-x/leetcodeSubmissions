class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""
        var w1 = word1.length 
        var w2 = word2.length
        var i = 0
        var j = 0
        while(i < w1 && j < w2){
            result += word1[i++]
            result += word2[j++]
        }
    while(i < w1){
        result += word1[i++]
    }
    while(j < w2){
        result += word2[j++]
    }
        return result
    }
}