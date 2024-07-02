/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode> b=new ArrayList<>();
    public TreeNode ro(TreeNode root){
        if(root==null){
            return null;
        }
        //else if(root.left !=null && root.right !=null){
            
            
            TreeNode a= root.left;
            root.left=root.right;
            root.right=a;
            ro(root.left);
            ro(root.right);

            return root;
            
        
    }
    public TreeNode invertTree(TreeNode root) {
        ro(root);
        return root;
    }
}