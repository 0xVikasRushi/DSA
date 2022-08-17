
public class SortedArray_toBST {


    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root  = SortedArrayToBST(nums,nums.length-1);
        print.Print(root);
    }
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return helper(arr,0,n-1);
           
		}
    	public static BinaryTreeNode<Integer> helper(int[] arr, int s , int e){
            if(s>e) return null;
            int middle  = (s+e)/2;
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[middle]);
            root.left  =  helper(arr,s,middle-1);
            root.right =  helper(arr,middle+1,e);
            return root;
        }
	}