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
    static ListNode reverseLL(ListNode slow) {
        ListNode curr=slow,prev=null,next;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sechalf=reverseLL(slow.next);
        slow.next = null;
        ListNode firhalf=head,nex1,nex2;
        while(sechalf!=null) {
            nex1=firhalf.next;
            nex2=sechalf.next;
            firhalf.next=sechalf;
            sechalf.next=nex1;
            firhalf=nex1;
            sechalf=nex2;
        }
    }
}