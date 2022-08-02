public class StacksArrays_use {
    public static void main(String[] args) throws stacksfullExpcepton {
        stacksArrays stack  = new stacksArrays(2);
        int[] arr = {1,2,3,4,5,6};
        for(int i: arr){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
