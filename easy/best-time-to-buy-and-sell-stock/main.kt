//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var minValue = Integer.MAX_VALUE
    for(index in 0..prices.lastIndex) {
        if (prices[index] < minValue) {
            minValue = prices[index]
        }
        val possibleMaxProfit = prices[index] - minValue
        maxProfit = max(possibleMaxProfit, maxProfit)
    }
    return maxProfit
}