package strings;

public class Reverse_String_char_array {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
    public static void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    static void rev(char[] s,int i,int j){
        if(i>=j){
            return ;
        }
        swap(s,i,j);
        rev(s,++i,--j);
    }
    static void swap(char[] s, int i , int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}