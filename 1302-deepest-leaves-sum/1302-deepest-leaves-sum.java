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
    public int deepestLeavesSum(TreeNode root) {
       Queue<TreeNode> qt=new LinkedList<>();
        qt.add(root);
        List<Integer> arr=new ArrayList<>();
        
        while(!qt.isEmpty()){
            int currsize=qt.size();
            int sum=0;
            for(int i=0;i<currsize;i++){
            TreeNode curr=qt.poll();
            sum=sum+curr.val;
            if(curr.left!=null){
                qt.add(curr.left);
                
            }
            if(curr.right!=null){
                qt.add(curr.right);
               
            }
            }
            arr.add(sum);
        }
        return arr.get(arr.size()-1);

        
    }
    
    
}