
public class no_of_leaves_and_largest {

    public static int noofleaf(BinaryTreeNode<Integer> root){
    if(root==null){
        return 0;
    }
    if(root.left==null && root.right==null){
        return 1;
    }
    return noofleaf(root.left) + noofleaf(root.right);

}
    public static int LargestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestL = LargestNode(root.left);
        int largestR = LargestNode(root.right);
        return largestL + largestR;
    }


}
