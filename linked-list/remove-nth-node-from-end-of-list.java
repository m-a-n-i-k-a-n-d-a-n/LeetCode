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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp!=null) {
            c++;
            temp=temp.next;
        }
        int move=c-n;
        ListNode prev=null,curr=head;
        while(move!=0) {
            prev=curr;
            curr=curr.next;
            move--;
        }
        prev.next=curr.next;
        curr.next=null;
    }
    return head;
}