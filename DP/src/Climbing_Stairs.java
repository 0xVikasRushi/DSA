import java.util.HashMap;
import java.util.Map;

public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static int climbStairs(int n) {
        // recursive dp
        if (n == 1 || n == 2) {
            return n;
        }
        int ans = 0;
        if (map.containsKey(n - 1)) {
            ans += map.get(n - 1);
        } else {
            ans += climbStairs(n - 1);
        }
        if (map.containsKey(n - 2)) {
            ans += map.get(n - 2);
        } else {
            ans += climbStairs(n - 2);
        }
        map.put(n, ans);
        return ans;
    }
}