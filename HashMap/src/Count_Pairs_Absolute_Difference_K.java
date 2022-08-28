import java.util.HashMap;
//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/
public class Count_Pairs_Absolute_Difference_K{
    public static void main(String[] args) {
       int[] nums = {1,2,2,1};
        System.out.println(countKDifference(nums,1));
    }
    public static  int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]-k)){
                ans += map.get(nums[i]-k);
            }
        }
        return ans;
    }
}
