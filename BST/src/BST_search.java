import com.sun.source.tree.BinaryTree;

public class BST_search {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        else if (root.data<k){
            return searchInBST(root.right,k);
        }
        else  return searchInBST(root.left,k);
    }
}
