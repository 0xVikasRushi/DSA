import java.util.Arrays;
import java.util.EnumSet;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Two_sum_ii {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public  static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int l = numbers[left];
            int r = numbers[right];
            if(l+r==target){
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
            else if(l+r<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;

    }

//    public  static int binarySerachModity(int[] arr,int target){
//        int start=0;
//        int end = arr.length-1;
//        while(start<end){
//            int middle = start + (end-start)/2;
//            if(arr[middle]==target){
//                return middle;
//            }
//            else if (arr[middle]>target){
//                start = middle+1;
//            }else{
//                end = middle-1;
//            }
//        }
//        return -1;
//    }

}
