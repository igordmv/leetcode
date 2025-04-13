//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
fun largestValues(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    val queue : Queue<TreeNode> = LinkedList();
    val result = mutableListOf<Int>()
    queue.add(root)

    while (!queue.isEmpty()) {
        var numberOfNodes = queue.size
        var localLargest = Integer.MIN_VALUE
        for (i in 0 until numberOfNodes) {
            val node = queue.remove()
            localLargest = max(localLargest, node.`val`)
            if (node.left != null) {
                queue.add(node.left)
            }
            if (node.right != null) {
                queue.add(node.right)
            }
        }
        result.add(localLargest)
    }
    return result
}