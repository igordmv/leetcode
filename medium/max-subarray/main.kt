// https://leetcode.com/problems/maximum-subarray/description/
fun maxSubArray(nums: IntArray): Int {
    var sum = 0
    var max = 0
    for (i in 0..nums.lastIndex) {
        sum += nums[i]
        max = Math.max(sum, max)
        if (sum < 0) {
            sum = 0
        }
    }
    return max
}
