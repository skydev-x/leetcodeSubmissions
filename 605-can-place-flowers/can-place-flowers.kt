class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if(flowerbed.size == 1){
            if(flowerbed[0] == 1){
                return n == 0
            } else {
                return true
            }
        }

        var prev = 0
        var cr = 0
        var nt = 1
        var count = 0
        while(cr < flowerbed.size){
            val next = try { flowerbed[nt] } catch (e : Exception) { 0 }
            if(prev == 0 && flowerbed[cr] == 0 && next == 0){
                count++
                flowerbed[cr] = 1
            }  
            prev = flowerbed[cr]
            cr++
            nt++
        }
        return count >= n
    }
}