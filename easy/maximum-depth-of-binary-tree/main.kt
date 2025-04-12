//https://leetcode.com/problems/maximum-depth-of-binary-tree/
fun maxDepth(root: TreeNode?): Int {
    if (root == null)
        return 0

    return max(maxDepth(root.left), maxDepth(root.right)) + 1
    return 1
}