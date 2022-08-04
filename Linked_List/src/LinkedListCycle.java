import java.util.Scanner;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
        public static boolean hasCycle(Node<Integer> head) {
            if(head==null|| head.next==null){
                return false;
            }
            Node<Integer>  slow = head;
            Node<Integer>  fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }



    // one more question length of linkedList cycle
    // when it reach slow == fast;
    // travseral slow=slow.next add cnt;
    public  static int cnt(Node<Integer> head){
        if(head==null || head.next==null){
            return 0;
        }
        Node<Integer>  slow = head;
        Node<Integer>  fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                Node<Integer>  temp = slow;
                int cnt=0;
                do{
                    temp = temp.next;
                    cnt++;
                }
                while(temp!=fast);
                return cnt;

//                         int cnt = 1;

//                         slow = slow.next;
//                         while(slow!=fast){
//                                 cnt++;
//                                 slow = slow.next;
//                         }
//                         return cnt;
            }
        }
        return 0;


    }
}



