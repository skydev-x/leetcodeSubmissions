class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if(str1+ str2 != str2 + str1){
            return ""
        }
        return str1.substring(0,gcd(str1.length,str2.length))
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