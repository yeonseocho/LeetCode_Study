class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        int[] count = new int[amount + 1];
        count[0] = 0;
        
        for (int i=1; i<=amount; i++) {
            
            int minValue = Integer.MAX_VALUE;
            
            for (int j=0; j<coins.length; j++) {
                
                int countIndex = i - coins[j];
                
                if (countIndex < 0) {
                    continue;
                }
                
                int minCoinChange = 0;
                
                if (count[countIndex] == Integer.MAX_VALUE) {
                    minCoinChange = Integer.MAX_VALUE;
                } else {
                    minCoinChange = count[countIndex] + 1;
                }
                
                minValue = Integer.min(minValue, minCoinChange);
            }
            
            count[i] = minValue;
        }
        
        if (count[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        
        return count[amount];
    }
}
