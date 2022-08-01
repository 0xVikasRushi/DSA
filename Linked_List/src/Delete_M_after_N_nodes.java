import java.util.InputMismatchException;

public class Delete_M_after_N_nodes {





	public static void main(String[] args) {
		Node<Integer> head = CreateLL();
		System.out.println("head: " + head.data);
		head  = DeleteNode(head,2,4);

		Print(head);
	}

//	public static  Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
//    	Node<Integer> temp = head;
//		while(temp!=null){
//
//		}
//
//	}



	public static Node<Integer> DeleteNode(Node<Integer> head, int start, int end){
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = head;
		int count1=1;
		int count2=1;
		while(temp1!=null){
			temp1 = temp1.next;
			count1++;
			if(count1==start){
				temp1.next = null;
				break;
			}
		}
		while(temp2!=null){
			temp2 = temp2.next;
			count2++;
			if(count2==start){
				temp2.next = null;
				break;
			}
		}
		temp1.next = temp2;
		return temp1;

	}













	public static Node<Integer> CreateLL(){
		Node<Integer> n1 = new Node<Integer>(4);
		Node<Integer> n2 = new Node<Integer>(1);
		Node<Integer> n3 = new Node<Integer>(7);
		Node<Integer> n4 = new Node<Integer>(8);
		Node<Integer> n5 = new Node<Integer>(3);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
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