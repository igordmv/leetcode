//https://leetcode.com/problems/insert-into-a-binary-search-tree/
fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return TreeNode(`val`)
    if (`val` < root.`val`) {
        root.left = insertIntoBST(root.left, `val`)
    }  else {
        root.right = insertIntoBST(root.right, `val`)
    }
    return root
}