public class AppendNtoLast {

    public static void main(String[] args) {
        Node<Integer> head = CreateLL();
        System.out.println("head: " + head.data);
//        head = removeDuplicates(head);
        printReverse(head);
        Print(head);
    }

    public static void printReverse(Node<Integer> root) {
        if (root == null) return;
        printReverse(root.next);
        System.out.println(root.data);

    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head==null|| head.next==null){
            return head;
        }
        Node<Integer> temp = head;
        while(temp!=null){
            if(temp.next==null){
                break;
            }
            if(temp.data==temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
//
//
//        if(head==null)
//            return head;
//        if(head.next==null)
//            return head;
//        LinkedListNode<Integer> t1=head,t2=head.next;
//        LinkedListNode<Integer> finalhead=head;
//        while(t2!=null){
//            if(t1.data.equals(t2.data))
//            {
//                t2=t2.next;
//            }
//            else{
//                t1.next=t2;
//                t1=t2;
//            }
//        }
//
//        t1.next=null;
//        return finalhead;
    }


//    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

    //    }

    public static void Print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.println("Printing linkedlist : " + temp.data);
            temp = temp.next;
        }
    }

    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(4);
        Node<Integer> n2 = new Node<Integer>(1);
        Node<Integer> n3 = new Node<Integer>(7);
        Node<Integer> n4 = new Node<Integer>(8);
        Node<Integer> n5 = new Node<Integer>(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }
}
