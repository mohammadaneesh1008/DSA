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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ArrayList<Integer> a = new ArrayList<>();
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                a.add(sum);
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        temp=head.next;
        ListNode p=null;
        for(int i=0;i<a.size();i++){
            temp.val=a.get(i);
            p=temp;
            temp=temp.next;
        }
        p.next=null;
        return head.next;
    }
}