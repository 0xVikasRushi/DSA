import java.util.Scanner;

public class LLinput {
    public static void main(String[] args) {
        System.out.println(input());

    }

    public static Node<Integer> input(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null,tail=null;
        while(data!=-1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head==null){
                head=currentNode;
                tail = currentNode;
            }else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data  = sc.nextInt();
        }
        return head;
    }




}
