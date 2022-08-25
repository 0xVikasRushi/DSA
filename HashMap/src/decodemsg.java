import java.util.HashMap;
import java.util.Set;

public class decodemsg {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String decode = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,decode));
    }

    public static  String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ","");
        char ch = 'a';
        for (int i = 0; i < key.length() ; i++) {
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch++);
            }
        }
        for (int i = 0; i < message.length(); i++) {
            if(map.containsKey(message.charAt(i))){
                ans.append(map.get(message.charAt(i)));
            }
            else{
                ans.append(message.charAt(i));
            }
        }
        return ans.toString();
    }
//    public static  String decodeMessage(String key, String message) {
//        HashMap<Character,Character> map = new HashMap<>();
//        String ans = "";
//
//        String newkey = "";
//        for (int j = 0; j < key.length() ; j++) {
//            if (key.charAt(j)!=' '){
//                newkey+=key.charAt(j);
//            }
//        }int i =0;
//        for (char ich = 97 ; ich <= 122; ich++) {
//            map.put(newkey.charAt(i),ich);
//            i++;
//        }
//
//        for (int j = 0; j < message.length() ; j++) {
//            if(map.containsKey(message.charAt(j))){
//                ans +=map.get(message.charAt(j));
//            }else{
//                ans+=" ";
//            }
//        }
//
//        return ans;
//        }





}
