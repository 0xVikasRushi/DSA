import java.util.Arrays;
import java.util.Scanner;

public class unique_elements_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println(findUnique(arr1));
            System.out.println(findDuplicate(arr1));

        }
    }
    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            if(i<arr.length && arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    // O(n*logn)
    public static int findUnique(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
           if(i < arr.length-1 && arr[i]==arr[i+1]){
               i++;
           }
           else{
               return arr[i];
           }
        }
        return -1;
    }


// XOR Operator O(n)
//public class FindUnique{
//    public static int findUnique(int[] arr){
//        int ans=arr[0];
//        for(int  i=1;i<arr.length;i++)
//        {
//            ans=ans^arr[i];
//        }
//        return ans;
//    }
//
//}


}
