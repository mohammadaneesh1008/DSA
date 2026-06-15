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
    public int[] nextLargerNodes(ListNode head) {
       ListNode t=head;
       int n=0;
       while(t!=null){
        n++;
        t=t.next;
       }
       int[] ans = new int[n];
       if(n==1) return ans;
       t=head;
       int i=0;
       while(t.next!=null){
        ListNode t2=t.next;
        while(t2!=null){
        if(t2.val>t.val){
            ans[i++]=t2.val;
            break;
        }
        t2=t2.next;
       }
       if(t2==null) i++;
       t=t.next;
       }
       return ans;
    }
}