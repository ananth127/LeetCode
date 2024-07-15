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
    public ListNode swapPairs(ListNode head) {
        // Dummy node to handle edge cases such as empty list or single node list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            // Nodes to be swapped
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            // Swapping nodes
            first.next = second.next;
            second.next = first;
            temp.next = second;

            // Move to the next pair
            temp = first;
        }

        return dummy.next;
    }
}
