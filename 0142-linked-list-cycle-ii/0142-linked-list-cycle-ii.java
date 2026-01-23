public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head, f = head;

        while(f!=null && f.next!=null){
            s= s.next;
            f= f.next.next;
            if(s==f){
                ListNode e=head;
                while(e!=s){
                    e=e.next;
                    s=s.next;
                }
                return e;
            }
        }

        return null; // No cycle
    }
}
