/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return Collections.emptyList()
        }
        
        val result = mutableListOf<Int>()
        result.addAll(inorderTraversal(root.left))
        result.add(root.`val`)
        result.addAll(inorderTraversal(root.right))
        return result
    }
}
