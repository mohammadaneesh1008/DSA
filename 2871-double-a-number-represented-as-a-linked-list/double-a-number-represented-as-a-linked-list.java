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
    public ListNode doubleIt(ListNode head) {
       Stack<ListNode> st = new Stack<>();
       ListNode temp=head;
       while(temp!=null){
        st.push(temp);
        temp=temp.next;
       }
       int r=0;
       Stack<ListNode> rst = new Stack<>();
       while(!st.isEmpty()){
          int v=((st.pop().val)*2)+r;
          ListNode a = new ListNode(v%10);
          rst.push(a);
          r=v/10;
       }
       if(r!=0){
        ListNode a = new ListNode(r);
        rst.push(a);
       }
       ListNode dummy = new ListNode(0);
       temp=dummy;
       while(!rst.isEmpty()){
        temp.next=rst.pop();
        temp=temp.next;
       }
       temp.next=null;
       return dummy.next;
    }
}