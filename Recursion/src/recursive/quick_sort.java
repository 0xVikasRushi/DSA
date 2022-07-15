package recursive;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2,9,8,7};
        Quick_sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void Quick_sort(int[] nums,int first, int last){
        if(first>=last){
            return;
        }
        int start = first;
        int end = last;
        int middle = start + (end -start)/2;
        int pElement  = nums[middle];
        while(start<=end){
            while(nums[start]<pElement){
                start++;
            }
            while(nums[end]>pElement){
                end--;
            }
            if(start<=end){
                int temp  = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        Quick_sort(nums,first,end);
        Quick_sort(nums,start,last);
    }

}
