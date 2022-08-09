public class diameter_Binarytree {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int diameter = height(root.left) + height(root.right);
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        // 1+ for adding for centeral node
        return 1+Math.max(diameter,Math.max(l,r));
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int h = height(root.left);
        int r = height(root.right);
        return Math.max(h,r)+1;
    }
}
