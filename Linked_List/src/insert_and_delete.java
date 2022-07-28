public class insert_and_delete {
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
}
