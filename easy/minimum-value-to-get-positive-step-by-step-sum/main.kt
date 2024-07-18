//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
fun minStartValue(nums: IntArray): Int {
    if (nums.size == 1) return 1
    var prefixSum = mutableListOf<Int>()
    prefixSum.add(0, nums[0])
    for ( i in 1..nums.size - 1) {
        prefixSum.add(i, nums[i] + prefixSum[i-1])
    }
    val result = 1 - prefixSum.min()
    return if (result < 1) {
        1
    } else {
        result
    }
}