public class isBalancedTree {

    /**
     * // best case O(n) = kn + 2O(n/2) == O(nlogn); same as merge sort
     * // worst case O(n) = kn + O(n-1) == O(n^2) same as insertion , bubble
     * Got tle for bigger input
     * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
     * https://leetcode.com/problems/balanced-binary-tree/
     */
    public boolean isBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int h1 = height(root.left);
        int h2 = height(root.right);
        if(Math.abs(h1-h2) >1){
            return false;
        }
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        return l && r ;

    }


    public int height(BinaryTreeNode<Integer> root)    {
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(l>r){
            return l+1;
        }
        return r+1;
    }
}
