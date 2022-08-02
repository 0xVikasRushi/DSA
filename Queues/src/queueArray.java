public class queueArray {
    private int[] data;
    private int front; // index
    private int rear;
    private int size;
    public queueArray(){
        data = new int[5];
        front =-1;
        rear = -1;
    }
    public queueArray(int size){
        data = new int[size];
        front =-1;
        rear = -1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
//    1 2 3 4
    public void enqueue(int ele) throws QueueArraySizeExceed {
        if(size==0){
            front++;
        }
        if(size== data.length){
            throw new QueueArraySizeExceed();
        }
        rear++;
        data[rear]=ele;
        size++;

    }
    public int front() throws QueueEmptyExpection {
        if(size==0){
            throw new QueueEmptyExpection();
        }
        return data[front];
    }
    public int dequeue() throws QueueEmptyExpection {
        if(size==0){
            throw new QueueEmptyExpection();
        }
         int temp =data[front];
          front++;
          size--;
          if(size==0){
              front =-1;
              rear =-1;
          }

          return temp;
    }

}
