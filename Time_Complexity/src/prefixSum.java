import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    //https://leetcode.com/problems/find-pivot-index/
    public static int pivotIndex(int[] nums) {
        int sum=0;
        for(int i: nums) {
            sum+=i;
        }
        System.out.println(sum);
        int lsum = 0;
        int rsum = sum;
        for (int i = 0; i < nums.length ; i++) {
            rsum-=nums[i];
            if(lsum==rsum) return i;
            else lsum+=nums[i];
        }
        return -1;
    }
}
