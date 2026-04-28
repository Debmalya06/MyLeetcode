class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode dummy = null;
        ListNode prevleft = null;   
        ListNode left = head;
        ListNode right;

        while (left!=null) {
            right = left.next;
          
            if(right!=null){
                ListNode nextleft = right.next;
                //reverse
                reverse(left,2);
                if(prevleft!=null) {
                    prevleft.next= right;
                }
                if(dummy==null) dummy = right;
                 prevleft = left;
                left = nextleft;
            }
            else{
                if(prevleft!=null){
                    prevleft.next= left;
                    if(dummy==null) dummy=left;
                    break;
                }
            }
        }

        return dummy;
    }
    void reverse (ListNode head, int time){
        ListNode curr = head;
        ListNode prev = null;
        while(time>0){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

            time--;
        }
    }
}