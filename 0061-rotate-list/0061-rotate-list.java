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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode curr = head;
        
        //Find length of list
        int len = 1;
        while(curr.next != null) {
            curr = curr.next;
            len++;
        }

        //Making the List Circular
        curr.next = head;

        //Find new Head Position
        k = k % len;
        int newHead = len - k;

        ListNode newTail = curr;
        curr = head;
        for(int i = 0; i < newHead; i++) {
            newTail = curr;
            curr = curr.next;
        }

        //Break the circle
        newTail.next = null;
        return curr;
    }
}