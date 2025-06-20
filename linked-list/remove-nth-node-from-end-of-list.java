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
 //two times traverse
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp!=null) {
            c++;
            temp=temp.next;
        }
        int move=c-n;
        if(move==0) 
            return head.next;
        ListNode prev=null,curr=head;
        while(move>0) {
            prev=curr;
            curr=curr.next;
            move--;
        }
        prev.next=curr.next;
        curr.next=null;
        return head;
    }
    
}*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow,fast=head;
        if(head.next==null && n==1)
            return null;
        
        while(n>0) {
            fast=fast.next;
            n--;
        }
        slow=head;
        ListNode prev=null;
        while(fast!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        if(prev==null)
            return head.next;
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}