class Solution {
    
    private List<Integer> output = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        
        return output;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        output.add(root.val);
        inorder(root.right);
    }
}
