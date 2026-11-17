//https://leetcode.com/problems/4sum-ii/
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
        //nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
        val map = hashMapOf<Int, Int>()
        for (a in nums1) {
            for (b in nums2) {
                val sum = a + b
                map[sum] = (map[sum]?: 0) + 1
            }
        }

        var count = 0

        for (c in nums3) {
            for (d in nums4) {
                val needed = -(c + d)
                count += map[needed] ?: 0
            }
        }
        return count
    }
