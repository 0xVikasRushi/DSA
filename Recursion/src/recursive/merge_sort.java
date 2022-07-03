package recursive;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,15,5,6};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int mid = arr.length/2;
        int[] x = new int[mid];
        int[] y = new int[arr.length - mid];

        for (int i = 0; i < mid ; i++) {
            x[i]=arr[i];
        }
        int k=0;
        for (int j = mid; j < arr.length ; j++) {
         y[k] = arr[j];
         k++;
        }
        mergesort(x);
        mergesort(y);
        merge(arr,x,y);
    }
    static void merge( int[] input,int[] part1 , int[] part2){
        int i=0,j=0,k=0;
        while(i<part1.length && j<part2.length){
            if(part1[i]<part2[j]){
                input[k] = part1[i];
                i++;k++;
            }else{
                input[k] = part2[j];
                k++;j++;
            }
        }
        while(i<part1.length){
            input[k] = part1[i];
            i++;k++;
        }
        while(j<part2.length){
            input[k] = part2[j];
            k++;j++;
        }
    }
}
