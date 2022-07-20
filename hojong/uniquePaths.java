class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        
        for (int row=0; row<m; row++) {
            for (int col=0; col<n; col++) {
                if (row == 0 || col == 0) {
                    map[row][col] = 1;
                } else {
                    map[row][col] = map[row][col-1] + map[row-1][col];
                }
            }
        } 
        
        return map[m-1][n-1];
    }
}
