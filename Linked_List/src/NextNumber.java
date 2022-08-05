// Given a large number represented in the form of a linked list.
// Write code to increment the number by 1 in-place(i.e. without using extra space).
// Sample Input 1 :
//3 9 2 5 -1
//Sample Output 1 :
//3 9 2 6
//Sample Input 2 :
//9 9 9 -1
//Sample Output 1 :
//1 0 0 0

public class NextNumber {
    public static void main(String[] args) {
        Node<Integer> head = CreateLL();
        System.out.println("head: " + head.data);
        head =  nextLargeNumber(head);
        Print(head);

    }

        public static Node<Integer> nextLargeNumber(Node<Integer> head) {
            Node<Integer> temp = reverse_I(head);
            Node<Integer> current1 = temp;
            Node<Integer> prev = null;
            Node<Integer> present = temp;

            int carry =0;
            while(present!=null){
                int sum=0;
                if(prev==null){
                    sum = present.data +1;
                }else{
                    sum = carry + present.data;
                }
                carry = sum/10;
                present.data  = sum%10;
                prev = present;
                present = present.next;
            }
            if(carry==1){
                Node<Integer> ans = new  Node<Integer>(1);
                prev.next = ans;
            }
            return reverse_I(current1);
        }
        public static  Node<Integer> reverse_I( Node<Integer> head){

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

    public static Node<Integer> CreateLL(){
        Node<Integer> n1 = new Node<Integer>(9);
        Node<Integer> n2 = new Node<Integer>(9);
        Node<Integer> n3 = new Node<Integer>(9);
//        Node<Integer> n4 = new Node<Integer>(8);
//        Node<Integer> n5 = new Node<Integer>(3);
        n1.next=n2;
        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
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
