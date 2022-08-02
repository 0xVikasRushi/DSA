public class queueArray_use {
    public static void main(String[] args) throws QueueArraySizeExceed, QueueEmptyExpection {
        queueArray queue = new queueArray(10);
         queue.enqueue(1);
         queue.enqueue(2);
         queue.enqueue(3);
         queue.enqueue(4);
         queue.enqueue(5);
         queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
    }
}
