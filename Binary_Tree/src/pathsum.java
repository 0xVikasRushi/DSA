public class pathsum {


    public boolean hasPathSum(BinaryTreeNode<Integer> root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null&&(targetSum==root.data)){
            return true;
        }
        targetSum = targetSum-root.data;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }


}
