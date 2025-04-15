//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts
fun minimumOperations(nums: IntArray): Int {
    // [1,5,0,3,5]
    // [0, 1, 3, 5, 5]
    // [0, 0, 2, 4, 4]
    // [0, 0, 0, 2, 2]
    // [0, 0, 0, 0, 0]

    // 1 - sort the array
    // 2 - find the first non zero value
    // 3 - decrease all the array by the first non zero
    // 4 - back to step 2
    var operationsCount = 0
    var totalDecreased = 0
    val sortedArray = nums.sorted().toIntArray()
    for (i in 0..sortedArray.lastIndex) {
        if (sortedArray[i] - totalDecreased != 0) {
            totalDecreased += sortedArray[i] - totalDecreased
            operationsCount++
        }
    }
    return operationsCount
}