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
    private int getSize(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode temp = head;
        int len = getSize(temp);

        int index = len - n;
        if(index==0){
            return head.next;
        }
        int indexCounter = 0;

        while(temp!=null && temp.next!=null){
            if(indexCounter == index-1){
                temp.next = temp.next.next;
                break;
            }
            indexCounter++;
            temp = temp.next;
        }
        return head;


    }
}
