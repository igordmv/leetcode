//https://leetcode.com/problems/reverse-string/
fun runningsSum(nums: IntArray): IntArray {
    for(i in 1 until nums.size){
        nums[i] = nums[i-1]+nums[i]
    }
    return nums
}