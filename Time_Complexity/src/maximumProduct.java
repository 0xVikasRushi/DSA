import java.util.Arrays;
class maximumProduct {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

        // Sorting finding max1 min1 min2 or max1 max2 max3
        Arrays.sort(nums);
        int end =  nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int first = nums[0]*nums[1]*nums[nums.length-1];
        if(first>end){
            return first;
        }
        return end;
    }
}

