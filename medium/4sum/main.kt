//https://leetcode.com/problems/4sum/
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {

        val sorted = nums.sorted()
        val answers = mutableSetOf<List<Int>>()
        // -2,-1,0,0,1,2
        for (first in 0 until nums.size - 3) {
            for (second in first + 1 until nums.size - 2) {
                var left = second + 1
                var right = nums.lastIndex

                while (left < right) {
                    val sum = sorted[first].toLong() + sorted[second].toLong() + sorted[left].toLong() + sorted[right].toLong()
                    if (sum > target.toLong()) {
                        right--
                    } else if (sum < target.toLong()){
                        left++
                    } else {
                        answers.add(listOf<Int>(sorted[first], sorted[second], sorted[left], sorted[right]))
                        left++
                        right--
                    }
                }
            }
        }
        return answers.toList()
    }
