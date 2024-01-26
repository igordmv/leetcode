//https://leetcode.com/problems/running-sum-of-1d-array/
fun runningsSum(nums: IntArray): IntArray {
    for(i in 1 until nums.size){
        nums[i] = nums[i-1]+nums[i]
    }
    return nums
}