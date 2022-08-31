import java.util.ArrayList;
public class Priority_Queue<T> {
    private ArrayList<Element<T>> heap;
    public Priority_Queue(){
        heap = new ArrayList<>();
    }
    public void insert(T value,int priority) throws PriorityQueueException {
        Element<T> ele = new Element<>(value,priority);
        heap.add(ele);
        int childindex = heap.size()-1;
        int parent  = (childindex-1)/2;

        while(childindex>0){
            if(heap.get(parent).priority > heap.get(childindex).priority){
              Element<T> temp = heap.get(childindex);
              heap.set(childindex,heap.get(parent));
              heap.set(parent,temp);
            }else{
                return;
            }
        }
    }
    public T getMin() throws PriorityQueueException {
        if(isEmpty()){
           throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }
    public boolean isEmpty(){
        return heap.size()==0;
    }
    public int size(){
        return heap.size();
    }

}
