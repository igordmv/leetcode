//https://leetcode.com/problems/kth-smallest-element-in-a-bst
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val stack = ArrayDeque<TreeNode?>()
        var curr = root
        var visited = 0
        while (curr != null || stack.isNotEmpty()) {
            while(curr != null) {
                stack.add(curr)
                curr = curr?.left
            }
            curr = stack.removeLast()
            visited++
            if (visited == k) {
                return curr!!.`val`
            }
            curr = curr?.right
        }
        return -1
    }