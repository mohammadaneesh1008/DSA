/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node dummy = new Node(0);
        Node t1=dummy;
        Node t2=head;
        while(t2!=null){
            Node temp = new Node(t2.val);
            t1.next=temp;
            t1=t1.next;
            t2=t2.next;
        }
        t2=head;
        t1=dummy.next;
        HashMap<Node,Node> map = new HashMap<>();
        while(t2!=null){
            map.put(t2,t1);
            t2=t2.next;
            t1=t1.next;
        }
        for(Node original : map.keySet()){
            Node dup = map.get(original);
            dup.random=map.get(original.random);
        }
        return dummy.next;
    }
}