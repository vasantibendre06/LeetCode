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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode curr = head;

        if(head == null || head.next == null) return true;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondHalf = reverse(slow.next);

        ListNode p1 = head;
        ListNode p2 = secondHalf;
        while (p2 != null) {
            if (p1.val != p2.val) return false;

            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode yest = null;
        ListNode today = head;

        while(today != null) {
            ListNode tomo = today.next;
            today.next = yest;
            yest = today;
            today = tomo;
        }
        
        return yest;
    }
}