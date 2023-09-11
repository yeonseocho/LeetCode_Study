class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // map 초기화. key : 대상숫자, value : 합산하여 key를 만들수 있는 nums의 인덱스 배열
        val hashMap = hashMapOf<Int, MutableList<Int>>()
        nums.forEachIndexed { index, i ->
            val valueList = hashMap[i] ?: mutableListOf()
            valueList.add(index)
            hashMap[i] = valueList
        }

        for (i in nums.indices) {
            val gap = target - nums[i]
            val candidates = hashMap[gap]
            candidates?.let {
                for (j in it.indices) {
                    if (i != it[j]) {
                        return intArrayOf(i, it[j])
                    }
                }
            }
        }
        return intArrayOf()
    }
}
