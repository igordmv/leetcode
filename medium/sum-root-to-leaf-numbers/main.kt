//https://leetcode.com/problems/sum-root-to-leaf-numbers/
fun sumNumbers(root: TreeNode?): Int {
    return dfs(root, 0)
}

fun dfs(node: TreeNode?, currentSum: Int): Int {
    if (node == null) return 0
    val newSum = currentSum * 10 + node.`val`

    if (node.left == null && node.right == null) {
        return newSum
    }

    val leftSum = dfs(node.left, newSum)
    val rigthSum = dfs(node.right, newSum)
    return leftSum + rigthSum
}