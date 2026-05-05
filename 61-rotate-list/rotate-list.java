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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int p = 0;
        ListNode x = head;
        while (x != null) {
            x = x.next;
            p++;
        }
        k=k%p;
        if(k==0) return head;
        ListNode s = head;
        ListNode f = head;
        for (int i=0; i<k;i++) {
            f=f.next;
        }
        while (f.next!=null) {
            s=s.next;
            f=f.next;
        }
        ListNode newHead = s.next;
        s.next=null;
        f.next=head;
        return newHead;
    }
}
