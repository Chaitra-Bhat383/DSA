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
    ListNode ele;

    public void deep(ListNode tail, int level) {
        if (tail.next != null) {
            deep(tail.next, level + 1);
        }

        if (level == 0) {
            tail.next = null;
            return;
        }

        ListNode temp = ele.next;
        tail.next = ele.next;
        ele.next = tail;
        ele = temp;
    }

    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ele = head;
        deep(slow, 0);
    }
}

// 1 2 3 4 5
// 1 5 2 3 4
// 1 5 2 4 3