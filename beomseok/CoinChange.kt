class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { Int.MAX_VALUE }
        dp[0] = 0
        
        for (money in 1..amount) {
            for (coin in coins) {
                if (coin <= money) {
                    val temp = if (dp[money - coin] == Int.MAX_VALUE) Int.MAX_VALUE else dp[money - coin] + 1
                    dp[money] = Math.min(dp[money], temp)
                }
            }
        }
        return if (dp[amount] == Int.MAX_VALUE) {
            -1
        } else {
            dp[amount]
        }
    }
}
