public class sort012 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(nums.toString());
    }
    public static void sortColors(int[] nums) {
        int i =0;
        int j =nums.length-1;
        while(i<j){
            if(nums[i]>nums[j]){
                swap(nums,i,j);
                i++;
                --j;
            }else if(nums[i]==nums[j]){
                i++;
            }
            else{
                i++;
                --j;
            }
        }
    }
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
