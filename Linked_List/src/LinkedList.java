
public class LinkedList {

    public static void main(String[] args) {
    Node<Integer> head = CreateLL();
        System.out.println("head: "+head.data);
//        Increment(head);
        PrintingLL(head);
        printIthNode(head,3);
    }
    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }
    public static void PrintingLL(Node<Integer> head){
       Node<Integer> temp = head;
        while(temp!=null){
            System.out.println("Printing linkedlist : " + temp.data);
            temp = temp.next;
        }
    }
    public static void Increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }
    public static void printIthNode(Node<Integer>head, int i){
        int count=0;
        Node<Integer> temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
            if(count==i){
                System.out.println(temp.data);
                break;
            }
        }

    }


}
