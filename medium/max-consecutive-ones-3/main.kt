fun longestOnes(nums: IntArray, k: Int): Int {
    var left = 0
    var right = 0
    var flipped = k
    while (right < nums.lastIndex) {
        // If we included a zero in the window we reduce the value of k.
        // Since k is the maximum zeros allowed in a window.
        if (nums[right] == 0) {
            flipped--;
        }
        // A negative k denotes we have consumed all allowed flips and window has
        // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
        if (flipped < 0) {
            // If the left element to be thrown out is zero we increase k.
            flipped += 1 - nums[left];
            left++;
        }
        right ++
    }     
    return Math.abs(right - left);
}