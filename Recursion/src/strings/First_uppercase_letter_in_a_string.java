package strings;

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String str = "ivjnsNDGN";
        System.out.println(firstCapital(str, 0));
    }

    static char firstCapital(String str, int n) {
        if (str.charAt(n) >= 'A' && str.charAt(n) <= 'Z') {
            return str.charAt(n);
        }
        if (str.length() - 1 == n) {
            return ' ';
        }
        return firstCapital(str, n + 1);
    }
}