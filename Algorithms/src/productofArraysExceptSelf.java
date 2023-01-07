import java.util.Arrays;

public class productofArraysExceptSelf {
    public static void main(String[] args) {

           int[] nums  = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    } //? TLE should change to o(n**2) to o(n)

        public static int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            for(int i = 0 ;i<nums.length;i++){
                ans[i] = product(nums,i);
            }
            return ans;
        }
        public static int product(int[] nums,int index){
            int i =0;
            int j =nums.length-1;
            int singleProduct=1;
            while(i<index){
                if(nums[i]==0 || singleProduct==0){
                    return 0;
                }
                int n1=1;
                if(index!=i){
                    n1 = nums[i];
                }
                singleProduct =  singleProduct * n1 ;
                i++;
            }
            while(j>index){
                if(singleProduct==0 || nums[j]==0){
                    return 0;
                }
                int n2=1;
                if(index!=j){
                    n2 = nums[j];
                }
                singleProduct =  singleProduct  * n2;
                j--;
            }
            return singleProduct;

        }

}
