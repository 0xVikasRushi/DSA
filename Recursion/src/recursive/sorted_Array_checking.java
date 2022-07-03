package recursive;

public class sorted_Array_checking {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(sorted_check(nums,0));
    }
    static boolean sorted_check(int[] nums,int start){
        if(start == nums.length-1){
            return true;
        }
        return (nums[start]<nums[start+1]) && sorted_check(nums,start+1);
    }
}