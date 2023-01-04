import java.util.Arrays;

public class sort012 {
    // dutch national flag algorithm
    public static void main(String[] args) {
        int[] nums ={2,0,0,1,1,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public  static void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
