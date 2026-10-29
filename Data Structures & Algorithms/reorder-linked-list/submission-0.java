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
    private ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    private ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        if (head.next != null && head.next.next != null) {
            ListNode temp1 = head;
           
            // find mid (as this will be the end of the res)
            ListNode mid = getMidNode(temp1);

             // Reverse the list
            ListNode temp2 = reverseList(mid.next);

            // set mid.next as null
            mid.next = null;

            // add one by one from both normal & reversed list
            while (temp1 != null && temp2 != null) {
                ListNode next1 = temp1.next;
                ListNode next2 = temp2.next;
                temp1.next = temp2;
                temp2.next = next1;
                temp1 = next1;
                temp2 = next2;
            }
        }
    }
}
