//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
fun goodNodes(root: TreeNode?): Int {
    return dfs(root, Integer.MIN_VALUE)
}

fun dfs(node: TreeNode?, maxSoFar: Int): Int {
    if (node == null)
        return 0

    val left = dfs(node.left, max(maxSoFar, node.`val`))
    val right = dfs(node.right, max(maxSoFar, node.`val`))
    var ans = left + right
    if (node.`val` >= maxSoFar) {
        ans++
    }
    return ans
}