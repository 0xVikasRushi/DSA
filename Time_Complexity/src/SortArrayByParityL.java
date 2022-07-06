import java.util.Arrays;
//https://leetcode.com/problems/sort-array-by-parity/
class SortArrayByParityL {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public  static int[] sortArrayByParity(int[] nums) {
        int i=0; // optimal solution
        int j=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return nums;

        // O(n1 + n2) + O(nlogn)
        // Time complexity is O(n)
//        int[] ans = new int[nums.length];
//        int k=0;
//        for (int i = 0; i < nums.length ; i++) {
//        if((nums[i]&1)==0){
//            ans[k] = nums[i];
//            k++;
//        }
//        }
//        for (int i = 0; i < nums.length ; i++) {
//            if(!((nums[i]&1)==0)){
//                ans[k] = nums[i];
//                k++;
//            }
//        }
//        return ans;



    }
    static void swap(int[] nums,int f, int s ){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}