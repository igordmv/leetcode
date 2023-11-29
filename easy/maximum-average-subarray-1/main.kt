// https://leetcode.com/problems/maximum-average-subarray-i/
fun findMaxAverage(nums: IntArray, k: Int): Double {
    if (k == 1 && nums.size == 1) {
        return nums[0].toDouble()
    }
    var total = 0.0
    var left = 0

    for (i in 0..k - 1) {
        total += nums[i]
    }
    var ans = total / k
    for (right in k..nums.lastIndex) {
        total -= nums[left]
        total += nums[right]
        ans = Math.max(ans, total / k)
        left++
    }

    return ans
}
