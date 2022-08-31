class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        } else if (nums.size == 1) {
            return 1
        }
        
        var removeCounter = 0
        var targetIndex = 1
        var tempValue = nums[0]
        
        for (i in 1 until nums.size) {
            if (tempValue != nums[i]) {
                tempValue = nums[i]
                nums[targetIndex] = tempValue
                targetIndex++
            }
        }
        
        return targetIndex
    }
}
