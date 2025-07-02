//https://leetcode.com/problems/binary-tree-paths
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val answers = mutableListOf<String>()
        dfs(root, "", answers)
        return answers
    }

    private fun dfs(root: TreeNode?, curr: String, answers: MutableList<String>) {
        if(root == null) {
            return
        }
        var currAnswer = curr
        currAnswer += root.`val`
        if(root.left == null && root.right == null) {
            answers.add(currAnswer)
            return // Found a leaf
        }
        currAnswer += "->"

        dfs(root.left, currAnswer, answers)
        dfs(root.right, currAnswer, answers)
    }