public class Insertion_deletion_Recursive {
    public static Node<Integer> InsertRecursive(Node<Integer> head,int val, int index){

        if(index==0){
            Node<Integer> temp = new Node<>(val);
            temp.next = head;
            return temp;
        }

        else {
            Node<Integer> smallerPart =  InsertRecursive(head.next,val,index-1);
            head.next = smallerPart;
            return head;
        }
    }
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(head==null) return head; // check for invaild when index exceeds size of LinkedList
        if(pos==0){
            return head.next;
        }

        else{
            Node<Integer> smallerPart = deleteNodeRec(head.next,pos-1);
            head.next = smallerPart;
            return head;
        }
    }
}
