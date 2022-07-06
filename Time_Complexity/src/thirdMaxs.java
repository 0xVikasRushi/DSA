import java.util.Arrays;
import java.util.HashSet;
class thirdMaxs {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j = 0;
        for (Integer i: set) {
            nums[j++] = i;
        }
        if(nums.length<3){
            return nums[nums.length-1];
        }else
            return nums[nums.length-3];

    }
}