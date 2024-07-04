/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode temp) {
        ListNode ne=new ListNode(0);
        ListNode var=ne;
        int sum=0;
        temp=temp.next;
        while(temp!=null){
            if(temp.val==0){
                
                var.next=new ListNode(sum);
                var=var.next;
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
    return ne.next;
    }
  
    
    
}