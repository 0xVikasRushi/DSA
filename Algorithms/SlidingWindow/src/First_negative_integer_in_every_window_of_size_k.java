// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class First_negative_integer_in_every_window_of_size_k {
    public static void main(String[] args) {
        int[] nums = {-8, 2, 3, -6, 10};
        printFirstNegativeInteger(nums,nums.length,2);
    }
    public static void  printFirstNegativeInteger(int[] arr, int n, int k)
    {
        int firstNegativeIndex = 0;
        int firstNegativeElement;

        for(int i = k - 1; i < n; i++)
        {

            // Skip out of window and positive elements
            while ((firstNegativeIndex < i ) &&
                    (firstNegativeIndex <= i - k ||
                            arr[firstNegativeIndex] >= 0))
            {
                firstNegativeIndex ++;
            }

            // Check if a negative element is
            // found, otherwise use 0
            if (arr[firstNegativeIndex] < 0)
            {
                firstNegativeElement = arr[firstNegativeIndex];
            }
            else
            {
                firstNegativeElement = 0;
            }
            System.out.print(firstNegativeElement + " ");
        }


    }
}
