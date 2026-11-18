//https://leetcode.com/problems/merge-sorted-array/
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var nums1Index = 0
    var nums2Index = 0
    val answer = IntArray(n + m)
    var index = 0
    while (index < n + m) {
        if (nums1Index == m) {
            answer[index] = nums2[nums2Index]
            nums2Index++
        } else if (nums2Index == n) {
            answer[index] = nums1[nums1Index]
            nums1Index++
        } else if (nums1[nums1Index] <= nums2[nums2Index]) {
            answer[index] = nums1[nums1Index]
            nums1Index++
        } else if (nums1[nums1Index] > nums2[nums2Index]) {
            answer[index] = nums2[nums2Index]
            nums2Index++
        }

        index++
    }
    for (i in answer.indices) {
        nums1[i] = answer[i]
    }
}
