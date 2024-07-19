//https://leetcode.com/problems/k-radius-subarray-averages/description/
fun getAverages(nums: IntArray, k: Int): IntArray {
    if (k == 0) return nums
    val prefixSum = Array(nums.size) { 0L }
    val result = IntArray(nums.size)
    prefixSum[0] = nums[0].toLong()
    val total = k * 2 + 1
    for ( i in 1..nums.size - 1) {
        prefixSum[i] = nums[i] + prefixSum[i-1]
    }  

    for (i in nums.indices) {
        if (i - k < 0 || i + k >= nums.size) {
            result[i] = -1
        } else {
            result[i] = ((prefixSum[i+k] - prefixSum[i-k] + nums[i-k]) / total).toInt()
        }
    }
    return result
}