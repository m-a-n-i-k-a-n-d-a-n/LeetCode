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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null && fast.next==null)
            slow=slow.next;
        ListNode revlist=reverseLL(slow);
        while(revlist!=null) {
            if(revlist.val!=head.val)
                return false;
            revlist=revlist.next;
            head=head.next;
        }
        return true;
    }
}