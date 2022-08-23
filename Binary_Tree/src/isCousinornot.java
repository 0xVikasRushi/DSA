public class isCousinornot {
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
    int t1 = depth(root,p,0);
    int t2 = depth(root,q,0);
    return t1==t2; }

    // test case fail
    public static int depth(BinaryTreeNode<Integer> root , int target,int depth)
    {
        if(root==null) return 0;
        if(root.data==target){ return depth; }
        int l = depth(root.left,target,depth+1);
        int r = depth(root.right,target,depth+1);
        return Math.max(l,r); }
  }
  // here it check for cosin means both should not have same parent
//    TreeNode xParent = null;
//    TreeNode yParent = null;
//    int xDepth = -1, yDepth = -1;
//
//    public boolean isCousins(TreeNode root, int x, int y) {
//        getDepthAndParent(root, x, y, 0, null);
//        return xDepth == yDepth && xParent != yParent? true: false;
//    }
//    //get both the depth and parent for x and y
//    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent){
//        if(root == null){
//            return;
//        }
//        if(root.val == x){
//            xParent = parent;
//            xDepth = depth;
//        }else if(root.val == y){
//            yParent = parent;
//            yDepth = depth;
//        }
//        getDepthAndParent(root.left, x, y, depth + 1, root);
//        getDepthAndParent(root.right, x, y, depth + 1, root);
