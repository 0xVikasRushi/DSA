package strings;

public class remove_char {
    public static void main(String[] args) {
//        System.out.println(removeX("abcxxs"));
//        System.out.println(Replace("vikas",'v','i'));
        System.out.println(ReplacePi("abcppi"));
    }
    public static String ReplacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            System.out.println(s);
            return  "3.14" +ReplacePi(s.substring(2));
        }

        else {
            System.out.println(s);
            return s.charAt(0)+ ReplacePi(s.substring(1));

        }

    }


















    public static String removeX(String input){
        if(input.length()==0){
            return input;
        }
        if(input.charAt(0)=='x'){
            return removeX(input.substring(1));
        }
        else {
            return input.charAt(0) + removeX(input.substring(1)) ;
        }

    }

    public static String Replace(String input,char a , char b){
        if(input.length()==0){
            return input;
        }
        String ans = Replace(input.substring(1),a,b);
        if(input.charAt(0)==a){
            return b + ans;
        }
        else{
            return input.charAt(0) + ans;
        }

    }




}
