public class Symmetric_mirror_check {
    /**
     * // https://leetcode.com/problems/symmetric-tree/
     */

        public boolean isSymmetric(BinaryTreeNode<Integer> root) {
            if(root==null){
                return true;
            }
            return helper(root.left,root.right);
        }
        public boolean helper(BinaryTreeNode<Integer> l,BinaryTreeNode<Integer> r){
            if(l==null || r==null){
                return l==r;
            }
            if(l.data!=r.data){
                return false;
            }
            return helper(l.left,r.right) &&helper(l.right,r.left) ;
        }




}
