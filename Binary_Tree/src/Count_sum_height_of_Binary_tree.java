public class Count_sum_height_of_Binary_tree {
    public static int countNodes(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+ countNodes(root.left) + countNodes(root.right);
    }
    public static int getSum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return root.data + getSum(root.left) + getSum(root.right);
    }
    public static int height(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(l>r){
            return l+1;
        }return r+1;
    }


}
