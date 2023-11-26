class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""
        var w1 = word1.length - 1
        var w2 = word2.length - 1
        var i = 0
        var j = 0
        while(i <= w1 && j <= w2){
            result += word1[i]
            result += word2[j]
            i++
            j++
        }

        if(w1 > w2){
            for(k in i..(word1.length -1)){
                result += word1[k]
            }
        } else {
            for(k in j..(word2.length -1)){
                result += word2[k]
            }
        }
        return result
    }
}