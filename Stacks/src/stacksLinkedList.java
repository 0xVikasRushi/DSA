
public class stacksLinkedList<T> {
    private Node<T> head;
    private int size;

    public stacksLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T ele) throws stacksfullExpcepton {
        Node<T> temp = new Node<>(ele);
        temp.next = head;
        head = temp;
        size++;
    }

    public T top() throws stacksfullExpcepton {
        if (head == null) {
            throw new stacksfullExpcepton();
        }
        return head.data;
    }

    public T pop() throws stacksfullExpcepton {
        if (head == null) {
            throw new stacksfullExpcepton();
        }
            T temp = head.data;
            head = head.next;
            size--;
            return temp;


    }
}