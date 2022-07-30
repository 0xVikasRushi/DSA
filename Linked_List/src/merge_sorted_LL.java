
public class merge_sorted_LL {
    public Node<Integer> mergeTwoLists(Node<Integer> list1, Node<Integer> list2) {

        Node<Integer> ans = new Node(0);
        Node<Integer> head = ans;
        while(list1!=null && list2!=null){
            if(list1.data<list2.data)
            {
                ans.next = list1;
                list1 =list1.next;
            }

            else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        if(list1!=null){
            ans.next = list1;

        }
        if(list2!=null){
            ans.next = list2;

        }


        return head.next;

    }
}
