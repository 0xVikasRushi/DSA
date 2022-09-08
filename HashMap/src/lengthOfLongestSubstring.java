import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map  = new HashMap<>();
        int i = 0;
        int j = 0;
        int max =0;
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
                max  = Math.max(max,map.size());
                j++;
            }
            else if(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }

        }

        return max;
    }
}
