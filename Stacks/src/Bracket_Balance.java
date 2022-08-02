import java.util.Stack;

public class Bracket_Balance {

    public static void main(String[] args) {
        String str = "{[(}}}";
        System.out.println(isBalanced(str));
    }
    // (
    // [
    // {


    public static boolean isBalanced(String s) {
        if (!(s.length() % 2 == 0)) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')' || s.charAt(i)==']' || s.charAt(i)=='}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop()== s.charAt(i)) {
                    stack.pop();
                }
            }
        }return stack.isEmpty();
    }
}