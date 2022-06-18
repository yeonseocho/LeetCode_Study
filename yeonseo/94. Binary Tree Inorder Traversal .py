class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result=[]

        def helper(node):
            if node.left:
                helper(node.left)
            result.append(node.val)
            if node.right:
                helper(node.right)

            if root:
                helper(root)
            return result
