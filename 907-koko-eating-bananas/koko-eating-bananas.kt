class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var s = 1
        var e = piles.max()
        var k = e
        while(s <= e){
            val mid = (e -s)/2 + s
            val calc = piles.map { ceil(it.toDouble()/mid)}.sum()
            if(calc <= h){
                e = mid - 1
                k = mid
            } else {
                s = mid + 1
            } 
        }
        return k
    }
}