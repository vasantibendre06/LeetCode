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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     head = reverse(head);

    //     if (n == 1) {
    //         head = head.next; // drop the first node
    //     } else {
    //         ListNode curr = head;
    //         for (int i = 1; i < n - 1 && curr.next != null; i++) {
    //             curr = curr.next;
    //         }
    //         // remove nth node
    //         if (curr.next != null) {
    //             curr.next = curr.next.next;
    //         }
    //     }

    //     // Step 3: Reverse back
    //     head = reverse(head);

    //     return head;

    // }

    // private ListNode reverse(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev; // new head of reversed list

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}