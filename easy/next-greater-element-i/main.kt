//https://leetcode.com/problems/next-greater-element-i/
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val nextGreater = hashMapOf<Int, Int>()
        for (num in nums2) {
            while (stack.isNotEmpty() && num > stack.last()) {
                val previous = stack.removeLast()
                nextGreater[previous] = num
            }

            stack.addLast(num)
        }

        return IntArray(nums1.size) { index ->
            nextGreater[nums1[index]] ?: -1
        }
    }
