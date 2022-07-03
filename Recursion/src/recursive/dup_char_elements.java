package recursive;

public class dup_char_elements {
    public static void main(String[] args) {
        String str  = "aabccba";
        System.out.println(removeConsecutiveDuplicates(str));
    }
    // String Recursion
    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()<=1)
            return s;
        if(s.charAt(0)==s.charAt(1))
            return removeConsecutiveDuplicates(s.substring(1));
        else
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));

    }

}
