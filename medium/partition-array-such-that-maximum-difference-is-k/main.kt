//https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/
fun partitionArray(nums: IntArray, k: Int): Int {
    var subsequences = 1
    nums.sort()
    var min = nums[0]
    for(i in 1 until nums.size){
        if(nums[i] - min > k){
            min = nums[i]
            subsequences++
        }
    }
    return subsequences
}