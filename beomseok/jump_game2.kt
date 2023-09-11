class Solution {
    fun jump(nums: IntArray): Int {
        if (nums.size == 1) {
            return 0
        }

        var maxIndex = 0
        var currentJumpStep = 0
        var count = 0

        for (index in 0 until nums.size - 1) {
            maxIndex = Math.max(maxIndex, nums[index] + index)
            if (currentJumpStep == index) {
                count++
                currentJumpStep = maxIndex
            }
        }

        return count
    }
}
