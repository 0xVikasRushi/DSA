public class insert_and_delete_iterative {
    public static void insert(Node<Integer> head, int pos, int data){
        int cnt=0;
        Node<Integer> AddNode = new Node<Integer>(data);
        Node<Integer> temp = head;
        if(pos==0){
            AddNode.next = head;
            head = AddNode;
        }
        while(cnt<pos-1){
            cnt++;
            temp = temp.next;
        }
        AddNode.next = temp.next;
        temp.next = AddNode;


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
}
