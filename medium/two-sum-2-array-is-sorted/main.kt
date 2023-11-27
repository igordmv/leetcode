//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
fun twoSumTwo(numbers: IntArray, target: Int): IntArray {
    var start = 0
    var end = numbers.lastIndex
    while (start < end) {
        if (numbers[start] + numbers[end] == target) {
            return intArrayOf(start + 1, end + 1)
        }
        else if (numbers[end] + numbers[start] > target) {
            end--
        } else {
            start++
        }
    }
    return intArrayOf()
}