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
    String b="";
    public void help(ListNode head){
        if(head==null){
            return ;
        }
            b+=head.val;
            help(head.next);
        
        return ;
    }
    public boolean isPalindrome(ListNode head) {
        help(head);
        int j=b.length()-1;
        for(int i=0;i<b.length()/2;i++){
            if(i<j && b.charAt(i)==b.charAt(j)){
                j--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}













    
//         Node head2=head;
//         int val=0;
//         Node ans=fun(head,head2,0);
//         if(ans==null){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//         Node fun(Node head,Node head2,int val){
//             if(head.next==null){
//                 if(head.data==head2.data){
                    
//                     return head2.next;
//                 }
//                 val++;
//                 return head2.next;
//             }
//             Node h1=head.data;
//             if(fun(head.next,head1,val).data==h1){
//                 return fun(head.next,head1,val);
//             }
//             val++;
//             if(val!=0){
//             return null;
//             }
//             return head2.next;
//     }
// }
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }