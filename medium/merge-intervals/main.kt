// https://leetcode.com/problems/merge-intervals/
class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()

        intervals.sortBy { it[0] }

        var start = intervals[0][0]
        var end = intervals[0][1]

        for (i in 1 until intervals.size) {
            val nextInterval = intervals[i]
            val nextStart = nextInterval[0]
            val nextEnd = nextInterval[1]

            if (nextStart <= end) {
                end = maxOf(end, nextEnd)
            } else {
                result.add(intArrayOf(start, end))
                start = nextStart
                end = nextEnd
            }
        }

        result.add(intArrayOf(start, end))
        return result.toTypedArray()
    }
}
