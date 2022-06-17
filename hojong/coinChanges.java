class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        int[] count = new int[amount + 1];
        count[0] = 0;
        
        for (int i=1; i<=amount; i++) {
            
            int minValue = Integer.MAX_VALUE;
            
            for (int j=0; j<coins.length; j++) {
                
                if (i - coins[j] < 0) {
                    continue;
                }
                
                if (count[i - coins[j]] == Integer.MAX_VALUE) {
                    count[i - coins[j]] -= 1;
                }
                
                minValue = Integer.min(minValue, count[i - coins[j]] + 1);
            }
            count[i] = minValue;
        }
        
        if (count[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        
        return count[amount];
    }
}
