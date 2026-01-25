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
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f.next!= null && f.next.next!= null){
            s=s.next;
            f=f.next.next;
        }
        //split list as per s position.
        ListNode curr = s.next;
        ListNode prev = null;
        s.next=null;//first part last node point to null
        //reverse the second part-->
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }
        //merge two list head and prev.
        ListNode first = head;
        ListNode sec= prev;
         while(sec != null){
            ListNode f1= first.next;
            ListNode s1 = sec.next;
            first.next =sec;
            sec.next = f1;
            first = f1;
            sec= s1;
         }                               
    }
}