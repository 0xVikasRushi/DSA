public class delete_alternate_nodes {

    public static void main(String[] args) {
        Node<Integer> head = CreateLL();
        System.out.println("head: " + head.data);
        head = deleteAlternateNodes(head);
        Print(head);


    }
    public static Node<Integer> deleteAlternateNodes(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> temp = head;
        while(temp!=null && temp.next!=null){
           temp.next = temp.next.next;
           temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        Node<Integer> n6 = new Node<Integer>(60);
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
