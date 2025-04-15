//https://leetcode.com/problems/invert-binary-tree/
fun invertTree(root: TreeNode?): TreeNode? {
    root?.let {
        val left = it.left
        it.left = invertTree(it.right)
        it.right = invertTree(left)
    }
    return root
}