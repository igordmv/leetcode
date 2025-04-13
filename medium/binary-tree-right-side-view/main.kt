//https://leetcode.com/problems/binary-tree-right-side-view/
fun rightSideView(root: TreeNode?): List<Int> {
    if (root == null) {
        return emptyList()
    }
    val queue : Queue<TreeNode> = LinkedList();
    val result = mutableListOf<Int>()
    queue.add(root);
    while (!queue.isEmpty()) {
        val nodesInCurrentLevel = queue.size

        for (i in 0 until nodesInCurrentLevel) {
            val node = queue.remove()
            if (i == nodesInCurrentLevel - 1) {
                result.add(node.`val`)
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
    return result
}