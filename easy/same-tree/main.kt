//https://leetcode.com/problems/same-tree/
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) {
        return true;
    }
    if (p == null || q == null) {
        return false;
    }
    
    if (p.`val` != q.`val`) {
        return false;
    }
    val left = isSameTree(p.left, q.left)
    val right = isSameTree(p.right, q.right)
    return left && right
}