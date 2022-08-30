public class Max_subArrays {
    public static void main(String[] args) {
        int[] nums = {2,1,3,3};
        System.out.println(maxSubsequence(nums,2));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int max =0;
        for (int i = 0; i <k ; i++) {
            ans[i]=nums[i];
            max+=nums[i]; // first window
        }
        int current = max;
        for (int i = k; i < nums.length ; i++) {
            current+= nums[i]-nums[i-k];
            max = Math.max(max,current);
        }
        return ans;

    }

}
