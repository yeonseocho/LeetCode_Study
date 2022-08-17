class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val rowSet = mutableSetOf<Int>()
        val colSet = mutableSetOf<Int>()
        
        // 첫번째로 행렬을 순회하여 값이 0인 row, col을 저장
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[0].size) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i)
                    colSet.add(j)
                }
            }
        }
        
        // 두번째로 행렬을 순회하여 위에서 저장한 row, col의 값을 0으로 변경
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[0].size) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    matrix[i][j] = 0
                }
            }
        }
    }
}
