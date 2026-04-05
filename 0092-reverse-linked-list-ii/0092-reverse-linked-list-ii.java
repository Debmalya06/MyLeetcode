class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;
 
        // Step 1: move prev to (left-1) position
        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        // Step 2: reverse from left to right
        ListNode curr = before.next;
        ListNode prev = null;

        for (int i = 0; i < right - left+1; i++) {
              ListNode x = curr.next;
            curr.next = prev;
            prev=curr;
            curr = x;
        }
        // adjust with before part and last part
        ListNode next = before.next;
        before.next= prev;
        next.next = curr;
        return dummy.next;
    }
}