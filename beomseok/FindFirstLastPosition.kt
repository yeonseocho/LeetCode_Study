class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        //처음 인덱스를 찾아서
        val findIndex = binarySearch(nums, 0, nums.size, target)
        if (findIndex == -1) {
            return intArrayOf(-1, -1)
        }

        var lowerBound = findIndex
        var upperBound = findIndex

        // 찾은 값 기준으로 아래쪽으로 찾고
        for(i in findIndex downTo 0) {
            if (nums[i] != target) {
                break
            } else {
                lowerBound = i
            }
        }
        
        // 찾은 값 기준으로 위쪽으로 찾고
        for (i in findIndex + 1 until nums.size) {
            if (nums[i] != target) {
                break
            } else {
                upperBound = i
            }
        }
        return intArrayOf(lowerBound, upperBound)
    }

    private fun binarySearch(
        nums: IntArray,
        startIndex: Int,
        endIndex: Int,
        target: Int
    ): Int {
        if (nums.size < 1) {
            return -1
        }

        val midIndex = (endIndex + startIndex) / 2
        return if (nums[midIndex] == target) {
            midIndex
        } else if (midIndex == startIndex || midIndex == endIndex) {
            -1
        } else if (nums[midIndex] > target) {
            binarySearch(nums, startIndex, midIndex, target)
        } else if (nums[midIndex] < target) {
            binarySearch(nums, midIndex, endIndex, target)
        } else {
            -1
        }
    }
}
