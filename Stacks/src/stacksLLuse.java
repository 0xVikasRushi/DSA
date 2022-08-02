public class stacksLLuse {
    public static void main(String[] args) throws stacksfullExpcepton {
        stacksLinkedList<Integer> stack1 = new stacksLinkedList<>();
        stack1.push(1131);
        stack1.push(123111);
        stack1.push(1121);
        stack1.push(112);
        System.out.println(stack1.top());
        System.out.println(stack1.isEmpty());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.pop());



        stacksLinkedList<Integer> stack2 = new stacksLinkedList<>();
        int[] data = {1,2,3,4,5,6};
        for(int i : data){
            stack2.push(i);
        }
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }
}
