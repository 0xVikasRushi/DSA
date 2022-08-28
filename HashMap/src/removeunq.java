import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeunq {
    public static void main(String[] args) {
        String s = "ababacd";
        // a b  d c
        System.out.println(uniqueChar(s));
    }
    public static String uniqueChar(String str){
        HashMap<Character,Integer> map =new HashMap();
        StringBuilder ans  = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            if(!map.containsKey(str.charAt(i))){
                ans.append(str.charAt(i));
                map.put(str.charAt(i),1);
            }
        }

        return ans.toString();
    }
}
