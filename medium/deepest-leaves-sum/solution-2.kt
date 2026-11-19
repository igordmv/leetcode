//https://leetcode.com/problems/deepest-leaves-sum/
fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0
    val queue = ArrayDeque<TreeNode>()
    queue.addLast(root)
    var level = 0
    var levelSum = 0
    while (queue.isNotEmpty()) {
        levelSum = 0
        val levelSize = queue.size
        level++
        repeat(levelSize) {
            val node = queue.removeFirst()
            levelSum += node.`val`
            node.left?.let { queue.addLast(it) }
            node.right?.let { queue.addLast(it) }
        }
    }
    return levelSum
}
