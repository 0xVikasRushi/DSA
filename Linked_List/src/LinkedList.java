
public class LinkedList {

    public static void main(String[] args) {
    Node<Integer> head = CreateLL();
        System.out.println("head: "+head.data);
//        Increment(head);
//        delete(head,4);
// printIthNode(head,3);
//        System.out.println(findNode(head,90));
//        System.out.println(findReversiveNode(head,20));
//        head  =  insert(head,0 ,209);
//          head = delete(head,3);
//        System.out.println(isPalindrome(head));
//        head = InsertRecursive(head,30,1);
//        head = deleteNodeRec(head,3);
        System.out.println();
        Print(head);

    }
    //9 2 3 3 2 9
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
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        int cnt=0;
        Node<Integer> AddNode = new Node<Integer>(data);
        Node<Integer> temp = head;
        if(pos==0){
            AddNode.next = head;
            return AddNode;
        } else{

            while(cnt<pos-1 && temp!=null){
                cnt++;
                temp = temp.next;
            }
            if(temp!=null){
                AddNode.next = temp.next;
                temp.next = AddNode;
            }
            return head;
        }

// 10 20 30 40 50
    }
    public static Node<Integer> delete(Node<Integer> head, int pos){
        if(head==null )
            return head;
        if(pos==0)
            return head.next;
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null && count<pos-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;


        return head;
// 10 20 30 40 50
    }


    public static int findNode(Node<Integer> head, int n) {
        Node<Integer> temp = head;
        int cnt=0;
        while(temp!=null){

            if(temp.data==n){
                return cnt;
            }
            cnt++;
            temp = temp.next;
        }
        return -1;


    }




//    public static boolean isPalindrome(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while(temp!=null){
//            temp = temp.next;
//        }
//
//        if(head.data!=temp.data) {
//            return false;
//        }
//        else return isPalindrome(head.next);
//
//    }



}
