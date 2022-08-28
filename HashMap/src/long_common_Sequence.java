import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class long_common_Sequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
        }

        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : arr){
            if(!map.containsKey(i-1)){
                int cnt= 0;
                int num = i;
                while(map.containsKey(num)){
                    cnt++;
                    ans.add(num);
                    num++;
                }
                max = Math.max(max,cnt);
            }
        }
        return ans;
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for(int i : nums){
            if(!map.containsKey(i-1)){
                int cnt= 0;
                int num = i;
                while(map.containsKey(num)){
                    cnt++;
                    num++;
                }
                max = Math.max(max,cnt);
            }
        }

        return max;
    }
}
