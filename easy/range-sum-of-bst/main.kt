//https://leetcode.com/problems/range-sum-of-bst/
fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    if (root == null) {
        return 0;
    }
    
    var ans = 0;
    if (low <= root.`val` && root.`val` <= high) {
        ans += root.`val`;
    }
    if (low < root.`val`) {
        ans += rangeSumBST(root.left, low, high);
    }
    if (root.`val` < high) {
        ans += rangeSumBST(root.right, low, high);
    }
    
    return ans;
}