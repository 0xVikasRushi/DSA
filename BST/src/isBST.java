public class isBST {
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root==null) return true;
        int l = maxval(root.left);
        int r = minval(root.right);
        if(l>=root.data) return false;
        if(r< root.data) return false;
        boolean left = isBST(root.left);
        boolean right = isBST(root.right);
        return left && right;
    }
    public static int minval(BinaryTreeNode<Integer> root){
        if(root==null) return Integer.MAX_VALUE;
        int l = minval(root.left);
        int r = minval(root.right);
        return Math.min(Math.min(l,r),root.data);
    }
    public static  int maxval(BinaryTreeNode<Integer> root) {
        if (root == null) return Integer.MIN_VALUE;
        int l = maxval(root.left);
        int r = maxval(root.right);
        return Math.max(Math.max(l, r), root.data);
    }
    // range compare with max of long values[long max,long min]
    public static boolean isValidBST(BinaryTreeNode<Integer> root) {
        return helper(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean helper(BinaryTreeNode<Integer> root,long min,long max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max) {
            return false;
        }
        boolean l = helper(root.left , min , root.data);
        if(l==false) {
            return false;
        }
        boolean r = helper(root.right,root.data,max);
        return r;
    }

    }
