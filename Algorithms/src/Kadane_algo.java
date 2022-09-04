public class Kadane_algo {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            sum+=i;
            if(max<sum){
                max =sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    //
}
