//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
fun removeDuplicatesTwo(nums: IntArray): Int {
    var count = 2
    if (nums.size < 3) return nums.size
   
    for (i in 2 .. nums.size - 1) {
        if(nums[i] != nums[count-2]) {
            nums[count] = nums[i]
            count++
        }
    }
    
    return count
}