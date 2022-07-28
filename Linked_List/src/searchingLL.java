import java.util.Scanner;

public class searchingLL {
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

    static int count1=0;
    public static int findReversiveNode(Node<Integer> head, int n) {
        Node<Integer> temp = head;
        if(temp==null){
            return -1;
        }
        if(temp.data!=n){
            count1++;
            return findReversiveNode(temp.next,n);
        }
        else
            return count1;



    }

}
