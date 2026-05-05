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
        if (head == null) return head;
        ListNode start = head;
        ListNode end = head;
        ListNode dummy = head;
        int count = 0;
        while(start != null) {
            count++;
            start = start.next;
        }
        k = k % count;
        int rem = count - k;
        while(rem > 1) {
            end = end.next;
            rem--;
        }
        dummy = end.next;
        start = end.next;
        while(start != null && start.next != null) {
            start = start.next;
        }
        end.next = null;
        if (start != null) {
            start.next = head;
            head = dummy;
        }
        return head;
    }
}