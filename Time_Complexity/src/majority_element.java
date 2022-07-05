import java.util.Arrays;
//https://leetcode.com/problems/majority-element/submissions/


//      O(n*logn)
class majority_element  {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
        
        // brute force O(n^2)
//         public int majorityElement(int[] nums) {
//     int n = nums.length;
//         for (int i = 0; i < nums.length-1 ; i++) {
//             for (int j = 0; j <nums.length-1-i ; j++) {
//                 if(nums[j]>nums[j+1]){
//                     int temp =nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;
//                 }
//             }

//         }
    
//       return nums[n/2];
//     }
}