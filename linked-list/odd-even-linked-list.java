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
    public ListNode oddEvenList(ListNode head) {
        ListNode fh=head,sh=head.next,head1=head.next;
        while(sh!=null && sh.next!=null) {
            fh.next=sh.next;
            fh=fh.next;
            sh.next=fh.next;
            sh=sh.next;
        }
        fh.next=head1;
        return head;
    }
}