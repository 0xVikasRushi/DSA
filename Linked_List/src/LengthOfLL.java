

public class LengthOfLL {
	public static int length(Node<Integer> head){
		Node<Integer> temp = head;
		int cnt=0;
		while(temp!=null){
			cnt++;
			temp=temp.next;
		}
		return cnt;
	}
}