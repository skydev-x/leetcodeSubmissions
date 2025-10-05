class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var max = Int.MIN_VALUE
        for(p in prices){
            min = minOf(p,min)
            max = maxOf(max,p-min)
        }
        return max
    }
}