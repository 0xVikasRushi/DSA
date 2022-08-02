import java.util.Stack;

public class Minimum_bracket_Reversal {
    public static void main(String[] args) {
        String str = "}}}{{{";
        System.out.println(countBracketReversals(str));
    }

    public static int countBracketReversals(String input) {
        if (!(input.length() % 2 == 0)) {
            return -1;
        }
        int openB = 0;
        int n=0;
        int cnt = 0;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{') {
                stack.push(ch);
            }
            if (ch == '}') {
                if (stack.isEmpty() || stack.peek() == '}') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
             openB = stack.size();
            n = 0;
            while (!stack.isEmpty() && stack.peek() == '}') {
                stack.pop();
                n++;
            }
            //return ceil(m/2) + ceil(n/2)
        }
        return openB/ 2 + n % 2;
    }
}

