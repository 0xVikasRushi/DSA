public class Binary_tree_data_search {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        return isNodePresent(root.left, x) || isNodePresent(root.right, x);
    }
    public static BinaryTreeNode<Integer> isNodePresentwithX(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return null;
        }
        if (root.data == x) {
            return root;
        }
        BinaryTreeNode<Integer> l = isNodePresentwithX(root.left, x);
        BinaryTreeNode<Integer> r =  isNodePresentwithX(root.right, x);
        return null;
    }
}
