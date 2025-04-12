//https://leetcode.com/problems/path-sum/
var target = 0
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    target = targetSum
    return dfs(root, 0)
}

private fun dfs(node: TreeNode?, current: Int): Boolean {
    if (node == null)
        return false
    
    if (node.left == null && node.right == null) {
        return (current + node.`val`) == target
    }
    val newCurrent = current + node.`val`
    val left = dfs(node.left, newCurrent)
    val right = dfs(node.right, newCurrent)
    return left || right
}