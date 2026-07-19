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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        while(head!=null){
            while(!st.isEmpty() && st.peek().val<head.val){
                st.pop();
            }
            st.push(head);
            head=head.next;
        }
        Stack<ListNode> rev = new Stack<>();
        while(!st.isEmpty()){
            rev.push(st.pop());
        }
        ListNode dummy = new ListNode(0);
        ListNode t=dummy;
        while(!rev.isEmpty()){
            t.next=rev.pop();
            t=t.next;
        }
        return dummy.next;
    }
}