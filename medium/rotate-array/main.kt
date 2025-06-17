// https://leetcode.com/problems/rotate-array/

//First code
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

//Second code
fun rotate(nums: IntArray, k: Int) {
    val n = nums.size
    val temp = nums.copyOf()
    for (i in nums.indices) {
        nums[(i + k) % n] = temp[i]
    }
}