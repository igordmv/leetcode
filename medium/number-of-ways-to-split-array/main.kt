// https://leetcode.com/problems/number-of-ways-to-split-array/
fun waysToSplitArray(nums: IntArray): Int {
    var ans = 0
    var prefix = LongArray(nums.size)
    prefix[0] = nums[0].toLong()
    for (i in 1..nums.lastIndex) {
        prefix[i] = prefix[i - 1] + nums[i]
    }

    for (left in 0..nums.lastIndex - 1) {
        var leftSection: Long = prefix[left]
        var rightSection: Long = prefix[nums.lastIndex] - prefix[left]
        if (leftSection >= rightSection) {
            ans++
        }
    }

    return ans
}
