// https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedList_Cycle_2 {
    public Node<Integer> detectCycle(Node<Integer> head) {
        if(head==null||head.next==null){
            return null;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                fast =head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
