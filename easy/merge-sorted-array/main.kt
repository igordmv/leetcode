//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    for (index in m..n+m - 1) {
        nums1[index] = nums2[index - m]
    }
    nums1.sort()
}