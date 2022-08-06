
// https://leetcode.com/problems/same-tree/
class same_tree_check {
    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if(p==null && q==null){
                return true;
        }
        if(q==null || p==null){
                return false;
        }
        if(q.data!=p.data){
                return false;
        }
            
           
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
              

    }
}