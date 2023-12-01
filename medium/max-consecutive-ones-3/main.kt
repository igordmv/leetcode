//https://leetcode.com/problems/max-consecutive-ones-iii/description/
fun longestOnes(nums: IntArray, k: Int): Int {
    var left = 0
    var right = 0
    var flipped = k
    while (right <= nums.lastIndex) {
        if (nums[right] == 0) {
            flipped--;
        }
        if (flipped < 0) {
            flipped += 1 - nums[left];
            left++;
        }
        right ++
    }     
    return Math.abs(right - left);
}