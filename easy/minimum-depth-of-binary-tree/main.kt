//https://leetcode.com/problems/minimum-depth-of-binary-tree/
fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0
    if (root.left == null) return 1 + minDepth(root.right)
    if (root.right == null) return 1 + minDepth(root.left)
    return min(minDepth(root.left), minDepth(root.right)) + 1
}