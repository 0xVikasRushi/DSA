public class DoubleBinaryTree {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root==null) return;
        BinaryTreeNode<Integer> dup = new  BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = dup;
        dup.left = temp;
        insertDuplicateNode(dup.left);
        insertDuplicateNode(root.right);
        return;
    }
}
