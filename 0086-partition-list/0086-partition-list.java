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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        //Create 2 dummy heads
        ListNode leftHead = new ListNode(0);
        ListNode rightHead = new ListNode(0);

        ListNode left = leftHead;
        ListNode right = rightHead;

        while(head != null) {
            if(head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }

        right.next = null; //avoids cycle
        left.next = rightHead.next; //merge

        return leftHead.next;
 
    }
}