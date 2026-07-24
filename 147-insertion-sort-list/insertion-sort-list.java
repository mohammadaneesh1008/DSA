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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            ans.add(t.val);
            t=t.next;
        }
        Collections.sort(ans);
        int i=0;
        t=head;
        while(i<ans.size()){
            t.val=ans.get(i++);
            t=t.next;
        }
        return head;
    }
}