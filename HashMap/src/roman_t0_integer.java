import java.util.HashMap;
import java.util.Set;
// https://leetcode.com/problems/roman-to-integer/
public class roman_t0_integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = map.get(s.charAt(s.length()-1));
        for (int i = 0; i <s.length()-1; i++) {
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }else ans+=map.get(s.charAt(i));
        }
        return ans;
    }
}
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.