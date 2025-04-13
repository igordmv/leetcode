//https://leetcode.com/problems/deepest-leaves-sum/
fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0
    val queue : Queue<TreeNode> = LinkedList();
    queue.add(root)
    while (!queue.isEmpty()) {
        var numberOfNodes = queue.size
        var result = 0
        var isDeepestLeaves = true
        for (i in 0 until numberOfNodes) {
            val node = queue.remove()
            result += node.`val`
            if (node.left != null) {
                queue.add(node.left)
                isDeepestLeaves = false
            }
            if (node.right != null) {
                queue.add(node.right)
                isDeepestLeaves = false
            }
        }
        if (isDeepestLeaves) {
            return result
        }
    }
    return -1
}