public class palindrome_LL {
    public static void main(String[] args) {
        Node<Integer> head = CreateLL();
        System.out.println("head: " + head.data);
        System.out.println(isPalindrome(head));
        Print(head);
    }

    static Node<Integer> left ;
    public static boolean isPalindrome(Node<Integer> head) {
        left = head;
        return helper(head);
    }
    public static  boolean helper(Node right){
        if(right==null){
            return true;
        }

        boolean res = helper(right.next);

        if(!res){
            return false;
        }else if(left.data!=right.data){
            return false;
        }else{
            left = left.next;
            return true;
        }

    }

//    public static boolean isPalindrome(Node<Integer> head) {
//        if(head==null){
//            return true;
//        }
////        1 2 3 4 5
//        Node<Integer> fast = head;
//        Node<Integer> slow = head;
//        Node<Integer> temp = head;
//
//
//        // middle traversal
//        while(fast.next != null && fast.next.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
////        1 2 2 1
//        Node<Integer> rev  = reverse(slow);
//        Node<Integer> temp2  = rev;
//        while(temp2!=null){
//            if(temp.data!=temp2.data){
//                return false;
//            }
//            temp = temp.next;
//            temp2 = temp2.next;
//        }
//
//        return true;
//    }
    public static Node<Integer> reverse(Node<Integer> midpoint){
        Node<Integer> start = null;
        while(midpoint != null) {
            Node<Integer> next = midpoint.next;
            midpoint.next = start;
            start = midpoint;
            midpoint = next;
        }
        return start;
    }
    // function

    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(1);
        Node<Integer> n2 = new Node<Integer>(2);
        Node<Integer> n3 = new Node<Integer>(2);
        Node<Integer> n4 = new Node<Integer>(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void Print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.println("Printing linkedlist : " + temp.data);
            temp = temp.next;
        }
    }
}
