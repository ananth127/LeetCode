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
    public static boolean help(TreeNode p,TreeNode  q){
        if(p ==null && q==null){
            return true;
        }
        if( (p !=null && q!=null) && p.val==q.val ){
            System.out.println(p.val+" "+q.val);
            boolean a=help(p.left,q.left);
            if(!a) return false;
            a= help(p.right,q.right);
            return a;
        }else{
            return false;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return help(p,q);










        // valid1(p);
        // valid2(q);
        // System.out.println(st1);
        // System.out.println(st2);
        // if(st1.size() ==st2.size()){
        // while(!st1.isEmpty()){
        //    System.out.println(st1.peek()+" "+st2.peek());
        //     if(st1.pop() == st2.pop()){
        //         System.out.println("Same");
            
        // }
        // else{
        //     System.out.println("not Matc");
        //     return false;
        // }
        // System.out.println("while");
        // }
        // }
        // else{
        //     System.out.println("size");
        //     return false;
        // }
        // return true;
        
    }
}
// Stack<Integer> st1=new Stack<>();
    // Stack<Integer> st2=new Stack<>();
    // void valid1(TreeNode p){
    //     if(p==null){
    //         st1.push(199);
    //         return ;
    //     }
    //     st1.push(p.val);
    //     valid1(p.left);
        
    //     valid1(p.right);

    // }
    // void valid2(TreeNode p){
    //     if(p==null){
    //         st2.push(199);
    //         return ;
    //     }
    //     st2.push(p.val);
    //     valid2(p.left);
        
    //     valid2(p.right);

    // }