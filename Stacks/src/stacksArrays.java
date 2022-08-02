public class stacksArrays {

    private int[] data;
    int topIndex;
    public stacksArrays (){
        data = new int[10];
        topIndex = -1;
    }
    public stacksArrays (int size){
        data = new int[size];
        topIndex = -1;
    }
    public void push(int elem) throws stacksfullExpcepton {
        if(topIndex== data.length-1){
//           stacksfullExpcepton e = new stacksfullExpcepton();
//           throw e;
             doubleCapicity();
        }
        topIndex++;
        data[topIndex] = elem;
    }

    private void doubleCapicity() {
        System.out.println("Printing Double Capacity");
        int [] temp = data;
        data = new int[2*data.length];
        for (int i = 0; i < temp.length; i++) {
            data[i]=temp[i];
        }
    }


    public int pop() throws stacksfullExpcepton {
        if(topIndex== data.length-1){
            stacksfullExpcepton e = new stacksfullExpcepton();
            throw e;
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
    public int size() throws stacksfullExpcepton {
        if(topIndex== data.length-1){
            stacksfullExpcepton e = new stacksfullExpcepton();
            throw e;
        }
        return data.length;
    }
    public int top(){

        return data[topIndex];
    }
    public boolean isEmpty(){
        if (topIndex==-1){
            return true;
        }else{
            return false;
        }
    }

}