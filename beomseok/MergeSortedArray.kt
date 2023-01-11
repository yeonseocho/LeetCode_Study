class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        when {
            n == 0 -> return
            m == 0 -> {
                for (i in 0 until n) {
                    nums1[i] = nums2[i]
                }
                return
            }
        }

        var mPointer: Int = m - 1
        var nPointer: Int = n - 1
        var resultPointer: Int = nums1.size - 1

        while (mPointer >= 0 && nPointer >= 0) {
            val num1 = nums1[mPointer]
            val num2 = nums2[nPointer]

            if (num1 >= num2) {
                nums1[resultPointer] = num1
                nums1[mPointer] = 0
                mPointer--
            } else {
                nums1[resultPointer] = num2
                nums2[nPointer] = 0
                nPointer--
            }
            resultPointer--
        }

        if (nPointer >= 0) {
            for (i in 0 .. nPointer) {
                nums1[i] = nums2[i]
            }
        }
    }
}
