class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var result = ""
        var hl = gcd(str1.length,str2.length)
        var i = 0
        var j = 0
        while(i < hl && j < hl){
            if(str1[i] == str2[j]){
                result += str1[i]
                i++
                j++
            } else {
                return ""
            }
        }
        while(i < str1.length) {
            for(x in result){
                if(str1[i] != x){
                    return ""
                } else {
                    i++
                }
            }
        }
        while(j < str2.length) {
            for(x in result){
                if(str2[j] != x){
                    return ""
                } else {
                    j++
                }
            }
        }
        return result
    }

    fun gcd(x : Int,y : Int) : Int {
        var a = x
        var b = y 
        while(a != b){
            if(a < b){
                b = b - a
            } else {
                a = a - b
            }
        }
        return a
    }
}