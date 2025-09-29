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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        if(right == left) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        //reverse the sublist from left to right
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevNode = null;

        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }

        // Step 3: reconnect
        prev.next.next = curr;   // tail connects to (right+1)th node
        prev.next = prevNode;    // prev connects to new head of sublist

        return dummy.next;
    }
}