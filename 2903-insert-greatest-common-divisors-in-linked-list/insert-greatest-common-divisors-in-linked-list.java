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
    public int gcd(int a, int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode t1=head;
        ListNode t2=t1.next;
        while(t2!=null){
            ListNode a = new ListNode(gcd(t1.val,t2.val));
            t1.next=a;
            t1=t1.next;
            t1.next=t2;
            t1=t1.next;
            t2=t2.next;
        }
        return head;
    }
}