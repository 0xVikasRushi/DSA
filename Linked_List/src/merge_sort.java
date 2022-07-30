
class merge_sort {
    public Node<Integer> sortList(Node<Integer> head) {
        if(head==null|| head.next==null){
                return head;
        }
        Node<Integer> Mid = Midpoint(head);
        Node<Integer> First = sortList(head);
        Node<Integer> Second = sortList(Mid);
      
        return mergeTwoLists(First,Second);
            
            
            
    }
    public Node<Integer> mergeTwoLists(Node<Integer> list1, Node<Integer> list2) {

        Node<Integer> ans = new Node<Integer>(0);
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
        public Node<Integer> Midpoint(Node<Integer> head){
            Node<Integer> midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
            Node<Integer> mid = midPrev.next;
        midPrev.next = null;
        return mid;
}
}