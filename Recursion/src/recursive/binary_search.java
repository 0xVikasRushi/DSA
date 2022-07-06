package recursive;

public class binary_search {
    public static void main(String[] args) {
        int[] nums = {-22,-21,-12,-6,0,1,2,3,4,5,6};
        int target =6;
        int ans = Binary_search(nums,target);
//        System.out.println(ans);
        System.out.println(Usiug_rescurive_Binary_search(nums,target,0,nums.length-1));
    }
    static int Usiug_rescurive_Binary_search(int[] nums, int target,int start,int end) {
        int middle = start + (end-start)/2;
        if(start>nums.length-1){
            return -1;
        }
        if(target==nums[middle]){
            return middle;
        }
        else if(target>nums[middle]){
            return Usiug_rescurive_Binary_search(nums,target,middle+1,end);
        }
//        if(target<nums[middle]){
        else{
            return Usiug_rescurive_Binary_search(nums,target,start,middle-1);
        }

    }

// O(nlogn)
    static int Binary_search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int middle;
        while(start<=end){
            middle = (end-start)/2 + start;
            if(target<nums[middle]){
                end = middle-1;
            }
            if(target>nums[middle]){
                start= middle+1;
            }
            if(target==nums[middle]){
                return middle;
            }

        } return -1;

    }
}
