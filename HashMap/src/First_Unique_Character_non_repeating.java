import java.util.HashMap;

public class First_Unique_Character_non_repeating {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
    public static  int firstUniqChar(String s) {
        HashMap<Character,Integer> map =new HashMap();
        StringBuilder ans  = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
