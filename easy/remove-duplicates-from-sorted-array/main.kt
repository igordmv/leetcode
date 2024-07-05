//https://leetcode.com/problems/remove-duplicates-from-sorted-array
fun removeDuplicates(nums: IntArray): Int {
    var count = 1
    for(i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[count] = nums[i]
            count++
                }
    }
    return count
}