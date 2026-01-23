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
    public ListNode middleNode(ListNode head) {
        // 1->2->3->4->5
       ListNode slow = head; //1
       ListNode fast=head;//1
        while(fast!=null && fast.next!=null){//5->null(F)
            slow = slow.next;//2 ==>3
            fast = fast.next.next;//3==>5
        }
        return slow;//3
}
}