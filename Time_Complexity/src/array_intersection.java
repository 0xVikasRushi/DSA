import java.util.Arrays;
import java.util.Scanner;


public class array_intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            intersection(arr1, arr2);
        }
    }

    public static void intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2);

    }
    private static void merge(int arr1[] ,int arr2[]) {
        int i = 0, j = 0;
        System.out.println();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
    public static int Binary_search(int[] nums,int target){
            int middle;
            int s = 0;
            int e = nums.length - 1;
            middle = (s + e) / 2;


            while (s <= e) {
                middle = s + (e - s) / 2;
                if (target < nums[middle]) {
                    e = middle - 1;
                }
                if (target > nums[middle]) {
                    s = middle + 1;
                }
                if (target == nums[middle]) {
                    return nums[middle];
                }

            }
            return -1;
        }

    }

//    public static void main(String[] args) {
//        // Duplicate elements are missing in binary approach
//////        System.out.println(Arrays.binarySearch(arr1,32));
////        System.out.println();
////        for (int i = 0; i < arr2.length; i++) {
////            int b = Binary_search(arr1, arr2[i]);
////            if (b != -1) {
////                System.out.print(b + " ");
////            }
////        }
//
//
//    }

