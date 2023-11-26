// https://leetcode.com/problems/rotate-array/
fun rotate(nums: IntArray, k: Int): Unit {
    var steps = 1
    while(steps <= k){
        var keep = nums[nums.size-1]
        for(i in nums.size-1 downTo 1){
            nums[i] = nums[i-1]
        }
        nums[0] = keep
        steps++
    }
}