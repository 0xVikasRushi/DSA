package recursive;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5};
        System.out.println(sum(nums));
    }
    static int sum=0;
    static int n=0;
    public static int sum(int input[]) {
        if(input.length==1){
            return input[0];
        }
       if(input.length==n){
           return sum;
       }
        return input[n++] + sum(input);

    }
}
