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
    List<Integer> a=new ArrayList<>();
    List<Integer> b=new ArrayList<>();
    public void ro1(TreeNode root){
        if(root==null){
            return;
        }
        else if(root.left ==null && root.right==null){
            a.add(root.val);
        }
        ro1(root.left);
        ro1(root.right);
        return ;
    }
    public void ro2(TreeNode root){
        if(root==null){
            return;
        }
        else if(root.left ==null && root.right==null){
            b.add(root.val);
        }
        ro2(root.left);
        ro2(root.right);
        return ;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ro1(root1);
        ro2(root2);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}