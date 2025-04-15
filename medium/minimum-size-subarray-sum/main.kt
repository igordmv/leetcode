//https://leetcode.com/problems/minimum-size-subarray-sum/
fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var left = 0
    var sum = 0
    var minimal = Integer.MAX_VALUE

    for(right in nums.indices) {
        sum += nums[right]
        while (sum >= target) {
            minimal = min(minimal, right - left + 1)
            sum -= nums[left]
            left++
        }
    }
    return minimal.takeIf { it != Int.MAX_VALUE } ?: 0
}