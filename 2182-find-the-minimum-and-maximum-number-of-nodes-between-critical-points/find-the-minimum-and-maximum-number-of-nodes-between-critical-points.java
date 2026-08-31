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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstCritical = -1, prevCritical = -1;
        int maxDist = -1;
        int minDist = Integer.MAX_VALUE;
        while(curr.next != null) {
            boolean isCritical = ((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val));
            if(isCritical) {
                if(firstCritical == -1) {
                    firstCritical = index;
                }
                if(prevCritical != -1) {
                    minDist = Math.min(minDist, index - prevCritical);
                    maxDist = index - firstCritical;
                }
                prevCritical = index;
            }
            index++;
            prev = curr;
            curr = curr.next;
        }
        if(firstCritical != prevCritical) return new int[]{minDist, maxDist};
        return new int[]{-1, -1};
    }
}