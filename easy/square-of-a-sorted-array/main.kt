// https://leetcode.com/problems/squares-of-a-sorted-array/
fun sortedSquares(nums: IntArray): IntArray {
    var left = 0
    var right = nums.lastIndex
    var itensToAdd = nums.lastIndex
    var newArray = IntArray(nums.size)
    while (left <= right) {
        if (Math.abs(nums[left]) > Math.abs(nums[right])) {
            newArray[itensToAdd] = nums[left] * nums[left]
            left++
        } else {
            newArray[itensToAdd] = nums[right] * nums[right]
            right--
        }
        itensToAdd--
    }
    return newArray
}
