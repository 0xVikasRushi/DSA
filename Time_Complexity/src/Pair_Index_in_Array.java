import java.util.Arrays;
import java.util.Scanner;

public class Pair_Index_in_Array {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int sum = sc.nextInt();
//			System.out.println(pairSum(arr,sum));
			System.out.println(tripletSum(arr,sum));
		}
	}
	public static int tripletSum(int[] arr, int num) {
		int count=0;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length ; j++) {
				for (int k = j+1; k <arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == num){
						count++;
					}
				}
			}
		}
		return count;
	}
	// O(n^2) not a optimal solution
//	public static int pairSum(int[] arr, int num) {
////		int count=0;
////		for (int i = 0; i < arr.length ; i++) {
////			for (int j = i+1; j < arr.length ; j++) {
////				if(arr[i] + arr[j] == num){
////					count++;
////				}
////			}
////		}
////		return count;
////	}


//	public static int pairSum(int[] arr, int num) {
//		Arrays.sort(arr);
//
//	}
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