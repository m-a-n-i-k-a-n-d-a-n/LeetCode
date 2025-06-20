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
    static ListNode reverseLL(ListNode head1) {
        ListNode curr=head1,prev=null,next;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0,sum=0;
        ListNode res=new ListNode();
        ListNode h1=l1,h2=l2;
        ListNode temp=res;
        while(h1!=null || h2!=null) {
            sum=c;
            if(h1!=null) {
                sum=sum+h1.val;
                h1=h1.next;
            }
            if(h2!=null) {
                sum=sum+h2.val;
                h2=h2.next;
            }
            c=sum/10;
            if(res==null) 
                temp=new ListNode(sum%10,null);
            else {
            temp.next=new ListNode(sum%10,null);
            temp=temp.next;
            }
        }
        if(c>0) {
            temp.next=new ListNode(c,null);
        }
        return res.next;
    }
}