//https://leetcode.com/problems/diameter-of-binary-tree/
var currentMax = 0
fun diameterOfBinaryTree(root: TreeNode?): Int {
    if (root == null) return 0

    val left = diameterOfBinaryTree(root.left)
    val right = diameterOfBinaryTree(root.right)
    currentMax = max(currentMax, findMaxLength(root.left) + findMaxLength(root.right))
    return currentMax
}

fun findMaxLength(node: TreeNode?): Int {
    if (node == null) return 0

    return max(findMaxLength(node.left), findMaxLength(node.right)) + 1
}