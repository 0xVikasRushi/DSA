package strings;

public class String_to_int {
    public static void main(String[] args) {
        String str = "00001231";
//        int b  = convertStringToInt(String.valueOf(str.charAt(0)));
//        System.out.println(5);
        System.out.println(convertStringToInt(str));
    }
    public static int convertStringToInt(String input){
        if(input.length()==1){
            return input.charAt(0)-'0';
        }
        int b = convertStringToInt(String.valueOf(input.charAt(0)));
        return (int) (b * Math.pow(10,input.length()-1) + convertStringToInt(input.substring(1)));
    }
}