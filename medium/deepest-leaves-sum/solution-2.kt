//https://leetcode.com/problems/deepest-leaves-sum/
fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0
    val stack = ArrayDeque<TreeNode>()
    stack.addLast(root)
    var level = 0
    var levelSum = 0
    while (stack.isNotEmpty()) {
        levelSum = 0
        val levelSize = stack.size
        level++
        repeat(levelSize) {
            val node = stack.removeFirst()
            levelSum += node.`val`
            node.left?.let { stack.addLast(it) }
            node.right?.let { stack.addLast(it) }
        }
    }
    return levelSum
}
