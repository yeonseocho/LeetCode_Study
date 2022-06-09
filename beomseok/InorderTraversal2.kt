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
        inorderTraversalInternal(root, result)
        return result
    }
    
    private fun inorderTraversalInternal(root: TreeNode, result: MutableList<Int>) {
        if (root.left != null) {
            inorderTraversalInternal(root.left, result)
        }
        result.add(root.`val`)
        if (root.right != null) {
            inorderTraversalInternal(root.right, result)
        }
    }
}
