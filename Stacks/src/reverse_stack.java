import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        int[] data = {1,2,3};
        for(int ele : data){
            stack.push(ele);
        }
        reverseStack(stack,helper);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    static int revcnt=0;
    public static Stack reverse_stack(Stack stack, Stack helper){

        while(!stack.isEmpty()){
            helper.push(stack.pop());

        }
        return helper;
    }
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
        if(input.isEmpty()){
            return;
        }
        int temp = input.peek();
        extra.push(temp);
        input.pop();
        reverseStack(input,extra);
        while(!extra.isEmpty()){
            System.out.print(extra.peek()+" ");
            extra.pop();
        }
    }
}
//5
//4
//3
//2
//1