class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;   // node before pair

        while (prev.next != null && prev.next.next != null) {

            ListNode first = prev.next;        // 1st node
            ListNode second = first.next;      // 2nd node

            // swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // move prev to next pair
            prev = first;
        }

        return dummy.next;
    }
}