import java.util.Arrays;
//https://leetcode.com/problems/contains-duplicate/

// O(n) + O(m*logm) Linear time Complexity
class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                        return true;
                }
        }
            return false;
    }
}