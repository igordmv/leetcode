//https://leetcode.com/problems/3sum-closest/
fun threeSumClosest(nums: IntArray, target: Int): Int {
    val list = nums.sorted()
    var closest = nums.first() + nums[1] + nums.last()
    for (i in 0 until nums.size-2) {
        var left = i + 1
        var right = nums.size-1
        while (left < right) {
            var sum = list[i] + list[left] + list[right]
            if (sum > target) right-- else left++
            if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum
        }
    }

    return closest
}