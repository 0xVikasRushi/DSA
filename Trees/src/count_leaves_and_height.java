public class count_leaves_and_height {
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root==null) return 0;
        int cnt =0;
        if(root.children.isEmpty()){
            cnt++;
        }
        for (int i = 0; i < root.children.size() ; i++) {
            cnt+=countLeafNodes(root.children.get(i));
        }
        return cnt;
    }

    //    public static int getHeight(TreeNode<Integer> root){
//        if(root==null) return 0;
//        int height = 0;
//        if(root!=null){
//            height++;
//        }
//        int n = root.children.size();
//        int[] ans = new int[n];
//        for (int i = 0; i < root.children.size(); i++) {
//            height += getHeight(root.children.get(i));
//        }
//
//
//    }

}
