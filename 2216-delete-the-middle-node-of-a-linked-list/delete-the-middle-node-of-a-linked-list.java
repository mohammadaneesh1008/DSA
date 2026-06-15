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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode t = head;
        int n = 0 ;
        while(t!=null){
            t=t.next;
            n++;
        }
        ListNode a = head;
            for(int i=1;i<n/2;i++){
               a=a.next;
            }
            a.next=a.next.next;
            return head;
    }
}