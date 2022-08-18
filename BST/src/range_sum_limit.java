class range_sum_limit {
    // https://leetcode.com/problems/range-sum-of-bst/
     
    public int rangeSumBST(BinaryTreeNode<Integer> root, int low, int high) {
        if(root==null) return 0;
        if(low<=root.data && high>=root.data){
                return root.data +  rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }
        else if(root.data<low){
                return  rangeSumBST(root.right,low,high);
        }else{
                return rangeSumBST(root.left,low,high);
        }
    }
}