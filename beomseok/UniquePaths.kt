class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        if (m == n && m == 1) {
            return 1
        }
        
        // 초기화
        // dp[i][0] dp[0][j] = 1
        val dp = Array<IntArray>(m) { _ -> IntArray(n) { _ -> 0 } }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1
                }
            }
        }
        
        // dp 점화식 : dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for (i in 1 until m) {
            for (j in 1 until n) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
            }
        }
        
        return dp[m-1][n-1]
    }
}
