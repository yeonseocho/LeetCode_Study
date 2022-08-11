class Solution {
    public void setZeroes(int[][] matrix) {
        
        int[][] originalMatrix = new int[matrix.length][matrix[0].length];
        
        for (int i=0; i<matrix.length; i++) {
			      System.arraycopy(matrix[i], 0, originalMatrix[i], 0, matrix[0].length);
		    }
        
        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[0].length; col++) {
                if (originalMatrix[row][col] == 0 && matrix[row][col] == 0) {
                    setMatrixZeroes(row, col, matrix);
                }
            }
        }
    }
    
    public void setMatrixZeroes(int row, int col, int[][] matrix) {
        for (int j=0; j<matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
        
        for (int i=0; i<matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
