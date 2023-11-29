// https://leetcode.com/problems/subarray-product-less-than-k/
fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    if (k <= 1) 
        return 0
    var answer = 0
    var left = 0
    var curr = 1
    for (right in 0..nums.lastIndex) {
        curr *= nums[right]
        while (curr >= k) {
            curr = curr / nums[left]
            left++
        }
        answer += right - left + 1
    }
    return answer
}