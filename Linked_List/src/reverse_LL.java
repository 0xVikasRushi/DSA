public class reverse_LL {
    public static void main(String[] args) {
        Node<Integer> head = CreateLL();
        System.out.println("head: " + head.data);
//        head = reverse_I(head);
        head = midPoint(head);

        Print(head);

    }
    public static Node<Integer> midPoint(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.next==null){
            return head;
        }
        Node<Integer> slowP = head;
        Node<Integer> fastP = head;
        while(fastP!=null && fastP.next!=null){
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        return slowP;
    }

    public static Node<Integer> reverse_I(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> prev = null;
        Node<Integer> pres = head;
        Node<Integer> NextNode = pres.next;
        while(pres!=null){
            pres.next=prev;
            prev = pres;
            pres = NextNode;
            if(NextNode!=null){
                NextNode = NextNode.next;
            }
        }
        return prev;

    }
    //18-21-9-4-10-15
    // int mains = sc.nextInt();
    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(18);
        Node<Integer> n2 = new Node<Integer>(21);
        Node<Integer> n3 = new Node<Integer>(9);
        Node<Integer> n4 = new Node<Integer>(4);
        Node<Integer> n5 = new Node<Integer>(10);
        Node<Integer> n6 = new Node<Integer>(15);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
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
