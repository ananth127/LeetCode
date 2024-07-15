/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> val=new HashSet<>();
        while(head!=null){
            if(val.contains(head)){
                return true;
            }
            else{
                val.add(head);
            }
            head=head.next;
        }
        return false;
     }
}