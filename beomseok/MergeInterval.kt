class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val elements = intervals.flatMap { range ->
            range.mapIndexed { index, value -> Element(value, index%2 == 0) }
        }.sortedWith(compareBy({ it.value }, { !it.isStart }))

        val result = mutableListOf<IntArray>()
        var counter = 0
        var startValue = -1
        elements.forEach {
            if (it.isStart) {
                if (counter == 0) {
                    startValue = it.value
                }
                counter++
            } else {
                counter--
                if (counter == 0) {
                    result.add(intArrayOf(startValue, it.value))
                }
            }
        }
        return result.toTypedArray()
    }

    private data class Element(
        val value: Int,
        val isStart: Boolean
    )
}
